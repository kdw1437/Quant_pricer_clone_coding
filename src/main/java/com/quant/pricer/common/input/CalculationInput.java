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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CalculationInput complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CalculationInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Client" type="{}Terminal" minOccurs="0"/&gt;
 *         &lt;element name="InsId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BaseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CalculationType" type="{}CalculationType"/&gt;
 *         &lt;element name="GreekLevel" type="{}GreekLevel" minOccurs="0"/&gt;
 *         &lt;element name="Pricer" type="{}Pricer" minOccurs="0"/&gt;
 *         &lt;element name="Instrument" type="{}Instrument" minOccurs="0"/&gt;
 *         &lt;element name="DataSet" type="{}DataSet" minOccurs="0"/&gt;
 *         &lt;element name="Context" type="{}Context" minOccurs="0"/&gt;
 *         &lt;element name="Simulation" type="{}Simulation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalculationInput", propOrder = {
    "id",
    "type",
    "client",
    "insId",
    "baseDate",
    "calculationType",
    "greekLevel",
    "pricer",
    "instrument",
    "dataSet",
    "context",
    "simulation"
})
public class CalculationInput {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "Client")
    protected Terminal client;
    @XmlElement(name = "InsId")
    protected String insId;
    @XmlElement(name = "BaseDate")
    protected String baseDate;
    @XmlElement(name = "CalculationType", required = true)
    @XmlSchemaType(name = "string")
    protected CalculationType calculationType;
    @XmlElement(name = "GreekLevel")
    protected GreekLevel greekLevel;
    @XmlElement(name = "Pricer")
    protected Pricer pricer;
    @XmlElement(name = "Instrument")
    protected Instrument instrument;
    @XmlElement(name = "DataSet")
    protected DataSet dataSet;
    @XmlElement(name = "Context")
    protected Context context;
    @XmlElement(name = "Simulation")
    protected Simulation simulation;

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
     * type 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * type 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * client 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Terminal }
     *     
     */
    public Terminal getClient() {
        return client;
    }

    /**
     * client 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Terminal }
     *     
     */
    public void setClient(Terminal value) {
        this.client = value;
    }

    /**
     * insId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsId() {
        return insId;
    }

    /**
     * insId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsId(String value) {
        this.insId = value;
    }

    /**
     * baseDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseDate() {
        return baseDate;
    }

    /**
     * baseDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseDate(String value) {
        this.baseDate = value;
    }

    /**
     * calculationType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CalculationType }
     *     
     */
    public CalculationType getCalculationType() {
        return calculationType;
    }

    /**
     * calculationType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationType }
     *     
     */
    public void setCalculationType(CalculationType value) {
        this.calculationType = value;
    }

    /**
     * greekLevel 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link GreekLevel }
     *     
     */
    public GreekLevel getGreekLevel() {
        return greekLevel;
    }

    /**
     * greekLevel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link GreekLevel }
     *     
     */
    public void setGreekLevel(GreekLevel value) {
        this.greekLevel = value;
    }

    /**
     * pricer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Pricer }
     *     
     */
    public Pricer getPricer() {
        return pricer;
    }

    /**
     * pricer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Pricer }
     *     
     */
    public void setPricer(Pricer value) {
        this.pricer = value;
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
     * dataSet 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DataSet }
     *     
     */
    public DataSet getDataSet() {
        return dataSet;
    }

    /**
     * dataSet 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSet }
     *     
     */
    public void setDataSet(DataSet value) {
        this.dataSet = value;
    }

    /**
     * context 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Context }
     *     
     */
    public Context getContext() {
        return context;
    }

    /**
     * context 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Context }
     *     
     */
    public void setContext(Context value) {
        this.context = value;
    }

    /**
     * simulation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Simulation }
     *     
     */
    public Simulation getSimulation() {
        return simulation;
    }

    /**
     * simulation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Simulation }
     *     
     */
    public void setSimulation(Simulation value) {
        this.simulation = value;
    }

}
