package com.quant.pricer.util;

import com.quant.pricer.common.input.*;
import com.quant.pricer.common.output.PriceOutput;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class CommonUtil {

    /**
     * 
     * @param inputFileName inputXml 파일 이름
     * @return 평가 결과값을 저장하는 파일의 끝에 Out을 붙여줌
     */
    //static method
    public static String generateOutputFileName(String inputFileName) {
        //lastIndexOf:파일 확장자명이 등장하는 위치를 찾는다. substring(0...):파일 확장자 명을 제거한다.
        String cntrCd = inputFileName.substring(0, inputFileName.lastIndexOf("."));
        //StringBuilder를 초기화한다.
        StringBuilder sb = new StringBuilder(cntrCd);
        sb.append("Out.xml");
        return sb.toString();
    }

    /**
     *
     * @param type 계산 타입
     * @return 민감도 산출 여부
     */
    public static boolean needGreeks(CalculationType type) {

        if (type == CalculationType.PRICE_GREEK || type == CalculationType.PRICE_GREEK_CF)
            return true;
        else
            return false;
    }

    /**
     * 현금 흐름 산출 여부
     * @param type 계산 타입
     * @return 현금 흐름 산출 여부
     */
    public static boolean needCF(CalculationType type) {
        if (type == CalculationType.PRICE_CF || type == CalculationType.PRICE_GREEK_CF)
            return true;
        else
            return false;
    }

    /**
     * 민감도 산출시 깊은 복사가 된 input의 이름을 반환
     * @param mktDataId1 마켓데이터1 id
     * @param sign1 증감 방향
     * @param perturbationType1 증감 타입
     * @param pert1 증감값
     * @param mktDataId2 마켓데이터2 id
     * @param sign2 증감 방향
     * @param perturbationType2 증감 타입
     * @param pert2 증감값
     * @param usePert2 마켓데이터2 증감 여부
     * @return 민감도 산출시 깊은 복사가 된 input의 이름을 반환
     */
    public static String generateKey(String mktDataId1, int sign1, PerturbationType perturbationType1, BigDecimal pert1,
                                     String mktDataId2, int sign2, PerturbationType perturbationType2, BigDecimal pert2, boolean usePert2) {

        StringBuilder sb = new StringBuilder();

        String signType1 = "";

        switch (sign1) {
            case 0:
                signType1 = "N";
                break;
            case 1:
                signType1 = "UP";
                break;
            case -1:
                signType1 = "DOWN";
                break;
            default:
                break;
        }

        if (sign1 != 0)
            sb.append(mktDataId1).append("#").append(signType1).append("$").append(perturbationType1).append("%").append(pert1);

        if(mktDataId2 != null) {
            String signType2 = "";

            switch (sign2) {
                case 0:
                    signType2 = "N";
                    break;
                case 1:
                    signType2 = "UP";
                    break;
                case -1:
                    signType2 = "DOWN";
                    break;
                default:
                    break;
            }

            if (sign2 != 0)
                sb.append("^").append(mktDataId2).append("#").append(signType2).append("$")
                        .append((usePert2 ? perturbationType2 : perturbationType1)).append("%").append((usePert2 ? pert2:pert1));

        }

        return sb.toString();
    }

    /**
     * 민감도 산출시 리스크팩터에 변화를 주는 방향을 반환
     * 0 : 변화없음, 1: +pert, -1 = -pert
     * @param greekCalculationMethod 증감 방향
     * @return 0: 변화없음, 1: +pert, -1 = -pert
     */
    public static int[] getSigns(GreekCalculationMethod greekCalculationMethod) {
        GreekCalculationMethodType type = greekCalculationMethod.getType(); //type property는 ENUM이다.

        switch (type) {
            case UPSIDE:
                return new int[] {0, 1};
            case DOWNSIDE:
                return new int[] {-1, 0};
            case BOTH_SIDE:
                return new int[] {-1, 1};
            default:
                return new int[] {-1, 1};
        }
    }

    /**
     * 상품의 잔존 만기 반환
     * @param valuationDate 평가일
     * @param TerminateDate 만기일
     * @return 잔존 만기
     * @throws Exception
     */
    public static BigDecimal getResidualMaturity(String valuationDate, String TerminateDate) throws Exception {

        Date valDt = new SimpleDateFormat("yyyyMMdd").parse(valuationDate);
        Date terDt = new SimpleDateFormat("yyyyMMdd").parse(TerminateDate);
        //getTime은 millisecond 단위를 반환한다. 1000으로 나눠서 초 단위 차이를 반환한다. 24*60*60으로 나눠서 날짜 차이를 반환한다.
        double diffDays = (double) (((terDt.getTime() - valDt.getTime())/ 1000)/ (24*60*60));
        //일 단위 차이를 연 단위로 변환한다.
        return BigDecimal.valueOf(diffDays/(365.0));
    }

    /**
     * Day Count Convention에 따른 Juro Pricer 값 반환
     *  ACT_365 = 11
     *  ACT_360 = 12
     *  ACT_ACT = 13
     *  ACT_365A = 14
     *  ACT_365L = 15
     *  NL_365 = 16
     *  30E_360 = 21
     *  30_360ISDA = 22
     *  30E_360ISDA = 23
     *  30_360US = 24
     *  30EP_360 = 25
     * @param dcc Day Count Convention
     * @return Core 에서 취급하는 DCC
     */
    public static int getDCC(DayCountConvention dcc) {
        //value를 통해 해당하는 String값 get
        switch (dcc.value()){
            case "ACT365":
                return 11;
            case "ACT360":
                return 12;
            case "D30360":
                return 24;
            case "D30E360":
                return 21;
            case "ACTACT":
                return 13;
            default:
                return 11;

        }
    }
    //call option, put option
    public static String getOptionType(ExerciseType type){
        switch (type) {
            case EQUAL_OR_GREATER:
            case GREATER:
                return "C";
            case EQUAL_OR_LESS:
            case LESS:
                return "P";
            default:
                return "None";
        }
    }

    public static PriceOutput mergeOutputs(List<PriceOutput> outputs) throws Exception {
        
        if(outputs == null || outputs.size() == 0)
            throw new Exception("Not calculated.");
        //List outputs을 stream으로 변경 후, lambda map 호출. value property의 stream 반환. reduce operation(add)를 통해서, 0부터 시작해서 BigDecimal값을 다 더한다.
        BigDecimal sumOfPrices = outputs.stream().map(x -> x.getValue()).reduce(
                BigDecimal.ZERO, BigDecimal::add
        );

        PriceOutput priceOutput = new PriceOutput();
        priceOutput.setCurrency(outputs.get(0).getCurrency());
        priceOutput.setUnitEvalAmount(outputs.get(0).getUnitEvalAmount());
        priceOutput.setValue(sumOfPrices);

        return priceOutput;
    }

    /**
     *
     * @param legs leg 정보
     * @return Fixed, Floating(OIS 포함)의 leg 정보 반환
     * @throws Exception
     */
    public static Leg getFundingLeg(List<Leg> legs) throws Exception {
        //filter는 괄호안에 항상 조건절(predicate)이 오고, 조건절이 true를 반환하는 경우에만 해당 요소를 stream에 남겨 놓는다.
        Leg fundingLeg = legs.stream().filter(x->hasCpnEvent(x)).findFirst()
                .orElseThrow(() -> new Exception("There is no funding Leg"));
        //List<CouponEvent> return > stream으로 변환 (이건 validation 역할을 수행한다.)
        fundingLeg.getCouponEvents().getCouponEvent()
                .stream().filter(x -> x.getType() == CouponEventType.FIXED
                || x.getType() == CouponEventType.FLOATING).findFirst()
                .orElseThrow(() -> new Exception("There is no Funding Leg"));

        return fundingLeg;
    }

    /**
     *
     * @param legs leg 정보
     * @return 신용 상품의 신용 Leg 정보 반환
     * @throws Exception
     */
    public static Leg getDefaultLeg(List<Leg> legs) throws Exception {

        Leg defaultLeg = legs.stream().filter(x -> x.getUnderlyings().getUnderlying() != null ||
                x.getUnderlyings().getUnderlying().size() > 0).findFirst()
                .orElseThrow(() -> new Exception("There is no Default Leg"));
        //ENUM 호출 할 때, 항상 이런 식임 (ENUM instance). Validation
        defaultLeg.getUnderlyings().getUnderlying().stream()
                .filter(x -> x.getType() == UnderlyingType.CREDIT).findFirst()
                .orElseThrow(() -> new Exception("There is no Default Leg"));

        return defaultLeg;
    }


    //ArrayofCouponEvent의 필드 List<CouponEvent>가 CouponEvent element를 가지는지 확인
    private static boolean hasCpnEvent(Leg leg) {
        return leg.getCouponEvents().getCouponEvent() != null && leg.getCouponEvents().getCouponEvent().size() > 0;
    }

    public static boolean isOIS(Instrument instrument) {
        // TODO : OIS 데이터 생성 이후 다시 함수 작성 예정

        return false;

    }

    /**
     * @param type input의 채권 타입
     * @return core에서 분류하는 채권 코드
     */
    public static String getBondType(InstrumentType type) {
        switch (type) {
            case ZERO_COUPON_BOND:
                return "2";
            case SIMPLE_BOND:
                return "3";
            case COMPOUND_BOND:
                return "4";
            case COMPOUND_5_SIMLPLE_2_BOND:
                return "5";
            case SIMPLE_FRN:
                return "9";
            case COUPON_BOND:
            default:
                return "1";
        }
    }
}
