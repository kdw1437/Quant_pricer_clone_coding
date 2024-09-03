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
 * <p>InstrumentType에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="InstrumentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FRA"/&gt;
 *     &lt;enumeration value="FRN"/&gt;
 *     &lt;enumeration value="FXForward"/&gt;
 *     &lt;enumeration value="FXSpot"/&gt;
 *     &lt;enumeration value="VanillaOption"/&gt;
 *     &lt;enumeration value="BarrierOption"/&gt;
 *     &lt;enumeration value="TwoWayKnockOutBarrierOption"/&gt;
 *     &lt;enumeration value="DigitalOption"/&gt;
 *     &lt;enumeration value="StepDown"/&gt;
 *     &lt;enumeration value="Booster"/&gt;
 *     &lt;enumeration value="BEN"/&gt;
 *     &lt;enumeration value="KnockOut"/&gt;
 *     &lt;enumeration value="IRStructured"/&gt;
 *     &lt;enumeration value="CD"/&gt;
 *     &lt;enumeration value="CP"/&gt;
 *     &lt;enumeration value="IRS"/&gt;
 *     &lt;enumeration value="CRS"/&gt;
 *     &lt;enumeration value="FXSwap"/&gt;
 *     &lt;enumeration value="CLN"/&gt;
 *     &lt;enumeration value="CDS"/&gt;
 *     &lt;enumeration value="TRS"/&gt;
 *     &lt;enumeration value="PRS"/&gt;
 *     &lt;enumeration value="ZeroCouponBond"/&gt;
 *     &lt;enumeration value="SimpleBond"/&gt;
 *     &lt;enumeration value="CompoundBond"/&gt;
 *     &lt;enumeration value="Compound5Simlple2Bond"/&gt;
 *     &lt;enumeration value="CouponBond"/&gt;
 *     &lt;enumeration value="TIPS"/&gt;
 *     &lt;enumeration value="FixedCouponBond"/&gt;
 *     &lt;enumeration value="SimpleFRN"/&gt;
 *     &lt;enumeration value="ConvertibleBond"/&gt;
 *     &lt;enumeration value="BondWithWarrantSeparable"/&gt;
 *     &lt;enumeration value="BondWithWarrantNonSeparable"/&gt;
 *     &lt;enumeration value="ExchangeableBond"/&gt;
 *     &lt;enumeration value="EquityFutures"/&gt;
 *     &lt;enumeration value="KTBFutures"/&gt;
 *     &lt;enumeration value="FXFutures"/&gt;
 *     &lt;enumeration value="BondForward"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InstrumentType")
@XmlEnum
public enum InstrumentType {

    FRA("FRA"),
    FRN("FRN"),
    @XmlEnumValue("FXForward")
    FX_FORWARD("FXForward"),
    @XmlEnumValue("FXSpot")
    FX_SPOT("FXSpot"),
    @XmlEnumValue("VanillaOption")
    VANILLA_OPTION("VanillaOption"),
    @XmlEnumValue("BarrierOption")
    BARRIER_OPTION("BarrierOption"),
    @XmlEnumValue("TwoWayKnockOutBarrierOption")
    TWO_WAY_KNOCK_OUT_BARRIER_OPTION("TwoWayKnockOutBarrierOption"),
    @XmlEnumValue("DigitalOption")
    DIGITAL_OPTION("DigitalOption"),
    @XmlEnumValue("StepDown")
    STEP_DOWN("StepDown"),
    @XmlEnumValue("Booster")
    BOOSTER("Booster"),
    BEN("BEN"),
    @XmlEnumValue("KnockOut")
    KNOCK_OUT("KnockOut"),
    @XmlEnumValue("IRStructured")
    IR_STRUCTURED("IRStructured"),
    CD("CD"),
    CP("CP"),
    IRS("IRS"),
    CRS("CRS"),
    @XmlEnumValue("FXSwap")
    FX_SWAP("FXSwap"),
    CLN("CLN"),
    CDS("CDS"),
    TRS("TRS"),
    PRS("PRS"),
    @XmlEnumValue("ZeroCouponBond")
    ZERO_COUPON_BOND("ZeroCouponBond"),
    @XmlEnumValue("SimpleBond")
    SIMPLE_BOND("SimpleBond"),
    @XmlEnumValue("CompoundBond")
    COMPOUND_BOND("CompoundBond"),
    @XmlEnumValue("Compound5Simlple2Bond")
    COMPOUND_5_SIMLPLE_2_BOND("Compound5Simlple2Bond"),
    @XmlEnumValue("CouponBond")
    COUPON_BOND("CouponBond"),
    TIPS("TIPS"),
    @XmlEnumValue("FixedCouponBond")
    FIXED_COUPON_BOND("FixedCouponBond"),
    @XmlEnumValue("SimpleFRN")
    SIMPLE_FRN("SimpleFRN"),
    @XmlEnumValue("ConvertibleBond")
    CONVERTIBLE_BOND("ConvertibleBond"),
    @XmlEnumValue("BondWithWarrantSeparable")
    BOND_WITH_WARRANT_SEPARABLE("BondWithWarrantSeparable"),
    @XmlEnumValue("BondWithWarrantNonSeparable")
    BOND_WITH_WARRANT_NON_SEPARABLE("BondWithWarrantNonSeparable"),
    @XmlEnumValue("ExchangeableBond")
    EXCHANGEABLE_BOND("ExchangeableBond"),
    @XmlEnumValue("EquityFutures")
    EQUITY_FUTURES("EquityFutures"),
    @XmlEnumValue("KTBFutures")
    KTB_FUTURES("KTBFutures"),
    @XmlEnumValue("FXFutures")
    FX_FUTURES("FXFutures"),
    @XmlEnumValue("BondForward")
    BOND_FORWARD("BondForward");
    private final String value;

    InstrumentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InstrumentType fromValue(String v) {
        for (InstrumentType c: InstrumentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
