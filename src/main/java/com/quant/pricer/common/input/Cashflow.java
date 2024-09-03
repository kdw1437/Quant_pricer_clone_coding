//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.3.0 버전을 통해 생성되었습니다. 
// <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2024.09.03 시간 11:35:07 PM KST 
//


package com.quant.pricer.common.input;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Cashflow complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="Cashflow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResetDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SettleDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnitAmount" type="{}Money" minOccurs="0"/&gt;
 *         &lt;element name="FixingIr" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="PayoffNo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ConditionResetDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="No" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cashflow", propOrder = {
    "resetDate",
    "beginDate",
    "endDate",
    "settleDate",
    "unitAmount",
    "fixingIr",
    "payoffNo",
    "conditionResetDate"
})
public class Cashflow {

    @XmlElement(name = "ResetDate")
    protected String resetDate;
    @XmlElement(name = "BeginDate")
    protected String beginDate;
    @XmlElement(name = "EndDate")
    protected String endDate;
    @XmlElement(name = "SettleDate")
    protected String settleDate;
    @XmlElement(name = "UnitAmount")
    protected Money unitAmount;
    @XmlElement(name = "FixingIr", required = true, nillable = true)
    protected BigDecimal fixingIr;
    @XmlElement(name = "PayoffNo")
    protected int payoffNo;
    @XmlElement(name = "ConditionResetDate")
    protected String conditionResetDate;
    @XmlAttribute(name = "No", required = true)
    protected int no;

    /**
     * resetDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResetDate() {
        return resetDate;
    }

    /**
     * resetDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResetDate(String value) {
        this.resetDate = value;
    }

    /**
     * beginDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeginDate() {
        return beginDate;
    }

    /**
     * beginDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginDate(String value) {
        this.beginDate = value;
    }

    /**
     * endDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * endDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * settleDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettleDate() {
        return settleDate;
    }

    /**
     * settleDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettleDate(String value) {
        this.settleDate = value;
    }

    /**
     * unitAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getUnitAmount() {
        return unitAmount;
    }

    /**
     * unitAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setUnitAmount(Money value) {
        this.unitAmount = value;
    }

    /**
     * fixingIr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFixingIr() {
        return fixingIr;
    }

    /**
     * fixingIr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFixingIr(BigDecimal value) {
        this.fixingIr = value;
    }

    /**
     * payoffNo 속성의 값을 가져옵니다.
     * 
     */
    public int getPayoffNo() {
        return payoffNo;
    }

    /**
     * payoffNo 속성의 값을 설정합니다.
     * 
     */
    public void setPayoffNo(int value) {
        this.payoffNo = value;
    }

    /**
     * conditionResetDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionResetDate() {
        return conditionResetDate;
    }

    /**
     * conditionResetDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionResetDate(String value) {
        this.conditionResetDate = value;
    }

    /**
     * no 속성의 값을 가져옵니다.
     * 
     */
    public int getNo() {
        return no;
    }

    /**
     * no 속성의 값을 설정합니다.
     * 
     */
    public void setNo(int value) {
        this.no = value;
    }

}
