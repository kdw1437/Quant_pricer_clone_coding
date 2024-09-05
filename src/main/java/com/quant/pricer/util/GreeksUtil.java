package com.quant.pricer.util;

import com.quant.pricer.calculator.Calculator;
import com.quant.pricer.common.greek.GreekInput;
import com.quant.pricer.common.input.*;
import com.quant.pricer.common.output.CalculationOutput;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class GreeksUtil {

    private static final Logger LOG = LoggerFactory.getLogger(GreeksUtil.class);

    public static ConcurrentHashMap<String, CalculationInput> generateInputs(CalculationInput baseInput,
                                                                             List<Underlying> underlyings,
                                                                             List<AbstractMarketData> vols,
                                                                             List<Corr> corrs,
                                                                             List<YieldCurve> curves,
                                                                             List<YieldCurve> discountCurves,
                                                                             List<YieldCurve> riskfreeCurves,
                                                                             List<HWModelParameter> hws,
                                                                             List<VolCurve> capvols,
                                                                             List<VolSurface> swaptionVols
                                                                             ) throws Exception {
        GreekLevel greekLevel = baseInput.getGreekLevel();

        if (greekLevel == null)
            throw new IllegalArgumentException("There is no Greek Level Information.");

        List<GreekCalculationMethod> greekCalculationMethods = baseInput.getGreekLevel().getGreekCalculationMethods()
                .getGreekCalculationMethod();
        //SensitivityType List type 참조변수 sensitivityTypes 생성 후, 새롭게 만든 ArrayList 참조.
        List<SensitivityType> sensitivityTypes = new ArrayList<>();
        for (GreekCalculationMethod method : greekCalculationMethods)
            sensitivityTypes.add(method.getSensitivityType());

        ConcurrentHashMap<String, CalculationInput> inputs = new ConcurrentHashMap<>();

        if (sensitivityTypes.contains(SensitivityType.PV_01)) {

            boolean tenorPV01Flag = sensitivityTypes.contains(SensitivityType.TENOR_PV_01);

            inputs = generateInputForPV01(baseInput, greekLevel, tenorPV01Flag, curves, inputs);
        }

        if (sensitivityTypes.contains(SensitivityType.MODIFIED_DURATION)) {

            //CONVEXITY enum이 sensitivityTypes list에 있을 시, true == false >> false >> calculateOnlyDuration이 false가 된다.
            boolean calculateOnlyDuration = sensitivityTypes.contains(SensitivityType.CONVEXITY) == false;

            inputs = generateInputForCurves(baseInput, greekLevel, calculateOnlyDuration, curves, inputs);
        }

        if(sensitivityTypes.contains(SensitivityType.DELTA)) {

            boolean calculateOnlyDelta = !sensitivityTypes.contains(SensitivityType.GAMMA);

            inputs = generateInputForUnderlyings(baseInput, greekLevel, underlyings, calculateOnlyDelta, inputs);
        }
        return inputs;

    }

    /**
     *
     * @param inputs
     * @return
     * @throws Exception
     */
    private static ConcurrentHashMap<String, BigDecimal> calculateOutputs(Map<String, CalculationInput> inputs) throws Exception {
        /*
         * Multi-Thread 사용 여부
         *
         * false 인 경우 Test 를 위한 코드
         */
        boolean usingMultiThread = true;

        List<GreekInput> greekInputs = new ArrayList<GreekInput>();
        inputs.forEach((key, input) -> {
            GreekInput greekInput = new GreekInput();
            greekInput.setInput(input);
            greekInput.setKey(key);
            greekInputs.add(greekInput);
        });

        ConcurrentHashMap<String, BigDecimal> outputs = new ConcurrentHashMap<>();

        if(usingMultiThread) {
            // 고정된 Thread pool을 만든다.
            // executor가 thread pool 이다. (정해진 thread 숫자를 가지는)
            int nThreads = Runtime.getRuntime().availableProcessors();
            ExecutorService executor = Executors.newFixedThreadPool(nThreads);

            // Thread 를 띄우고 그 상태를 체크하여 모든 Thread 가 종료 되었을 때(=모든 input에 대한 가격이 산출된 경우) 다음으로 넘어가도록 하기 위해 사용
            List<Future<?>> futures = Collections.synchronizedList(new ArrayList<>());

            inputs.forEach((key, input) -> {
                try {
                    //task가 ExecutorService에 submit되었을 때, Future<?>가 return된다.
                    //Future 객체는 task의 status를 확인 가능하게 해준다.
                    //submit할 때, pool의 thread가 자동으로 task의 run 메소드를 런한다.
                    //main thread는 thread pool이 가득 차더라도 멈추지 않는다.
                    //free thread가 없을 시에는, task가 대기한다.(queue)
                    Future<?> future = executor.submit(new Runnable() {
                        @Override
                        public void run() {
                            LOG.debug(key + " Start");
                            Calculator calculator = new Calculator();
                            BigDecimal value = BigDecimal.valueOf(0);
                            try {
                                CalculationOutput output = calculator.calculateByPricer(input);
                                if(Validator.isEmpty(output.getPrices().getPrice())) {
                                    value = BigDecimal.valueOf(0);
                                    LOG.debug(output.getErrorMessage());
                                } else {
                                    value = output.getPrices().getPrice().get(0).getValue();
                                }
                            } catch (Exception e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                            }
                            outputs.put(key, value);
                            LOG.debug(key + " End");
                        }
                    });
                    futures.add(future);
                } catch (Exception e) {
                    LOG.debug("fails to parallel calculation.");
                }
            });

            while(true) {
                /*
                 * TODO : 만약 하나의 input에 대해서 가격이 산출 되지 않고 계속 도는 경우는...?
                 * 위의 경우... 무한루프에 빠져서 계산이 종료되지 않는 문제가 생길 수 있음
                 */
                Future<?> notEndFuture = futures.stream().filter(x -> !x.isDone()).findAny().orElse(null);
                if(notEndFuture == null)
                    break;
                else {
                    Thread.sleep(10);
                }
            }

            // Shutdown executor
            executor.shutdown();
        } else {
            inputs.forEach((key, input) -> {
                Calculator calculator = new Calculator();
                BigDecimal value = BigDecimal.valueOf(0);
                try {
                    value = calculator.calculateByPricer(input).getPrices().getPrice().get(0).getValue();
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                outputs.put(key, value);
            });
        }

        return outputs;
    }

    /**
     * PV01산출을 위한 input데이터 산출 함수. 만약 tenorPV01Flag == True이면 tenorPV01 산출을 위한
     * input데이터도 같이 생성
     * 
     * @param baseInput
     * @param greekLevel
     * @param tenorPV01Flag
     * @param curves
     * @param inputs
     * @return
     * @throws Exception
     */
    private static ConcurrentHashMap<String, CalculationInput> generateInputForPV01(CalculationInput baseInput,
                                                                                    GreekLevel greekLevel,
                                                                                    boolean tenorPV01Flag,
                                                                                    List<YieldCurve> curves,
                                                                                    ConcurrentHashMap<String, CalculationInput> inputs) throws Exception {

        if (curves == null || curves.size() == 0)
            return inputs;

        GreekCalculationMethod targetGreeksType = greekLevel.getGreekCalculationMethods().getGreekCalculationMethod()
                .stream().filter(x->x.getSensitivityType() == SensitivityType.PV_01).findFirst().orElse(null);

        GreekCalculationMethod deltaType = greekLevel.getGreekCalculationMethods().getGreekCalculationMethod()
                .stream().filter(x->x.getSensitivityType() == SensitivityType.DELTA).findFirst().orElse(null);

        if (targetGreeksType == null)
            return null;
        //deep copy 구현해야 됨.
        DataSet baseDataSet = ((CalculationInput) baseInput.clone()).getDataSet();

        for (YieldCurve curve : curves) {

            int[] signs = deltaType != null? new int[] {-1 ,1} : CommonUtil.getSigns(targetGreeksType);

            for(int sign : signs) {

                DataSet signedDataSet = (DataSet) baseDataSet.clone();
                YieldCurve signedCurve = signedDataSet.getYieldCurves().getYieldCurve().stream().filter(x ->
                        x.getDataId().equals(curve.getDataId())).findFirst().orElse(null);

                for(int i = 0; i < signedCurve.getYields().getYield().size() ; i++) {
                    Yield tmpYield = new Yield();
                    tmpYield.setTenor(signedCurve.getYields().getYield().get(i).getTenor());

                    tmpYield.setValue()
                }
            }
        }
    }



    //자잘한 메소드 정리

    /**
     *
     * @param value
     * @param sign
     * @param pert1
     * @param perturbationType1
     * @param mustBePositive
     * @return perturbation이 적용된 값을 얻어낸다.
     */
    public static BigDecimal getPerturbatedValue1(BigDecimal value, int sign, BigDecimal pert1,
                                                  PerturbationType perturbationType1, boolean mustBePositive) {
        switch (perturbationType1) {
            case PERCENT:
            case VALUE:
                return value.add(getPerturbation1(value, sign, pert1, perturbationType1, mustBePositive));
            default:
                return value;
        }
    }

    /**
     *
     * @param value 원래값
     * @param sign perturbation이 positive인지 negative인지
     * @param pert1 perturbation되는 양
     * @param perturbationType1 percentage혹은 절대값
     * @param mustBePositive 결과값이 positive여야 한다.
     * @return 적용되어야 하는 perturbation값을 return한다.
     */
    public static BigDecimal getPerturbation1(BigDecimal value, int sign, BigDecimal pert1,
                                              PerturbationType perturbationType1, boolean mustBePositive) {

        BigDecimal perturbation = new BigDecimal("0");
        //percent인 경우, pert1값을 100으로 나눠서, 원래값에 곱해주고, sign값을 곱해준다.
        switch (perturbationType1) {
            case PERCENT:
                perturbation = value.multiply(pert1.divide(BigDecimal.valueOf(100), MathContext.DECIMAL128).multiply(BigDecimal.valueOf(sign)));
                break;
            case VALUE:
                perturbation = pert1.multiply(new BigDecimal(sign));
                break;
            default:
                break;
        }
        //mustBePositive가 true일 때, run
        if (mustBePositive) {

            BigDecimal perturbatedValue = value.subtract(perturbation);
            //perturbatedValue가 0이거나 0보다 작으면, perturbation을 재정의 한다.
            if (perturbatedValue.compareTo(BigDecimal.valueOf(0)) <= 0) {
                //0이나 원래 value보다 약간 작은 값 중에서 큰값을 반환한다. 이 perturbation이 적용될 시, perturbated 값은 0.0001이거나 0이 된다.
                perturbation = BigDecimal.valueOf(0).max(value.subtract(BigDecimal.valueOf(0.0001)));
            }
        }

        return perturbation;
    }
}
