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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>VolSurface complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="VolSurface"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}AbstractMarketData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Tenors" type="{}ArrayOfTenor" minOccurs="0"/&gt;
 *         &lt;element name="SwapTenors" type="{}ArrayOfTenor1" minOccurs="0"/&gt;
 *         &lt;element name="Strikes" type="{}ArrayOfDecimal" minOccurs="0"/&gt;
 *         &lt;element name="Values" type="{}ArrayOfDecimal1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolSurface", propOrder = {
    "tenors",
    "swapTenors",
    "strikes",
    "values"
})
public class VolSurface
    extends AbstractMarketData
{

    @XmlElement(name = "Tenors")
    protected ArrayOfTenor tenors;
    @XmlElement(name = "SwapTenors")
    protected ArrayOfTenor1 swapTenors;
    @XmlElement(name = "Strikes")
    protected ArrayOfDecimal strikes;
    @XmlElement(name = "Values")
    protected ArrayOfDecimal1 values;

    /**
     * tenors 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTenor }
     *     
     */
    public ArrayOfTenor getTenors() {
        return tenors;
    }

    /**
     * tenors 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTenor }
     *     
     */
    public void setTenors(ArrayOfTenor value) {
        this.tenors = value;
    }

    /**
     * swapTenors 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTenor1 }
     *     
     */
    public ArrayOfTenor1 getSwapTenors() {
        return swapTenors;
    }

    /**
     * swapTenors 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTenor1 }
     *     
     */
    public void setSwapTenors(ArrayOfTenor1 value) {
        this.swapTenors = value;
    }

    /**
     * strikes 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDecimal }
     *     
     */
    public ArrayOfDecimal getStrikes() {
        return strikes;
    }

    /**
     * strikes 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDecimal }
     *     
     */
    public void setStrikes(ArrayOfDecimal value) {
        this.strikes = value;
    }

    /**
     * values 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDecimal1 }
     *     
     */
    public ArrayOfDecimal1 getValues() {
        return values;
    }

    /**
     * values 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDecimal1 }
     *     
     */
    public void setValues(ArrayOfDecimal1 value) {
        this.values = value;
    }

}
