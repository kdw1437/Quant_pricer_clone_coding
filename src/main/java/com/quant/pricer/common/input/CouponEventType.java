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
 * <p>CouponEventType에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="CouponEventType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Fixed"/&gt;
 *     &lt;enumeration value="FixedSeries"/&gt;
 *     &lt;enumeration value="Floating"/&gt;
 *     &lt;enumeration value="RangeAccrual"/&gt;
 *     &lt;enumeration value="DualRangeAccrual"/&gt;
 *     &lt;enumeration value="Steepner"/&gt;
 *     &lt;enumeration value="Discount"/&gt;
 *     &lt;enumeration value="FixedWithCondition"/&gt;
 *     &lt;enumeration value="FloatingWithCondition"/&gt;
 *     &lt;enumeration value="FixedOrPowerSpreadWithCondition"/&gt;
 *     &lt;enumeration value="FixedWithConditionHybrid"/&gt;
 *     &lt;enumeration value="FloatingWithConditionHybrid"/&gt;
 *     &lt;enumeration value="None"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CouponEventType")
@XmlEnum
public enum CouponEventType {

    @XmlEnumValue("Fixed")
    FIXED("Fixed"),
    @XmlEnumValue("FixedSeries")
    FIXED_SERIES("FixedSeries"),
    @XmlEnumValue("Floating")
    FLOATING("Floating"),
    @XmlEnumValue("RangeAccrual")
    RANGE_ACCRUAL("RangeAccrual"),
    @XmlEnumValue("DualRangeAccrual")
    DUAL_RANGE_ACCRUAL("DualRangeAccrual"),
    @XmlEnumValue("Steepner")
    STEEPNER("Steepner"),
    @XmlEnumValue("Discount")
    DISCOUNT("Discount"),
    @XmlEnumValue("FixedWithCondition")
    FIXED_WITH_CONDITION("FixedWithCondition"),
    @XmlEnumValue("FloatingWithCondition")
    FLOATING_WITH_CONDITION("FloatingWithCondition"),
    @XmlEnumValue("FixedOrPowerSpreadWithCondition")
    FIXED_OR_POWER_SPREAD_WITH_CONDITION("FixedOrPowerSpreadWithCondition"),
    @XmlEnumValue("FixedWithConditionHybrid")
    FIXED_WITH_CONDITION_HYBRID("FixedWithConditionHybrid"),
    @XmlEnumValue("FloatingWithConditionHybrid")
    FLOATING_WITH_CONDITION_HYBRID("FloatingWithConditionHybrid"),
    @XmlEnumValue("None")
    NONE("None");
    private final String value;

    CouponEventType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CouponEventType fromValue(String v) {
        for (CouponEventType c: CouponEventType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
