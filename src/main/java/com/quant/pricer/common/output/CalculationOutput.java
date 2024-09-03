//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.3.0 버전을 통해 생성되었습니다. 
// <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2024.09.03 시간 11:35:08 PM KST 
//


package com.quant.pricer.common.output;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CalculationOutput complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CalculationOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InsId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Client" type="{}Terminal" minOccurs="0"/&gt;
 *         &lt;element name="Prices" type="{}ArrayOfPriceOutput" minOccurs="0"/&gt;
 *         &lt;element name="Greeks" type="{}ArrayOfGreekOutput" minOccurs="0"/&gt;
 *         &lt;element name="CashFlows" type="{}ArrayOfCashFlowOutput" minOccurs="0"/&gt;
 *         &lt;element name="HWModelParams" type="{}ArrayOfHWModelParameter" minOccurs="0"/&gt;
 *         &lt;element name="WarnMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalculationOutput", propOrder = {
    "id",
    "insId",
    "type",
    "client",
    "prices",
    "greeks",
    "cashFlows",
    "hwModelParams",
    "warnMessage",
    "errorMessage"
})
public class CalculationOutput {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "InsId")
    protected String insId;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "Client")
    protected Terminal client;
    @XmlElement(name = "Prices")
    protected ArrayOfPriceOutput prices;
    @XmlElement(name = "Greeks")
    protected ArrayOfGreekOutput greeks;
    @XmlElement(name = "CashFlows")
    protected ArrayOfCashFlowOutput cashFlows;
    @XmlElement(name = "HWModelParams")
    protected ArrayOfHWModelParameter hwModelParams;
    @XmlElement(name = "WarnMessage")
    protected String warnMessage;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;

    /**
     * id 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * id 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * insId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsId() {
        return insId;
    }

    /**
     * insId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsId(String value) {
        this.insId = value;
    }

    /**
     * type 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * type 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * client 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Terminal }
     *     
     */
    public Terminal getClient() {
        return client;
    }

    /**
     * client 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Terminal }
     *     
     */
    public void setClient(Terminal value) {
        this.client = value;
    }

    /**
     * prices 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPriceOutput }
     *     
     */
    public ArrayOfPriceOutput getPrices() {
        return prices;
    }

    /**
     * prices 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPriceOutput }
     *     
     */
    public void setPrices(ArrayOfPriceOutput value) {
        this.prices = value;
    }

    /**
     * greeks 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGreekOutput }
     *     
     */
    public ArrayOfGreekOutput getGreeks() {
        return greeks;
    }

    /**
     * greeks 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGreekOutput }
     *     
     */
    public void setGreeks(ArrayOfGreekOutput value) {
        this.greeks = value;
    }

    /**
     * cashFlows 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCashFlowOutput }
     *     
     */
    public ArrayOfCashFlowOutput getCashFlows() {
        return cashFlows;
    }

    /**
     * cashFlows 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCashFlowOutput }
     *     
     */
    public void setCashFlows(ArrayOfCashFlowOutput value) {
        this.cashFlows = value;
    }

    /**
     * hwModelParams 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHWModelParameter }
     *     
     */
    public ArrayOfHWModelParameter getHWModelParams() {
        return hwModelParams;
    }

    /**
     * hwModelParams 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHWModelParameter }
     *     
     */
    public void setHWModelParams(ArrayOfHWModelParameter value) {
        this.hwModelParams = value;
    }

    /**
     * warnMessage 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarnMessage() {
        return warnMessage;
    }

    /**
     * warnMessage 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarnMessage(String value) {
        this.warnMessage = value;
    }

    /**
     * errorMessage 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * errorMessage 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

}
