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
 * <p>ExoticEvent complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ExoticEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{}ExoticEventType"/&gt;
 *         &lt;element name="Performer" type="{}Performer"/&gt;
 *         &lt;element name="ObservationType" type="{}ObservationType"/&gt;
 *         &lt;element name="ObservationPriceType" type="{}ObservationPriceType"/&gt;
 *         &lt;element name="ExoticConditions" type="{}ArrayOfExoticCondition" minOccurs="0"/&gt;
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
@XmlType(name = "ExoticEvent", propOrder = {
    "type",
    "performer",
    "observationType",
    "observationPriceType",
    "exoticConditions"
})
public class ExoticEvent {

    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected ExoticEventType type;
    @XmlElement(name = "Performer", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected Performer performer;
    @XmlElement(name = "ObservationType", required = true)
    @XmlSchemaType(name = "string")
    protected ObservationType observationType;
    @XmlElement(name = "ObservationPriceType", required = true)
    @XmlSchemaType(name = "string")
    protected ObservationPriceType observationPriceType;
    @XmlElement(name = "ExoticConditions")
    protected ArrayOfExoticCondition exoticConditions;
    @XmlAttribute(name = "No", required = true)
    protected int no;

    /**
     * type 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ExoticEventType }
     *     
     */
    public ExoticEventType getType() {
        return type;
    }

    /**
     * type 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ExoticEventType }
     *     
     */
    public void setType(ExoticEventType value) {
        this.type = value;
    }

    /**
     * performer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Performer }
     *     
     */
    public Performer getPerformer() {
        return performer;
    }

    /**
     * performer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Performer }
     *     
     */
    public void setPerformer(Performer value) {
        this.performer = value;
    }

    /**
     * observationType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ObservationType }
     *     
     */
    public ObservationType getObservationType() {
        return observationType;
    }

    /**
     * observationType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ObservationType }
     *     
     */
    public void setObservationType(ObservationType value) {
        this.observationType = value;
    }

    /**
     * observationPriceType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ObservationPriceType }
     *     
     */
    public ObservationPriceType getObservationPriceType() {
        return observationPriceType;
    }

    /**
     * observationPriceType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ObservationPriceType }
     *     
     */
    public void setObservationPriceType(ObservationPriceType value) {
        this.observationPriceType = value;
    }

    /**
     * exoticConditions 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExoticCondition }
     *     
     */
    public ArrayOfExoticCondition getExoticConditions() {
        return exoticConditions;
    }

    /**
     * exoticConditions 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExoticCondition }
     *     
     */
    public void setExoticConditions(ArrayOfExoticCondition value) {
        this.exoticConditions = value;
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
