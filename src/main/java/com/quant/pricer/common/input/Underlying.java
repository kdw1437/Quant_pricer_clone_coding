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
 * <p>Underlying complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="Underlying"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{}UnderlyingType"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CounterCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TenorYear" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CouponFreqYear" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Coupon" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="DayCountConvention" type="{}DayCountConvention"/&gt;
 *         &lt;element name="ExchangeRateType" type="{}ExchangeRateType"/&gt;
 *         &lt;element name="Instrument" type="{}Instrument" minOccurs="0"/&gt;
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
@XmlType(name = "Underlying", propOrder = {
    "id",
    "name",
    "type",
    "currency",
    "counterCurrency",
    "tenorYear",
    "couponFreqYear",
    "coupon",
    "dayCountConvention",
    "exchangeRateType",
    "instrument"
})
public class Underlying {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected UnderlyingType type;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "CounterCurrency")
    protected String counterCurrency;
    @XmlElement(name = "TenorYear", required = true, nillable = true)
    protected BigDecimal tenorYear;
    @XmlElement(name = "CouponFreqYear", required = true, nillable = true)
    protected BigDecimal couponFreqYear;
    @XmlElement(name = "Coupon", required = true, nillable = true)
    protected BigDecimal coupon;
    @XmlElement(name = "DayCountConvention", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected DayCountConvention dayCountConvention;
    @XmlElement(name = "ExchangeRateType", required = true)
    @XmlSchemaType(name = "string")
    protected ExchangeRateType exchangeRateType;
    @XmlElement(name = "Instrument")
    protected Instrument instrument;
    @XmlAttribute(name = "No", required = true)
    protected int no;

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
     *     {@link UnderlyingType }
     *     
     */
    public UnderlyingType getType() {
        return type;
    }

    /**
     * type 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingType }
     *     
     */
    public void setType(UnderlyingType value) {
        this.type = value;
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
     * counterCurrency 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounterCurrency() {
        return counterCurrency;
    }

    /**
     * counterCurrency 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounterCurrency(String value) {
        this.counterCurrency = value;
    }

    /**
     * tenorYear 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTenorYear() {
        return tenorYear;
    }

    /**
     * tenorYear 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTenorYear(BigDecimal value) {
        this.tenorYear = value;
    }

    /**
     * couponFreqYear 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCouponFreqYear() {
        return couponFreqYear;
    }

    /**
     * couponFreqYear 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCouponFreqYear(BigDecimal value) {
        this.couponFreqYear = value;
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
     * exchangeRateType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateType }
     *     
     */
    public ExchangeRateType getExchangeRateType() {
        return exchangeRateType;
    }

    /**
     * exchangeRateType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateType }
     *     
     */
    public void setExchangeRateType(ExchangeRateType value) {
        this.exchangeRateType = value;
    }

    /**
     * instrument 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Instrument }
     *     
     */
    public Instrument getInstrument() {
        return instrument;
    }

    /**
     * instrument 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Instrument }
     *     
     */
    public void setInstrument(Instrument value) {
        this.instrument = value;
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
