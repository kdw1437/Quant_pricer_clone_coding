//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.3.0 버전을 통해 생성되었습니다. 
// <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2024.09.03 시간 11:35:08 PM KST 
//


package com.quant.pricer.common.output;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SensitivityType에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="SensitivityType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PV01"/&gt;
 *     &lt;enumeration value="TenorPV01"/&gt;
 *     &lt;enumeration value="ModifiedDuration"/&gt;
 *     &lt;enumeration value="MacaulyDuration"/&gt;
 *     &lt;enumeration value="Convexity"/&gt;
 *     &lt;enumeration value="Delta"/&gt;
 *     &lt;enumeration value="Gamma"/&gt;
 *     &lt;enumeration value="Vega"/&gt;
 *     &lt;enumeration value="Theta"/&gt;
 *     &lt;enumeration value="Rho"/&gt;
 *     &lt;enumeration value="Vanna"/&gt;
 *     &lt;enumeration value="Charm"/&gt;
 *     &lt;enumeration value="CrossGamma"/&gt;
 *     &lt;enumeration value="CrossVanna"/&gt;
 *     &lt;enumeration value="Cega"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SensitivityType")
@XmlEnum
public enum SensitivityType {

    @XmlEnumValue("PV01")
    PV_01("PV01"),
    @XmlEnumValue("TenorPV01")
    TENOR_PV_01("TenorPV01"),
    @XmlEnumValue("ModifiedDuration")
    MODIFIED_DURATION("ModifiedDuration"),
    @XmlEnumValue("MacaulyDuration")
    MACAULY_DURATION("MacaulyDuration"),
    @XmlEnumValue("Convexity")
    CONVEXITY("Convexity"),
    @XmlEnumValue("Delta")
    DELTA("Delta"),
    @XmlEnumValue("Gamma")
    GAMMA("Gamma"),
    @XmlEnumValue("Vega")
    VEGA("Vega"),
    @XmlEnumValue("Theta")
    THETA("Theta"),
    @XmlEnumValue("Rho")
    RHO("Rho"),
    @XmlEnumValue("Vanna")
    VANNA("Vanna"),
    @XmlEnumValue("Charm")
    CHARM("Charm"),
    @XmlEnumValue("CrossGamma")
    CROSS_GAMMA("CrossGamma"),
    @XmlEnumValue("CrossVanna")
    CROSS_VANNA("CrossVanna"),
    @XmlEnumValue("Cega")
    CEGA("Cega");
    private final String value;

    SensitivityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SensitivityType fromValue(String v) {
        for (SensitivityType c: SensitivityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
