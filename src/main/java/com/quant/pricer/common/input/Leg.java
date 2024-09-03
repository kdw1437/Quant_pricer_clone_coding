//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.3.0 버전을 통해 생성되었습니다. 
// <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2024.09.03 시간 11:35:07 PM KST 
//


package com.quant.pricer.common.input;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Leg complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="Leg"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PayOrReceive" type="{}PayOrReceive"/&gt;
 *         &lt;element name="TerminationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnitAmount" type="{}Money" minOccurs="0"/&gt;
 *         &lt;element name="CounterUnitAmount" type="{}Money" minOccurs="0"/&gt;
 *         &lt;element name="Underlyings" type="{}ArrayOfUnderlying" minOccurs="0"/&gt;
 *         &lt;element name="ExerciseEvents" type="{}ArrayOfExerciseEvent" minOccurs="0"/&gt;
 *         &lt;element name="ExoticEvents" type="{}ArrayOfExoticEvent" minOccurs="0"/&gt;
 *         &lt;element name="CouponEvents" type="{}ArrayOfCouponEvent" minOccurs="0"/&gt;
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
@XmlType(name = "Leg", propOrder = {
    "payOrReceive",
    "terminationDate",
    "unitAmount",
    "counterUnitAmount",
    "underlyings",
    "exerciseEvents",
    "exoticEvents",
    "couponEvents"
})
public class Leg {

    @XmlElement(name = "PayOrReceive", required = true)
    @XmlSchemaType(name = "string")
    protected PayOrReceive payOrReceive;
    @XmlElement(name = "TerminationDate")
    protected String terminationDate;
    @XmlElement(name = "UnitAmount")
    protected Money unitAmount;
    @XmlElement(name = "CounterUnitAmount")
    protected Money counterUnitAmount;
    @XmlElement(name = "Underlyings")
    protected ArrayOfUnderlying underlyings;
    @XmlElement(name = "ExerciseEvents")
    protected ArrayOfExerciseEvent exerciseEvents;
    @XmlElement(name = "ExoticEvents")
    protected ArrayOfExoticEvent exoticEvents;
    @XmlElement(name = "CouponEvents")
    protected ArrayOfCouponEvent couponEvents;
    @XmlAttribute(name = "No", required = true)
    protected int no;

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
     * terminationDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminationDate() {
        return terminationDate;
    }

    /**
     * terminationDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminationDate(String value) {
        this.terminationDate = value;
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
     * counterUnitAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getCounterUnitAmount() {
        return counterUnitAmount;
    }

    /**
     * counterUnitAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setCounterUnitAmount(Money value) {
        this.counterUnitAmount = value;
    }

    /**
     * underlyings 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUnderlying }
     *     
     */
    public ArrayOfUnderlying getUnderlyings() {
        return underlyings;
    }

    /**
     * underlyings 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUnderlying }
     *     
     */
    public void setUnderlyings(ArrayOfUnderlying value) {
        this.underlyings = value;
    }

    /**
     * exerciseEvents 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExerciseEvent }
     *     
     */
    public ArrayOfExerciseEvent getExerciseEvents() {
        return exerciseEvents;
    }

    /**
     * exerciseEvents 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExerciseEvent }
     *     
     */
    public void setExerciseEvents(ArrayOfExerciseEvent value) {
        this.exerciseEvents = value;
    }

    /**
     * exoticEvents 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExoticEvent }
     *     
     */
    public ArrayOfExoticEvent getExoticEvents() {
        return exoticEvents;
    }

    /**
     * exoticEvents 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExoticEvent }
     *     
     */
    public void setExoticEvents(ArrayOfExoticEvent value) {
        this.exoticEvents = value;
    }

    /**
     * couponEvents 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCouponEvent }
     *     
     */
    public ArrayOfCouponEvent getCouponEvents() {
        return couponEvents;
    }

    /**
     * couponEvents 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCouponEvent }
     *     
     */
    public void setCouponEvents(ArrayOfCouponEvent value) {
        this.couponEvents = value;
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
