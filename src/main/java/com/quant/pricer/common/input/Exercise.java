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
 * <p>Exercise complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="Exercise"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExerciseBeginDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExerciseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExerciseDate2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExerciseDate3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SettleDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsObservStopDate" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="EjectedUnderlying" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Strike" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Yield" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Strike2" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Yield2" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="RangePartRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="PayRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
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
@XmlType(name = "Exercise", propOrder = {
    "exerciseBeginDate",
    "exerciseDate",
    "exerciseDate2",
    "exerciseDate3",
    "settleDate",
    "isObservStopDate",
    "ejectedUnderlying",
    "strike",
    "yield",
    "strike2",
    "yield2",
    "rangePartRate",
    "payRate"
})
public class Exercise {

    @XmlElement(name = "ExerciseBeginDate")
    protected String exerciseBeginDate;
    @XmlElement(name = "ExerciseDate")
    protected String exerciseDate;
    @XmlElement(name = "ExerciseDate2")
    protected String exerciseDate2;
    @XmlElement(name = "ExerciseDate3")
    protected String exerciseDate3;
    @XmlElement(name = "SettleDate")
    protected String settleDate;
    @XmlElement(name = "IsObservStopDate", required = true, type = Boolean.class, nillable = true)
    protected Boolean isObservStopDate;
    @XmlElement(name = "EjectedUnderlying")
    protected String ejectedUnderlying;
    @XmlElement(name = "Strike", required = true)
    protected BigDecimal strike;
    @XmlElement(name = "Yield", required = true, nillable = true)
    protected BigDecimal yield;
    @XmlElement(name = "Strike2", required = true, nillable = true)
    protected BigDecimal strike2;
    @XmlElement(name = "Yield2", required = true, nillable = true)
    protected BigDecimal yield2;
    @XmlElement(name = "RangePartRate", required = true, nillable = true)
    protected BigDecimal rangePartRate;
    @XmlElement(name = "PayRate", required = true, nillable = true)
    protected BigDecimal payRate;
    @XmlAttribute(name = "No", required = true)
    protected int no;

    /**
     * exerciseBeginDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExerciseBeginDate() {
        return exerciseBeginDate;
    }

    /**
     * exerciseBeginDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExerciseBeginDate(String value) {
        this.exerciseBeginDate = value;
    }

    /**
     * exerciseDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExerciseDate() {
        return exerciseDate;
    }

    /**
     * exerciseDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExerciseDate(String value) {
        this.exerciseDate = value;
    }

    /**
     * exerciseDate2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExerciseDate2() {
        return exerciseDate2;
    }

    /**
     * exerciseDate2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExerciseDate2(String value) {
        this.exerciseDate2 = value;
    }

    /**
     * exerciseDate3 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExerciseDate3() {
        return exerciseDate3;
    }

    /**
     * exerciseDate3 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExerciseDate3(String value) {
        this.exerciseDate3 = value;
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
     * isObservStopDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsObservStopDate() {
        return isObservStopDate;
    }

    /**
     * isObservStopDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsObservStopDate(Boolean value) {
        this.isObservStopDate = value;
    }

    /**
     * ejectedUnderlying 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEjectedUnderlying() {
        return ejectedUnderlying;
    }

    /**
     * ejectedUnderlying 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEjectedUnderlying(String value) {
        this.ejectedUnderlying = value;
    }

    /**
     * strike 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStrike() {
        return strike;
    }

    /**
     * strike 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStrike(BigDecimal value) {
        this.strike = value;
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
     * strike2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStrike2() {
        return strike2;
    }

    /**
     * strike2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStrike2(BigDecimal value) {
        this.strike2 = value;
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
     * rangePartRate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRangePartRate() {
        return rangePartRate;
    }

    /**
     * rangePartRate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRangePartRate(BigDecimal value) {
        this.rangePartRate = value;
    }

    /**
     * payRate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPayRate() {
        return payRate;
    }

    /**
     * payRate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPayRate(BigDecimal value) {
        this.payRate = value;
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
