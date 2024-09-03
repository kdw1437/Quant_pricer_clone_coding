//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.3.0 버전을 통해 생성되었습니다. 
// <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2024.09.03 시간 11:35:07 PM KST 
//


package com.quant.pricer.common.input;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MarketDataMap complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MarketDataMap"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MarketDataType" type="{}MarketDataType"/&gt;
 *         &lt;element name="DataId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketDataMap", propOrder = {
    "marketDataType",
    "dataId"
})
public class MarketDataMap {

    @XmlElement(name = "MarketDataType", required = true)
    @XmlSchemaType(name = "string")
    protected MarketDataType marketDataType;
    @XmlElement(name = "DataId")
    protected String dataId;

    /**
     * marketDataType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link MarketDataType }
     *     
     */
    public MarketDataType getMarketDataType() {
        return marketDataType;
    }

    /**
     * marketDataType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketDataType }
     *     
     */
    public void setMarketDataType(MarketDataType value) {
        this.marketDataType = value;
    }

    /**
     * dataId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataId() {
        return dataId;
    }

    /**
     * dataId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataId(String value) {
        this.dataId = value;
    }

}
