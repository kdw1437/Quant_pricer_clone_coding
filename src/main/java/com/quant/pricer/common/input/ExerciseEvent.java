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
 * <p>ExerciseEvent complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ExerciseEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{}ExerciseEventType"/&gt;
 *         &lt;element name="Performer" type="{}Performer"/&gt;
 *         &lt;element name="ExerciseType" type="{}ExerciseType"/&gt;
 *         &lt;element name="ObservStopPerformer" type="{}Performer"/&gt;
 *         &lt;element name="PrinGuaranteeRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="DummyYield" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="DummyYield2" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="LossPartRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="PartRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Exercises" type="{}ArrayOfExercise" minOccurs="0"/&gt;
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
@XmlType(name = "ExerciseEvent", propOrder = {
    "type",
    "performer",
    "exerciseType",
    "observStopPerformer",
    "prinGuaranteeRate",
    "dummyYield",
    "dummyYield2",
    "lossPartRate",
    "partRate",
    "exercises"
})
public class ExerciseEvent {

    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected ExerciseEventType type;
    @XmlElement(name = "Performer", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected Performer performer;
    @XmlElement(name = "ExerciseType", required = true)
    @XmlSchemaType(name = "string")
    protected ExerciseType exerciseType;
    @XmlElement(name = "ObservStopPerformer", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected Performer observStopPerformer;
    @XmlElement(name = "PrinGuaranteeRate", required = true, nillable = true)
    protected BigDecimal prinGuaranteeRate;
    @XmlElement(name = "DummyYield", required = true, nillable = true)
    protected BigDecimal dummyYield;
    @XmlElement(name = "DummyYield2", required = true, nillable = true)
    protected BigDecimal dummyYield2;
    @XmlElement(name = "LossPartRate", required = true, nillable = true)
    protected BigDecimal lossPartRate;
    @XmlElement(name = "PartRate", required = true, nillable = true)
    protected BigDecimal partRate;
    @XmlElement(name = "Exercises")
    protected ArrayOfExercise exercises;
    @XmlAttribute(name = "No", required = true)
    protected int no;

    /**
     * type 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ExerciseEventType }
     *     
     */
    public ExerciseEventType getType() {
        return type;
    }

    /**
     * type 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ExerciseEventType }
     *     
     */
    public void setType(ExerciseEventType value) {
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
     * exerciseType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ExerciseType }
     *     
     */
    public ExerciseType getExerciseType() {
        return exerciseType;
    }

    /**
     * exerciseType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ExerciseType }
     *     
     */
    public void setExerciseType(ExerciseType value) {
        this.exerciseType = value;
    }

    /**
     * observStopPerformer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Performer }
     *     
     */
    public Performer getObservStopPerformer() {
        return observStopPerformer;
    }

    /**
     * observStopPerformer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Performer }
     *     
     */
    public void setObservStopPerformer(Performer value) {
        this.observStopPerformer = value;
    }

    /**
     * prinGuaranteeRate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrinGuaranteeRate() {
        return prinGuaranteeRate;
    }

    /**
     * prinGuaranteeRate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrinGuaranteeRate(BigDecimal value) {
        this.prinGuaranteeRate = value;
    }

    /**
     * dummyYield 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDummyYield() {
        return dummyYield;
    }

    /**
     * dummyYield 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDummyYield(BigDecimal value) {
        this.dummyYield = value;
    }

    /**
     * dummyYield2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDummyYield2() {
        return dummyYield2;
    }

    /**
     * dummyYield2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDummyYield2(BigDecimal value) {
        this.dummyYield2 = value;
    }

    /**
     * lossPartRate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLossPartRate() {
        return lossPartRate;
    }

    /**
     * lossPartRate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLossPartRate(BigDecimal value) {
        this.lossPartRate = value;
    }

    /**
     * partRate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPartRate() {
        return partRate;
    }

    /**
     * partRate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPartRate(BigDecimal value) {
        this.partRate = value;
    }

    /**
     * exercises 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExercise }
     *     
     */
    public ArrayOfExercise getExercises() {
        return exercises;
    }

    /**
     * exercises 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExercise }
     *     
     */
    public void setExercises(ArrayOfExercise value) {
        this.exercises = value;
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
