package com.quant.pricer.util;

import com.quant.pricer.common.input.Context;
import com.quant.pricer.common.input.DataSet;
import com.quant.pricer.common.input.YieldCurve;
import com.quant.pricer.common.input.*;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class DataSetUtil {

    private static boolean restrictYieldCurveFlag = false;

    /**
     *
     * @param dataSet 데이터셋
     * @param context 컨텍스트
     * @param key 할인금리 커브 매핑 키
     * @param residualMaturity 상품의 잔존 만기
     * @return key에 해당하는 할인 금리 커브 반환
     * @throws Exception
     */
    public static YieldCurve getDiscountCurve(DataSet dataSet, Context context, String key, BigDecimal residualMaturity) throws Exception {

        ContextMap contextMapForId = context.getMaps().getContextMap().stream()
                .filter(x -> x.getKey().equals(key)).findFirst().orElseGet(null);

        if(contextMapForId == null) {
            String errMsg = "There is no context map for id.";
            throw new IllegalArgumentException(errMsg);

        }

        MarketDataMap map = contextMapForId.getMarketDataMaps().getMarketDataMap().stream()
                .filter(x -> x.getMarketDataType() == MarketDataType.DISCOUNT_CURVE_ZERO).findFirst().orElse(null);

        if(map==null) {
            String errMsg = "There is no context map for discount Curve";
            throw new IllegalArgumentException(errMsg);
        }

        if(map.getDataId() == null) {
            String errMsg = "There is no discount Curve Id to use in Context Map";
            throw new IllegalArgumentException(errMsg);
        }

        YieldCurve yieldCurve = dataSet.getYieldCurves().getYieldCurve().stream()
                .filter(x->x.getDataId().equals(map.getDataId())).findFirst().orElse(null);

        if(yieldCurve == null) {
            String errMsg = "There is no discount Curve data.";
            throw new IllegalArgumentException(errMsg);
        }

        if(restrictYieldCurveFlag && (residualMaturity != null))
            return restrictYields(yieldCurve, residualMaturity);

        return yieldCurve;

    }

    /**
     *
     * @param dataSet 데이터셋
     * @param context 컨텍스트
     * @param key 무위험금리 커브 매핑 키
     * @param residualMaturity 잔존만기
     * @return key에 해당하는 기준금리(무위험 금리) 커브 반환
     * @throws Exception
     */
    public static YieldCurve getRiskFreeCurve(DataSet dataSet, Context context, String key, BigDecimal residualMaturity) throws Exception {

        ContextMap contextMapForId = context.getMaps().getContextMap().stream()
                .filter(x -> x.getKey().equals(key)).findFirst().orElseGet(null));

        if (contextMapForId == null) {
            String errMsg= "There is no context map for id.";
            throw new IllegalArgumentException(errMsg);
        }

        MarketDataMap map = contextMapForId.getMarketDataMaps().getMarketDataMap().stream()
                .filter(x -> x.getMarketDataType() == MarketDataType.RISK_FREE_CURVE_ZERO).findFirst().orElse(null);

        if(map == null) {
            String errMsg = "There is no context map for reference Curve.";
            throw new IllegalArgumentException(errMsg);
        }

        if(map.getDataId() == null) {
            String errMsg = "There is no reference Curve Id to use in Context Map";
            throw new IllegalArgumentException(errMsg);
        }

        YieldCurve yieldCurve = dataSet.getYieldCurves().getYieldCurve().stream()
                .filter(x -> x.getDataId().equals(map.getDataId())).findFirst().orElse(null);

        if(yieldCurve == null) {
            String errMsg = "There is no reference Curve data";
            throw new IllegalArgumentException(errMsg);
        }

        if(restrictYieldCurveFlag && (residualMaturity != null))
            return restrictYields(yieldCurve, residualMaturity);

        return yieldCurve;
    }

    public static YieldCurve getCDSSpread(DataSet dataSet, Context context, String key) throws Exception {

        ContextMap contextMapForId = context.getMaps().getContextMap().stream().filter(x -> x.getKey().equals(key)).findFirst().orElseGet(null);

        if(contextMapForId == null) {
            String errMsg = "There is no context map for Id.";
            throw new IllegalArgumentException(errMsg);
        }

        MarketDataMap map = contextMapForId.getMarketDataMaps().getMarketDataMap().stream()
                .filter(x -> x.getMarketDataType() == MarketDataType.CDS_SPREAD).findFirst().orElse(null);

        if(map == null) {
            String errMsg = "There is no context map for CDS Spread.";
            throw new IllegalArgumentException(errMsg);
        }

        if(map.getDataId() == null) {
            String errMsg = "There is no CDS Spread Id to use in Context Map";
            throw new IllegalArgumentException(errMsg);
        }

        YieldCurve yieldCurve = dataSet.getYieldCurves().getYieldCurve().stream()
                .filter(x->x.getDataId().equals(map.getDataId())).findFirst().orElse(null);

        if(yieldCurve == null) {
            String errMsg = "There is no CDS Spread data";
            throw new IllegalArgumentException(errMsg);
        }

        return yieldCurve;
    }

    /**
     * @param yieldCurve 타겟 커브
     * @param residualMaturity 잔존 만기
     * @return 잔존만기보다 큰 tenor는 평가에 영향을 끼치지 않기 때문에 잔존 만기보다 짧은 것만 반환
     * @throws Exception
     */
    public static YieldCurve restrictYields(YieldCurve yieldCurve, BigDecimal residualMaturity) throws Exception {

        List<Yield> targetYield = yieldCurve.getYields().getYield();
        //Yield 객체가 얼마나 있는지 return. yield curve에 얼마나 많은 점이 있는지 return
        int sizeOfYield = targetYield.size();

        if(sizeOfYield - 2 <= 0)
            return yieldCurve;

        if(targetYield.get(sizeOfYield-2).getTenor().getYear().getValue().compareTo(residualMaturity)<0)
            return yieldCurve;

        int idx = 0;
        //idx는 tenor가 잔존 만기보다 크거나 같은 첫번째 Yield point의 index를 찾는다.
        for(int i = 0; i < sizeOfYield ; i++) {
            if(targetYield.get(i).getTenor().getYear().getValue().compareTo(residualMaturity) >= 0) {
                idx = i;
                break;
            }
        }
        //잔존만기보다 큰 tenor는 버린 List<Yield>를 반환한다.
        if(sizeOfYield > idx + 2)
            targetYield = targetYield.subList(0, idx+1);

        ArrayOfYield restrictedArrayOfYield = new ArrayOfYield();
        //yield property를 업데이트된 List<Yield>로 채운다.
        restrictedArrayOfYield.getYield().addAll(targetYield);
        //yieldCurve의 yields property (type: ArrayOfYield) 를 set한다.
        yieldCurve.setYields(restrictedArrayOfYield);
        return yieldCurve;

    }

    //기초자산 여러개의 가격을 구하는 logic
    public static double[] getUnderlyingPrices(DataSet dataSet, List<String> underlyingIds) throws IllegalArgumentException {
        List<Double> prices = new ArrayList<>();

        for(String underlyingId : underlyingIds) {
            prices.add(getUnderlyingPrice(dataSet, underlyingId).doubleValue());
        }
        return prices.stream().mapToDouble(Double::doubleValue).toArray();
    }

    //기초자산의 가격을 구하는 logic
    public static BigDecimal getUnderlyingPrice(DataSet dataSet, String underlyingKey) throws IllegalArgumentException {

        List<Price> prices = dataSet.getPrices().getPrice();

        Price targetPrice = prices.stream().filter(x -> x.getDataId().equals(underlyingKey))
                .findFirst().orElseThrow(() -> new IllegalArgumentException("There is no price of "+underlyingKey));

        return targetPrice.getValue();
    }

    public static double[] getInitPrices(DataSet dataSet, List<String> underlyingIds, String initPriceDeterminateDate)
        throws IllegalArgumentException {

        List<Double> initPrices = new ArrayList<>();

        for (String underlyingId : underlyingIds) {
            initPrices.add(getInitPrice(dataSet, underlyingId, initPriceDeterminateDate).doubleValue());
        }
        return initPrices.stream().mapToDouble(Double::doubleValue).toArray();
    }

    //특정 시점의 가격 구하기
    public static BigDecimal getInitPrice(DataSet dataSet, String underlyingId, String initPriceDeterminateDate)
        throws IllegalArgumentException{

        List<PriceList> fixingPrices = dataSet.getFixingPrices().getFixingPrices();

        PriceList targetPrice = fixingPrices.stream().filter(x->x.getDataId().equals(underlyingId))
                .findFirst().orElseThrow(()->new IllegalArgumentException("There is no price of "+underlyingId));

        if(targetPrice.getPrices().getPrice().size() != targetPrice.getDates().getDate().size())
            throw new IllegalArgumentException("# of Dates <> # of FixingPrice");

        int fixingPriceIdx = targetPrice.getDates().getDate().indexOf(initPriceDeterminateDate);
        //해당 날짜가 없을 시, indexOf가 -1을 반환
        if(fixingPriceIdx < 0)
            throw new IllegalArgumentException(String.format("There is no FixingPrice of %s at %s", underlyingId, initPriceDeterminateDate));

        return targetPrice.getPrices().getPrice().get(fixingPriceIdx);
    }

    /**
     * 
     * @param dataSet
     * @param context
     * @param underlyingKey
     * @return
     * @throws IllegalArgumentException
     */
    public static AbstractMarketData getVolatility(DataSet dataSet, Context context, String underlyingKey) throws IllegalArgumentException {

        ContextMap contextMap = context.getMaps().getContextMap().stream()
                .filter(x -> x.getKey().equals(underlyingKey)).findFirst()
                .orElseThrow(()->new IllegalArgumentException("There is no context map of"+underlyingKey));

        MarketDataMap marketDataMap = contextMap.getMarketDataMaps().getMarketDataMap()
                .stream().filter(x -> x.getMarketDataType() == MarketDataType.VOLATILITY)
                .findFirst().orElseThrow(()->new IllegalArgumentException("There is no volatility data map."));

        String volDataId = marketDataMap.getDataId();

        if(volDataId == null) {
            throw new IllegalArgumentException("Volatility data-id is not set to " + underlyingKey);
        }

        AbstractMarketData targetVol = null;

        switch (marketDataMap.getMarketDataType()) {
            case VOLATILITY:
                targetVol = dataSet.getVols().getVolatility().stream().filter(x->x.getDataId().equals(volDataId)).findFirst().orElse(null);
                break;
            case VOL_CURVE:
                targetVol = dataSet.getVolCurves().getVolCurve().stream().filter(x ->x.getDataId().equals(volDataId)).findFirst().orElse(null);
                break;
            case VOL_SURFACE:
                targetVol = dataSet.getVolSurfaces().getVolSurface().stream().filter(x->x.getDataId().equals(volDataId)).findFirst().orElse(null);
                break;
        }
        if(targetVol == null)
            throw new IllegalArgumentException("There is no Volatility data for " + volDataId);

        return targetVol;
    }

    /**
     *
     * @param dataSet
     * @param context
     * @param underlyingKey
     * @return
     * @throws IllegalArgumentException
     */
    public static AbstractMarketData getDividend(DataSet dataSet, Context context, String underlyingKey) throws IllegalArgumentException {
        //ArrayofContextMap, List<ContextMap>, stream화, filter와 findFirst로 해당되는 ContextMap 걸러냄.
        //findFirst메소드는 Optional<MarketDataMap>을 return한다. orElseThrow는 Optional의 메소드
        ContextMap contextMap = context.getMaps().getContextMap().stream()
                .filter(x->x.getKey().equals(underlyingKey)).findFirst()
                .orElseThrow(()->new IllegalArgumentException("There is no context map of" + underlyingKey));

        MarketDataMap marketDataMap = contextMap.getMarketDataMaps().getMarketDataMap()
                .stream().filter(x->x.getMarketDataType() == MarketDataType.DIVIDEND_YIELD)
                .findFirst().orElseThrow(()->new IllegalArgumentException("There is no dividend data map"));

        String divDataId = marketDataMap.getDataId();

        if(divDataId == null) {
            return null;
        }

        AbstractMarketData targetDiv = null;

        switch (marketDataMap.getMarketDataType()) {
            case DIVIDEND_YIELD:
                targetDiv = dataSet.getDividendYields()
                        .getDividendYield().stream().filter(x->x.getDataId().equals(divDataId))
                        .findFirst().orElse(null);
                break;
            case DIVIDEND_STREAM:
                targetDiv = dataSet.getDividendStreams()
                        .getDividendStream().stream().filter(x->x.getDataId().equals(divDataId))
                        .findFirst().orElse(null);
                break;

        }

        if (targetDiv == null)
            throw new IllegalArgumentException("There is no dividend data for " + divDataId);

        return targetDiv;

    }

    /**
     *
     * @param yields
     * @return
     */
    public static double[] getYieldTenors(List<Yield> yields) {
        return yields.stream(). //이거 optimize할 필요 있음. Stream<Double>을 List<Double>로 바꿨다가, 다시 Stream<Double>로 바꿈
                map(x->x.getTenor().getYear().getValue().doubleValue())
                .collect(Collectors.toList())
                .stream().mapToDouble(Double::doubleValue).toArray();
    }

    /**
     *
     * @param yields
     * @return
     */
    public static double[] getYieldRates(List<Yield> yields){
        return yields.stream()
                .map(x->x.getValue().doubleValue())
                .collect(Collectors.toList())
                .stream().mapToDouble(Double::doubleValue).toArray();
    }

    public static double getFxExRate(DataSet dataSet, String currency, String counterCurrency, ExchangeRateType type,
                                     String baseDate) throws Exception {
        if(currency.equals(counterCurrency))
            return 1;
        String dataId = getFXCode(currency, counterCurrency, type);
        Price targetFx = dataSet.getPrices().getPrice().stream().filter(x->x.getDataId().equals(dataId))
                .findFirst().orElse(null);
        if(targetFx == null){
            String reverseDataId = getFXCode(counterCurrency, currency, type);
            targetFx = dataSet.getPrices().getPrice().stream().filter(x->x.getDataId().equals(reverseDataId))
                    .findFirst().orElseThrow(() ->
                            new Exception((new StringBuilder("There is no price of").append(dataId)).toString()));
            return (1 / targetFx.getValue().doubleValue());
        }
        else{
            return targetFx.getValue().doubleValue();
        }

    }

    public static double[] getFixingIRs(List<Cashflow> cashflows, PriceList fixingIRs, String baseDate) throws Exception {

        //Data validation start
        if(cashflows == null || cashflows.size() == 0)
            throw new Exception("There are no cashflow schedules.");

        if(fixingIRs == null)
            throw new Exception("There are no fixing IRs");

        if(fixingIRs.getDates().getDate() == null || fixingIRs.getDates().getDate().size() == 0)
            throw new Exception("There are no fixing IR Dates");

        if(fixingIRs.getPrices().getPrice() == null || fixingIRs.getPrices().getPrice().size() == 0)
            throw new Exception("There are no fixing IR List");

        if(fixingIRs.getPrices().getPrice().size() != fixingIRs.getDates().getDate().size())
            throw new Exception("# of IRs != # of Dates");

        //Data Validation complete

        List<Double> resultIRs = new ArrayList<>();

        for(int i = 0; i< cashflows.size();i++) {
            Cashflow cashflow = cashflows.get(i);
            if(cashflow.getSettleDate().compareTo(baseDate) < 0) { //settleDate < baseDate
                resultIRs.add(0.01);
            } else { //settleDate >= baseDate
                if(cashflow.getResetDate().compareTo(baseDate) <= 0) { //resetDate <= baseDate
                    String resetDate = cashflow.getResetDate();
                    int resetIdx = fixingIRs.getDates().getDate().indexOf(resetDate);
                    if (resetIdx < 0) //해당 resetDate가 fixingIRs의 list<Date>에서 발견되지 않으면
                        throw new Exception(String.format("There is no fixing IR at %s", resetDate));
                    resultIRs.add(fixingIRs.getPrices().getPrice().get(resetIdx).doubleValue());
                }
                else
                    break;
            }

        }
        //resultIRs list를 stream으로 변경. stream을 primitive type의 double Array로 변경
        //Java Collection은 primitive type을 저장할 수 없다. 그래서 wrapper class를 사용한다.
        //primitive array가 계산에서 더욱더 효율적이다.
        return resultIRs.stream().mapToDouble(Double::doubleValue).toArray();
    }

    public static double getExChangeRate(DataSet dataSet, String counterCurrency, String baseCurrency,
                                         ExchangeRateType exchangeRateType) throws Exception {
        if(counterCurrency.equals(baseCurrency))
            return 1;

        String dataId = getFXCode(counterCurrency, baseCurrency, exchangeRateType);
        Price price = dataSet.getPrices().getPrice().stream().filter(x->x.getDataId().equals(dataId))
                .findFirst().orElse(null);

        if(price != null)
            return price.getValue().doubleValue();
        else { //price가 null이면
            Price reversPrice = dataSet.getPrices().getPrice().stream().filter(x->x.getDataId()
                    .equals(getFXCode(baseCurrency, counterCurrency, exchangeRateType)))
                    .findFirst().orElse(null);
            if(reversPrice == null)
                throw new Exception(String.format("There is no exchange rate of %s", dataId));
            else
                return BigDecimal.valueOf(1).divide(reversPrice.getValue(), MathContext.DECIMAL32).doubleValue();
        }
    }

    public static String getFXCode(String counterCurrency, String baseCurrency, ExchangeRateType exchangeRateType) {

        StringBuilder sb = new StringBuilder("FX");
        sb.append(baseCurrency);
        sb.append(counterCurrency);

        switch(exchangeRateType){
            case SPOT:
                return sb.toString();
            default:
                return sb.insert(0,"BASE").toString();
        }
    }

    public static double[][] getCorrs(DataSet dataSet, Context context, List<String> underlyingIds)
        throws Exception {
            //2d array corrs 생성.
            double[][] corrs = new double[1][1];

            //underlying이 하나일 시, row 0, column 0에 값 0 할당.
            if(underlyingIds.size() == 1) {
                corrs[0][0] = 0;
                return corrs;
            }

            List<Corr> targetCorrs = new ArrayList<>();
            for (String underlyingId : underlyingIds){
                ContextMap contextMap = context.getMaps().getContextMap()
                        .stream().filter(x->x.getKey().equals(underlyingId))
                        .findFirst().orElse(null);
                if(contextMap == null)
                    throw new Exception("There is no context map for " + underlyingId);

                List<MarketDataMap> corrDataMaps = contextMap.getMarketDataMaps().getMarketDataMap()
                        .stream().filter(x->x.getMarketDataType() == MarketDataType.CORRELATION)
                        .collect(Collectors.toList()); //List로 변환
                if(corrDataMaps == null || corrDataMaps.size() == 0)
                    throw new Exception("There is no correlation context map for " + underlyingId);

                for (MarketDataMap map : corrDataMaps) {
                    if(map.getDataId() == null)
                        throw new Exception("There is no correlation Data Id for " + underlyingId);
                }
            }

    }
}
