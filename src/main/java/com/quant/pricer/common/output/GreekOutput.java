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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GreekOutput complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="GreekOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ScenarioNo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="FactorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SensitivityType" type="{}SensitivityType"/&gt;
 *         &lt;element name="Delta" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Gamma" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GreekOutput", propOrder = {
    "scenarioNo",
    "factorId",
    "sensitivityType",
    "delta",
    "gamma"
})
public class GreekOutput {

    @XmlElement(name = "ScenarioNo")
    protected int scenarioNo;
    @XmlElement(name = "FactorId")
    protected String factorId;
    @XmlElement(name = "SensitivityType", required = true)
    @XmlSchemaType(name = "string")
    protected SensitivityType sensitivityType;
    @XmlElement(name = "Delta", required = true)
    protected BigDecimal delta;
    @XmlElement(name = "Gamma", required = true, nillable = true)
    protected BigDecimal gamma;

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
     * factorId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactorId() {
        return factorId;
    }

    /**
     * factorId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactorId(String value) {
        this.factorId = value;
    }

    /**
     * sensitivityType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SensitivityType }
     *     
     */
    public SensitivityType getSensitivityType() {
        return sensitivityType;
    }

    /**
     * sensitivityType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SensitivityType }
     *     
     */
    public void setSensitivityType(SensitivityType value) {
        this.sensitivityType = value;
    }

    /**
     * delta 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDelta() {
        return delta;
    }

    /**
     * delta 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDelta(BigDecimal value) {
        this.delta = value;
    }

    /**
     * gamma 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGamma() {
        return gamma;
    }

    /**
     * gamma 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGamma(BigDecimal value) {
        this.gamma = value;
    }

}
