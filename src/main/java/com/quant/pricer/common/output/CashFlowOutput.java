//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.3.0 버전을 통해 생성되었습니다. 
// <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2024.09.03 시간 11:35:08 PM KST 
//


package com.quant.pricer.common.output;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CashFlowOutput complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CashFlowOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ScenarioNo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PayDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Principal" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Coupon" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="PayOrReceive" type="{}PayOrReceive"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnitEvalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
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
@XmlType(name = "CashFlowOutput", propOrder = {
    "scenarioNo",
    "payDate",
    "principal",
    "coupon",
    "payOrReceive",
    "currency",
    "unitEvalAmount"
})
public class CashFlowOutput {

    @XmlElement(name = "ScenarioNo")
    protected int scenarioNo;
    @XmlElement(name = "PayDate")
    protected String payDate;
    @XmlElement(name = "Principal", required = true)
    protected BigDecimal principal;
    @XmlElement(name = "Coupon", required = true)
    protected BigDecimal coupon;
    @XmlElement(name = "PayOrReceive", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected PayOrReceive payOrReceive;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "UnitEvalAmount", required = true)
    protected BigDecimal unitEvalAmount;
    @XmlAttribute(name = "No", required = true)
    protected int no;

    /**
     * scenarioNo 속성의 값을 가져옵니다.
     * 
     */
    public int getScenarioNo() {
        return scenarioNo;
    }

    /**
     * scenarioNo 속성의 값을 설정합니다.
     * 
     */
    public void setScenarioNo(int value) {
        this.scenarioNo = value;
    }

    /**
     * payDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayDate() {
        return payDate;
    }

    /**
     * payDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayDate(String value) {
        this.payDate = value;
    }

    /**
     * principal 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrincipal() {
        return principal;
    }

    /**
     * principal 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrincipal(BigDecimal value) {
        this.principal = value;
    }

    /**
     * coupon 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoupon() {
        return coupon;
    }

    /**
     * coupon 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoupon(BigDecimal value) {
        this.coupon = value;
    }

    /**
     * payOrReceive 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PayOrReceive }
     *     
     */
    public PayOrReceive getPayOrReceive() {
        return payOrReceive;
    }

    /**
     * payOrReceive 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PayOrReceive }
     *     
     */
    public void setPayOrReceive(PayOrReceive value) {
        this.payOrReceive = value;
    }

    /**
     * currency 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * currency 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * unitEvalAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitEvalAmount() {
        return unitEvalAmount;
    }

    /**
     * unitEvalAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitEvalAmount(BigDecimal value) {
        this.unitEvalAmount = value;
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
