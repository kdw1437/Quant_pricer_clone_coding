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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Instrument complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="Instrument"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{}InstrumentType"/&gt;
 *         &lt;element name="DetailType" type="{}InstrumentDetailType"/&gt;
 *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TerminationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InitialPriceDeterminateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrincipalExchangeType" type="{}PrincipalExchangeType"/&gt;
 *         &lt;element name="InitPrincipalExchangeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TermPrincipalExchangeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrincipalRedemptionRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ProtectionType" type="{}ProtectionType"/&gt;
 *         &lt;element name="SettleDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnitAmount" type="{}Money" minOccurs="0"/&gt;
 *         &lt;element name="CounterUnitAmount" type="{}Money" minOccurs="0"/&gt;
 *         &lt;element name="ContractPrice" type="{}Money" minOccurs="0"/&gt;
 *         &lt;element name="Underlyings" type="{}ArrayOfUnderlying" minOccurs="0"/&gt;
 *         &lt;element name="ExerciseEvents" type="{}ArrayOfExerciseEvent" minOccurs="0"/&gt;
 *         &lt;element name="ExoticEvents" type="{}ArrayOfExoticEvent" minOccurs="0"/&gt;
 *         &lt;element name="CouponEvents" type="{}ArrayOfCouponEvent" minOccurs="0"/&gt;
 *         &lt;element name="Legs" type="{}ArrayOfLeg" minOccurs="0"/&gt;
 *         &lt;element name="AddInfo" type="{}AdditionalInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Instrument", propOrder = {
    "id",
    "name",
    "type",
    "detailType",
    "effectiveDate",
    "terminationDate",
    "initialPriceDeterminateDate",
    "principalExchangeType",
    "initPrincipalExchangeDate",
    "termPrincipalExchangeDate",
    "principalRedemptionRate",
    "protectionType",
    "settleDate",
    "unitAmount",
    "counterUnitAmount",
    "contractPrice",
    "underlyings",
    "exerciseEvents",
    "exoticEvents",
    "couponEvents",
    "legs",
    "addInfo"
})
public class Instrument {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected InstrumentType type;
    @XmlElement(name = "DetailType", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected InstrumentDetailType detailType;
    @XmlElement(name = "EffectiveDate")
    protected String effectiveDate;
    @XmlElement(name = "TerminationDate")
    protected String terminationDate;
    @XmlElement(name = "InitialPriceDeterminateDate")
    protected String initialPriceDeterminateDate;
    @XmlElement(name = "PrincipalExchangeType", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected PrincipalExchangeType principalExchangeType;
    @XmlElement(name = "InitPrincipalExchangeDate")
    protected String initPrincipalExchangeDate;
    @XmlElement(name = "TermPrincipalExchangeDate")
    protected String termPrincipalExchangeDate;
    @XmlElement(name = "PrincipalRedemptionRate", required = true, nillable = true)
    protected BigDecimal principalRedemptionRate;
    @XmlElement(name = "ProtectionType", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected ProtectionType protectionType;
    @XmlElement(name = "SettleDate")
    protected String settleDate;
    @XmlElement(name = "UnitAmount")
    protected Money unitAmount;
    @XmlElement(name = "CounterUnitAmount")
    protected Money counterUnitAmount;
    @XmlElement(name = "ContractPrice")
    protected Money contractPrice;
    @XmlElement(name = "Underlyings")
    protected ArrayOfUnderlying underlyings;
    @XmlElement(name = "ExerciseEvents")
    protected ArrayOfExerciseEvent exerciseEvents;
    @XmlElement(name = "ExoticEvents")
    protected ArrayOfExoticEvent exoticEvents;
    @XmlElement(name = "CouponEvents")
    protected ArrayOfCouponEvent couponEvents;
    @XmlElement(name = "Legs")
    protected ArrayOfLeg legs;
    @XmlElement(name = "AddInfo")
    protected AdditionalInfo addInfo;

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
     * name 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * name 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * type 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentType }
     *     
     */
    public InstrumentType getType() {
        return type;
    }

    /**
     * type 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentType }
     *     
     */
    public void setType(InstrumentType value) {
        this.type = value;
    }

    /**
     * detailType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentDetailType }
     *     
     */
    public InstrumentDetailType getDetailType() {
        return detailType;
    }

    /**
     * detailType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentDetailType }
     *     
     */
    public void setDetailType(InstrumentDetailType value) {
        this.detailType = value;
    }

    /**
     * effectiveDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * effectiveDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveDate(String value) {
        this.effectiveDate = value;
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
     * initialPriceDeterminateDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialPriceDeterminateDate() {
        return initialPriceDeterminateDate;
    }

    /**
     * initialPriceDeterminateDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialPriceDeterminateDate(String value) {
        this.initialPriceDeterminateDate = value;
    }

    /**
     * principalExchangeType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PrincipalExchangeType }
     *     
     */
    public PrincipalExchangeType getPrincipalExchangeType() {
        return principalExchangeType;
    }

    /**
     * principalExchangeType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincipalExchangeType }
     *     
     */
    public void setPrincipalExchangeType(PrincipalExchangeType value) {
        this.principalExchangeType = value;
    }

    /**
     * initPrincipalExchangeDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitPrincipalExchangeDate() {
        return initPrincipalExchangeDate;
    }

    /**
     * initPrincipalExchangeDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitPrincipalExchangeDate(String value) {
        this.initPrincipalExchangeDate = value;
    }

    /**
     * termPrincipalExchangeDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermPrincipalExchangeDate() {
        return termPrincipalExchangeDate;
    }

    /**
     * termPrincipalExchangeDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermPrincipalExchangeDate(String value) {
        this.termPrincipalExchangeDate = value;
    }

    /**
     * principalRedemptionRate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrincipalRedemptionRate() {
        return principalRedemptionRate;
    }

    /**
     * principalRedemptionRate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrincipalRedemptionRate(BigDecimal value) {
        this.principalRedemptionRate = value;
    }

    /**
     * protectionType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ProtectionType }
     *     
     */
    public ProtectionType getProtectionType() {
        return protectionType;
    }

    /**
     * protectionType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectionType }
     *     
     */
    public void setProtectionType(ProtectionType value) {
        this.protectionType = value;
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
     * contractPrice 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getContractPrice() {
        return contractPrice;
    }

    /**
     * contractPrice 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setContractPrice(Money value) {
        this.contractPrice = value;
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
     * legs 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLeg }
     *     
     */
    public ArrayOfLeg getLegs() {
        return legs;
    }

    /**
     * legs 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLeg }
     *     
     */
    public void setLegs(ArrayOfLeg value) {
        this.legs = value;
    }

    /**
     * addInfo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInfo }
     *     
     */
    public AdditionalInfo getAddInfo() {
        return addInfo;
    }

    /**
     * addInfo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInfo }
     *     
     */
    public void setAddInfo(AdditionalInfo value) {
        this.addInfo = value;
    }

}
