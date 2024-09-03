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
 * <p>UnderlyingType에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="UnderlyingType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="StockIndex"/&gt;
 *     &lt;enumeration value="Stock"/&gt;
 *     &lt;enumeration value="InterestRate"/&gt;
 *     &lt;enumeration value="Forex"/&gt;
 *     &lt;enumeration value="Commodity"/&gt;
 *     &lt;enumeration value="Credit"/&gt;
 *     &lt;enumeration value="Bond"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UnderlyingType")
@XmlEnum
public enum UnderlyingType {

    @XmlEnumValue("StockIndex")
    STOCK_INDEX("StockIndex"),
    @XmlEnumValue("Stock")
    STOCK("Stock"),
    @XmlEnumValue("InterestRate")
    INTEREST_RATE("InterestRate"),
    @XmlEnumValue("Forex")
    FOREX("Forex"),
    @XmlEnumValue("Commodity")
    COMMODITY("Commodity"),
    @XmlEnumValue("Credit")
    CREDIT("Credit"),
    @XmlEnumValue("Bond")
    BOND("Bond");
    private final String value;

    UnderlyingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnderlyingType fromValue(String v) {
        for (UnderlyingType c: UnderlyingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
