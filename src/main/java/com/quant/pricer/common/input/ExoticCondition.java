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
 * <p>ExoticCondition complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ExoticCondition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObservBeginDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ObservEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SettleDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConditionValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Yield" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ConditionValue2" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Yield2" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="IsHit" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
@XmlType(name = "ExoticCondition", propOrder = {
    "observBeginDate",
    "observEndDate",
    "settleDate",
    "conditionValue",
    "yield",
    "conditionValue2",
    "yield2",
    "isHit"
})
public class ExoticCondition {

    @XmlElement(name = "ObservBeginDate")
    protected String observBeginDate;
    @XmlElement(name = "ObservEndDate")
    protected String observEndDate;
    @XmlElement(name = "SettleDate")
    protected String settleDate;
    @XmlElement(name = "ConditionValue", required = true)
    protected BigDecimal conditionValue;
    @XmlElement(name = "Yield", required = true, nillable = true)
    protected BigDecimal yield;
    @XmlElement(name = "ConditionValue2", required = true, nillable = true)
    protected BigDecimal conditionValue2;
    @XmlElement(name = "Yield2", required = true, nillable = true)
    protected BigDecimal yield2;
    @XmlElement(name = "IsHit")
    protected boolean isHit;
    @XmlAttribute(name = "No", required = true)
    protected int no;

    /**
     * observBeginDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservBeginDate() {
        return observBeginDate;
    }

    /**
     * observBeginDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservBeginDate(String value) {
        this.observBeginDate = value;
    }

    /**
     * observEndDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservEndDate() {
        return observEndDate;
    }

    /**
     * observEndDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservEndDate(String value) {
        this.observEndDate = value;
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
     * conditionValue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConditionValue() {
        return conditionValue;
    }

    /**
     * conditionValue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConditionValue(BigDecimal value) {
        this.conditionValue = value;
    }

    /**
     * yield 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getYield() {
        return yield;
    }

    /**
     * yield 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setYield(BigDecimal value) {
        this.yield = value;
    }

    /**
     * conditionValue2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConditionValue2() {
        return conditionValue2;
    }

    /**
     * conditionValue2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConditionValue2(BigDecimal value) {
        this.conditionValue2 = value;
    }

    /**
     * yield2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getYield2() {
        return yield2;
    }

    /**
     * yield2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setYield2(BigDecimal value) {
        this.yield2 = value;
    }

    /**
     * isHit 속성의 값을 가져옵니다.
     * 
     */
    public boolean isIsHit() {
        return isHit;
    }

    /**
     * isHit 속성의 값을 설정합니다.
     * 
     */
    public void setIsHit(boolean value) {
        this.isHit = value;
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
