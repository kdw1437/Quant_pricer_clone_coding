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
 * <p>GreekCalculationMethod complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="GreekCalculationMethod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SensitivityType" type="{}SensitivityType"/&gt;
 *         &lt;element name="Type" type="{}GreekCalculationMethodType"/&gt;
 *         &lt;element name="Pert1" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="PerturbationType1" type="{}PerturbationType"/&gt;
 *         &lt;element name="Pert2" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="PerturbationType2" type="{}PerturbationType"/&gt;
 *         &lt;element name="TenorFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GreekCalculationMethod", propOrder = {
    "sensitivityType",
    "type",
    "pert1",
    "perturbationType1",
    "pert2",
    "perturbationType2",
    "tenorFlag"
})
public class GreekCalculationMethod {

    @XmlElement(name = "SensitivityType", required = true)
    @XmlSchemaType(name = "string")
    protected SensitivityType sensitivityType;
    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected GreekCalculationMethodType type;
    @XmlElement(name = "Pert1", required = true)
    protected BigDecimal pert1;
    @XmlElement(name = "PerturbationType1", required = true)
    @XmlSchemaType(name = "string")
    protected PerturbationType perturbationType1;
    @XmlElement(name = "Pert2", required = true, nillable = true)
    protected BigDecimal pert2;
    @XmlElement(name = "PerturbationType2", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected PerturbationType perturbationType2;
    @XmlElement(name = "TenorFlag")
    protected boolean tenorFlag;

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
     * type 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link GreekCalculationMethodType }
     *     
     */
    public GreekCalculationMethodType getType() {
        return type;
    }

    /**
     * type 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link GreekCalculationMethodType }
     *     
     */
    public void setType(GreekCalculationMethodType value) {
        this.type = value;
    }

    /**
     * pert1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPert1() {
        return pert1;
    }

    /**
     * pert1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPert1(BigDecimal value) {
        this.pert1 = value;
    }

    /**
     * perturbationType1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PerturbationType }
     *     
     */
    public PerturbationType getPerturbationType1() {
        return perturbationType1;
    }

    /**
     * perturbationType1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PerturbationType }
     *     
     */
    public void setPerturbationType1(PerturbationType value) {
        this.perturbationType1 = value;
    }

    /**
     * pert2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPert2() {
        return pert2;
    }

    /**
     * pert2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPert2(BigDecimal value) {
        this.pert2 = value;
    }

    /**
     * perturbationType2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PerturbationType }
     *     
     */
    public PerturbationType getPerturbationType2() {
        return perturbationType2;
    }

    /**
     * perturbationType2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PerturbationType }
     *     
     */
    public void setPerturbationType2(PerturbationType value) {
        this.perturbationType2 = value;
    }

    /**
     * tenorFlag 속성의 값을 가져옵니다.
     * 
     */
    public boolean isTenorFlag() {
        return tenorFlag;
    }

    /**
     * tenorFlag 속성의 값을 설정합니다.
     * 
     */
    public void setTenorFlag(boolean value) {
        this.tenorFlag = value;
    }

}
