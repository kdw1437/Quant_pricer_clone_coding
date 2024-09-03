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
 * <p>PrincipalExchangeType에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="PrincipalExchangeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Initial"/&gt;
 *     &lt;enumeration value="Termination"/&gt;
 *     &lt;enumeration value="InitialAndTermination"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PrincipalExchangeType")
@XmlEnum
public enum PrincipalExchangeType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Initial")
    INITIAL("Initial"),
    @XmlEnumValue("Termination")
    TERMINATION("Termination"),
    @XmlEnumValue("InitialAndTermination")
    INITIAL_AND_TERMINATION("InitialAndTermination");
    private final String value;

    PrincipalExchangeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrincipalExchangeType fromValue(String v) {
        for (PrincipalExchangeType c: PrincipalExchangeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
