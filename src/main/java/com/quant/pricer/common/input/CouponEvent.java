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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CouponEvent complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CouponEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{}CouponEventType"/&gt;
 *         &lt;element name="PayoffNo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="FixedIr" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="FixedIr2" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ConditionType" type="{}ConditionType"/&gt;
 *         &lt;element name="ConditionTarget" type="{}ConditionTarget"/&gt;
 *         &lt;element name="ConditionValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="RefIrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Multiplier" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Spread" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="RefIr2Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Multiplier2" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="RefIr3Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Multiplier3" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="RefIr4Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Multiplier4" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="LowerRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="UpperRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Lower2Rate" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Upper2Rate" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="FloorRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CapRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CompoundFreqMonths" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CouponFreqMonths" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IsInstallmentRedemption" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="UnredeemedTermMonths" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="RedemptionFreqMonths" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="RedemptionCount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CalendarId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentTime" type="{}PaymentTime"/&gt;
 *         &lt;element name="DayCountConvention" type="{}DayCountConvention"/&gt;
 *         &lt;element name="Cashflows" type="{}ArrayOfCashflow" minOccurs="0"/&gt;
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
@XmlType(name = "CouponEvent", propOrder = {
    "type",
    "payoffNo",
    "fixedIr",
    "fixedIr2",
    "conditionType",
    "conditionTarget",
    "conditionValue",
    "refIrCode",
    "multiplier",
    "spread",
    "refIr2Code",
    "multiplier2",
    "refIr3Code",
    "multiplier3",
    "refIr4Code",
    "multiplier4",
    "lowerRate",
    "upperRate",
    "lower2Rate",
    "upper2Rate",
    "floorRate",
    "capRate",
    "compoundFreqMonths",
    "couponFreqMonths",
    "isInstallmentRedemption",
    "unredeemedTermMonths",
    "redemptionFreqMonths",
    "redemptionCount",
    "calendarId",
    "paymentTime",
    "dayCountConvention",
    "cashflows"
})
public class CouponEvent {

    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected CouponEventType type;
    @XmlElement(name = "PayoffNo", required = true, type = Integer.class, nillable = true)
    protected Integer payoffNo;
    @XmlElement(name = "FixedIr", required = true, nillable = true)
    protected BigDecimal fixedIr;
    @XmlElement(name = "FixedIr2", required = true, nillable = true)
    protected BigDecimal fixedIr2;
    @XmlElement(name = "ConditionType", required = true)
    @XmlSchemaType(name = "string")
    protected ConditionType conditionType;
    @XmlElement(name = "ConditionTarget", required = true)
    @XmlSchemaType(name = "string")
    protected ConditionTarget conditionTarget;
    @XmlElement(name = "ConditionValue", required = true, nillable = true)
    protected BigDecimal conditionValue;
    @XmlElement(name = "RefIrCode")
    protected String refIrCode;
    @XmlElement(name = "Multiplier", required = true, nillable = true)
    protected BigDecimal multiplier;
    @XmlElement(name = "Spread", required = true, nillable = true)
    protected BigDecimal spread;
    @XmlElement(name = "RefIr2Code")
    protected String refIr2Code;
    @XmlElement(name = "Multiplier2", required = true, nillable = true)
    protected BigDecimal multiplier2;
    @XmlElement(name = "RefIr3Code")
    protected String refIr3Code;
    @XmlElement(name = "Multiplier3", required = true, nillable = true)
    protected BigDecimal multiplier3;
    @XmlElement(name = "RefIr4Code")
    protected String refIr4Code;
    @XmlElement(name = "Multiplier4", required = true, nillable = true)
    protected BigDecimal multiplier4;
    @XmlElement(name = "LowerRate", required = true, nillable = true)
    protected BigDecimal lowerRate;
    @XmlElement(name = "UpperRate", required = true, nillable = true)
    protected BigDecimal upperRate;
    @XmlElement(name = "Lower2Rate", required = true, nillable = true)
    protected BigDecimal lower2Rate;
    @XmlElement(name = "Upper2Rate", required = true, nillable = true)
    protected BigDecimal upper2Rate;
    @XmlElement(name = "FloorRate", required = true, nillable = true)
    protected BigDecimal floorRate;
    @XmlElement(name = "CapRate", required = true, nillable = true)
    protected BigDecimal capRate;
    @XmlElement(name = "CompoundFreqMonths", required = true, type = Integer.class, nillable = true)
    protected Integer compoundFreqMonths;
    @XmlElement(name = "CouponFreqMonths", required = true, type = Integer.class, nillable = true)
    protected Integer couponFreqMonths;
    @XmlElement(name = "IsInstallmentRedemption", required = true, type = Boolean.class, nillable = true)
    protected Boolean isInstallmentRedemption;
    @XmlElement(name = "UnredeemedTermMonths", required = true, nillable = true)
    protected BigDecimal unredeemedTermMonths;
    @XmlElement(name = "RedemptionFreqMonths", required = true, nillable = true)
    protected BigDecimal redemptionFreqMonths;
    @XmlElement(name = "RedemptionCount", required = true, nillable = true)
    protected BigDecimal redemptionCount;
    @XmlElement(name = "CalendarId")
    protected String calendarId;
    @XmlElement(name = "PaymentTime", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected PaymentTime paymentTime;
    @XmlElement(name = "DayCountConvention", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected DayCountConvention dayCountConvention;
    @XmlElement(name = "Cashflows")
    protected ArrayOfCashflow cashflows;
    @XmlAttribute(name = "No", required = true)
    protected int no;

    /**
     * type 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CouponEventType }
     *     
     */
    public CouponEventType getType() {
        return type;
    }

    /**
     * type 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponEventType }
     *     
     */
    public void setType(CouponEventType value) {
        this.type = value;
    }

    /**
     * payoffNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPayoffNo() {
        return payoffNo;
    }

    /**
     * payoffNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPayoffNo(Integer value) {
        this.payoffNo = value;
    }

    /**
     * fixedIr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFixedIr() {
        return fixedIr;
    }

    /**
     * fixedIr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFixedIr(BigDecimal value) {
        this.fixedIr = value;
    }

    /**
     * fixedIr2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFixedIr2() {
        return fixedIr2;
    }

    /**
     * fixedIr2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFixedIr2(BigDecimal value) {
        this.fixedIr2 = value;
    }

    /**
     * conditionType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ConditionType }
     *     
     */
    public ConditionType getConditionType() {
        return conditionType;
    }

    /**
     * conditionType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionType }
     *     
     */
    public void setConditionType(ConditionType value) {
        this.conditionType = value;
    }

    /**
     * conditionTarget 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ConditionTarget }
     *     
     */
    public ConditionTarget getConditionTarget() {
        return conditionTarget;
    }

    /**
     * conditionTarget 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionTarget }
     *     
     */
    public void setConditionTarget(ConditionTarget value) {
        this.conditionTarget = value;
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
     * refIrCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefIrCode() {
        return refIrCode;
    }

    /**
     * refIrCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefIrCode(String value) {
        this.refIrCode = value;
    }

    /**
     * multiplier 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMultiplier() {
        return multiplier;
    }

    /**
     * multiplier 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMultiplier(BigDecimal value) {
        this.multiplier = value;
    }

    /**
     * spread 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpread() {
        return spread;
    }

    /**
     * spread 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpread(BigDecimal value) {
        this.spread = value;
    }

    /**
     * refIr2Code 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefIr2Code() {
        return refIr2Code;
    }

    /**
     * refIr2Code 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefIr2Code(String value) {
        this.refIr2Code = value;
    }

    /**
     * multiplier2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMultiplier2() {
        return multiplier2;
    }

    /**
     * multiplier2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMultiplier2(BigDecimal value) {
        this.multiplier2 = value;
    }

    /**
     * refIr3Code 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefIr3Code() {
        return refIr3Code;
    }

    /**
     * refIr3Code 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefIr3Code(String value) {
        this.refIr3Code = value;
    }

    /**
     * multiplier3 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMultiplier3() {
        return multiplier3;
    }

    /**
     * multiplier3 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMultiplier3(BigDecimal value) {
        this.multiplier3 = value;
    }

    /**
     * refIr4Code 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefIr4Code() {
        return refIr4Code;
    }

    /**
     * refIr4Code 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefIr4Code(String value) {
        this.refIr4Code = value;
    }

    /**
     * multiplier4 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMultiplier4() {
        return multiplier4;
    }

    /**
     * multiplier4 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMultiplier4(BigDecimal value) {
        this.multiplier4 = value;
    }

    /**
     * lowerRate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLowerRate() {
        return lowerRate;
    }

    /**
     * lowerRate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLowerRate(BigDecimal value) {
        this.lowerRate = value;
    }

    /**
     * upperRate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUpperRate() {
        return upperRate;
    }

    /**
     * upperRate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUpperRate(BigDecimal value) {
        this.upperRate = value;
    }

    /**
     * lower2Rate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLower2Rate() {
        return lower2Rate;
    }

    /**
     * lower2Rate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLower2Rate(BigDecimal value) {
        this.lower2Rate = value;
    }

    /**
     * upper2Rate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUpper2Rate() {
        return upper2Rate;
    }

    /**
     * upper2Rate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUpper2Rate(BigDecimal value) {
        this.upper2Rate = value;
    }

    /**
     * floorRate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFloorRate() {
        return floorRate;
    }

    /**
     * floorRate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFloorRate(BigDecimal value) {
        this.floorRate = value;
    }

    /**
     * capRate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCapRate() {
        return capRate;
    }

    /**
     * capRate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCapRate(BigDecimal value) {
        this.capRate = value;
    }

    /**
     * compoundFreqMonths 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCompoundFreqMonths() {
        return compoundFreqMonths;
    }

    /**
     * compoundFreqMonths 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCompoundFreqMonths(Integer value) {
        this.compoundFreqMonths = value;
    }

    /**
     * couponFreqMonths 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCouponFreqMonths() {
        return couponFreqMonths;
    }

    /**
     * couponFreqMonths 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCouponFreqMonths(Integer value) {
        this.couponFreqMonths = value;
    }

    /**
     * isInstallmentRedemption 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInstallmentRedemption() {
        return isInstallmentRedemption;
    }

    /**
     * isInstallmentRedemption 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInstallmentRedemption(Boolean value) {
        this.isInstallmentRedemption = value;
    }

    /**
     * unredeemedTermMonths 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnredeemedTermMonths() {
        return unredeemedTermMonths;
    }

    /**
     * unredeemedTermMonths 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnredeemedTermMonths(BigDecimal value) {
        this.unredeemedTermMonths = value;
    }

    /**
     * redemptionFreqMonths 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRedemptionFreqMonths() {
        return redemptionFreqMonths;
    }

    /**
     * redemptionFreqMonths 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRedemptionFreqMonths(BigDecimal value) {
        this.redemptionFreqMonths = value;
    }

    /**
     * redemptionCount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRedemptionCount() {
        return redemptionCount;
    }

    /**
     * redemptionCount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRedemptionCount(BigDecimal value) {
        this.redemptionCount = value;
    }

    /**
     * calendarId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalendarId() {
        return calendarId;
    }

    /**
     * calendarId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalendarId(String value) {
        this.calendarId = value;
    }

    /**
     * paymentTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTime }
     *     
     */
    public PaymentTime getPaymentTime() {
        return paymentTime;
    }

    /**
     * paymentTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTime }
     *     
     */
    public void setPaymentTime(PaymentTime value) {
        this.paymentTime = value;
    }

    /**
     * dayCountConvention 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DayCountConvention }
     *     
     */
    public DayCountConvention getDayCountConvention() {
        return dayCountConvention;
    }

    /**
     * dayCountConvention 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DayCountConvention }
     *     
     */
    public void setDayCountConvention(DayCountConvention value) {
        this.dayCountConvention = value;
    }

    /**
     * cashflows 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCashflow }
     *     
     */
    public ArrayOfCashflow getCashflows() {
        return cashflows;
    }

    /**
     * cashflows 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCashflow }
     *     
     */
    public void setCashflows(ArrayOfCashflow value) {
        this.cashflows = value;
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
