//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.3.0 버전을 통해 생성되었습니다. 
// <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2024.09.03 시간 11:35:07 PM KST 
//


package com.quant.pricer.common.input;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MarketDataType에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="MarketDataType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Price"/&gt;
 *     &lt;enumeration value="RiskFreeCurve"/&gt;
 *     &lt;enumeration value="RiskFreeCurveZero"/&gt;
 *     &lt;enumeration value="RiskFreeCurveYTM"/&gt;
 *     &lt;enumeration value="CounterRiskFreeCurveZero"/&gt;
 *     &lt;enumeration value="CounterRiskFreeCurveYTM"/&gt;
 *     &lt;enumeration value="DiscountCurve"/&gt;
 *     &lt;enumeration value="DiscountCurveZero"/&gt;
 *     &lt;enumeration value="DiscountCurveYTM"/&gt;
 *     &lt;enumeration value="CDSSpread"/&gt;
 *     &lt;enumeration value="DividendYield"/&gt;
 *     &lt;enumeration value="DividendStream"/&gt;
 *     &lt;enumeration value="Volatility"/&gt;
 *     &lt;enumeration value="VolCurve"/&gt;
 *     &lt;enumeration value="VolSurface"/&gt;
 *     &lt;enumeration value="CapVol"/&gt;
 *     &lt;enumeration value="SwaptionVol"/&gt;
 *     &lt;enumeration value="Correlation"/&gt;
 *     &lt;enumeration value="CurveCorrelation"/&gt;
 *     &lt;enumeration value="QuantoVol"/&gt;
 *     &lt;enumeration value="QuantoCorr"/&gt;
 *     &lt;enumeration value="HullAndWhiteVol1"/&gt;
 *     &lt;enumeration value="HullAndWhiteVol2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MarketDataType")
@XmlEnum
public enum MarketDataType {

    @XmlEnumValue("Price")
    PRICE("Price"),
    @XmlEnumValue("RiskFreeCurve")
    RISK_FREE_CURVE("RiskFreeCurve"),
    @XmlEnumValue("RiskFreeCurveZero")
    RISK_FREE_CURVE_ZERO("RiskFreeCurveZero"),
    @XmlEnumValue("RiskFreeCurveYTM")
    RISK_FREE_CURVE_YTM("RiskFreeCurveYTM"),
    @XmlEnumValue("CounterRiskFreeCurveZero")
    COUNTER_RISK_FREE_CURVE_ZERO("CounterRiskFreeCurveZero"),
    @XmlEnumValue("CounterRiskFreeCurveYTM")
    COUNTER_RISK_FREE_CURVE_YTM("CounterRiskFreeCurveYTM"),
    @XmlEnumValue("DiscountCurve")
    DISCOUNT_CURVE("DiscountCurve"),
    @XmlEnumValue("DiscountCurveZero")
    DISCOUNT_CURVE_ZERO("DiscountCurveZero"),
    @XmlEnumValue("DiscountCurveYTM")
    DISCOUNT_CURVE_YTM("DiscountCurveYTM"),
    @XmlEnumValue("CDSSpread")
    CDS_SPREAD("CDSSpread"),
    @XmlEnumValue("DividendYield")
    DIVIDEND_YIELD("DividendYield"),
    @XmlEnumValue("DividendStream")
    DIVIDEND_STREAM("DividendStream"),
    @XmlEnumValue("Volatility")
    VOLATILITY("Volatility"),
    @XmlEnumValue("VolCurve")
    VOL_CURVE("VolCurve"),
    @XmlEnumValue("VolSurface")
    VOL_SURFACE("VolSurface"),
    @XmlEnumValue("CapVol")
    CAP_VOL("CapVol"),
    @XmlEnumValue("SwaptionVol")
    SWAPTION_VOL("SwaptionVol"),
    @XmlEnumValue("Correlation")
    CORRELATION("Correlation"),
    @XmlEnumValue("CurveCorrelation")
    CURVE_CORRELATION("CurveCorrelation"),
    @XmlEnumValue("QuantoVol")
    QUANTO_VOL("QuantoVol"),
    @XmlEnumValue("QuantoCorr")
    QUANTO_CORR("QuantoCorr"),
    @XmlEnumValue("HullAndWhiteVol1")
    HULL_AND_WHITE_VOL_1("HullAndWhiteVol1"),
    @XmlEnumValue("HullAndWhiteVol2")
    HULL_AND_WHITE_VOL_2("HullAndWhiteVol2");
    private final String value;

    MarketDataType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MarketDataType fromValue(String v) {
        for (MarketDataType c: MarketDataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
