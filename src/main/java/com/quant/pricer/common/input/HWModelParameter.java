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
 * <p>HWModelParameter complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="HWModelParameter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}AbstractCalibrationData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{}HWModelType"/&gt;
 *         &lt;element name="RefYieldCurveId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RefCapVolId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RefSwaptionVolId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Kappa" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Kappa2" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Rho" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CapRt" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="FloorRt" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Vols" type="{}ArrayOfHWVolatility" minOccurs="0"/&gt;
 *         &lt;element name="Calculated" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HWModelParameter", propOrder = {
    "type",
    "refYieldCurveId",
    "refCapVolId",
    "refSwaptionVolId",
    "kappa",
    "kappa2",
    "rho",
    "capRt",
    "floorRt",
    "vols",
    "calculated"
})
public class HWModelParameter
    extends AbstractCalibrationData
{

    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected HWModelType type;
    @XmlElement(name = "RefYieldCurveId")
    protected String refYieldCurveId;
    @XmlElement(name = "RefCapVolId")
    protected String refCapVolId;
    @XmlElement(name = "RefSwaptionVolId")
    protected String refSwaptionVolId;
    @XmlElement(name = "Kappa", required = true)
    protected BigDecimal kappa;
    @XmlElement(name = "Kappa2", required = true, nillable = true)
    protected BigDecimal kappa2;
    @XmlElement(name = "Rho", required = true, nillable = true)
    protected BigDecimal rho;
    @XmlElement(name = "CapRt", required = true, nillable = true)
    protected BigDecimal capRt;
    @XmlElement(name = "FloorRt", required = true, nillable = true)
    protected BigDecimal floorRt;
    @XmlElement(name = "Vols")
    protected ArrayOfHWVolatility vols;
    @XmlElement(name = "Calculated", required = true, type = Boolean.class, nillable = true)
    protected Boolean calculated;

    /**
     * type 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link HWModelType }
     *     
     */
    public HWModelType getType() {
        return type;
    }

    /**
     * type 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link HWModelType }
     *     
     */
    public void setType(HWModelType value) {
        this.type = value;
    }

    /**
     * refYieldCurveId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefYieldCurveId() {
        return refYieldCurveId;
    }

    /**
     * refYieldCurveId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefYieldCurveId(String value) {
        this.refYieldCurveId = value;
    }

    /**
     * refCapVolId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefCapVolId() {
        return refCapVolId;
    }

    /**
     * refCapVolId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefCapVolId(String value) {
        this.refCapVolId = value;
    }

    /**
     * refSwaptionVolId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefSwaptionVolId() {
        return refSwaptionVolId;
    }

    /**
     * refSwaptionVolId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefSwaptionVolId(String value) {
        this.refSwaptionVolId = value;
    }

    /**
     * kappa 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKappa() {
        return kappa;
    }

    /**
     * kappa 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKappa(BigDecimal value) {
        this.kappa = value;
    }

    /**
     * kappa2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKappa2() {
        return kappa2;
    }

    /**
     * kappa2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKappa2(BigDecimal value) {
        this.kappa2 = value;
    }

    /**
     * rho 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRho() {
        return rho;
    }

    /**
     * rho 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRho(BigDecimal value) {
        this.rho = value;
    }

    /**
     * capRt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCapRt() {
        return capRt;
    }

    /**
     * capRt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCapRt(BigDecimal value) {
        this.capRt = value;
    }

    /**
     * floorRt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFloorRt() {
        return floorRt;
    }

    /**
     * floorRt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFloorRt(BigDecimal value) {
        this.floorRt = value;
    }

    /**
     * vols 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHWVolatility }
     *     
     */
    public ArrayOfHWVolatility getVols() {
        return vols;
    }

    /**
     * vols 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHWVolatility }
     *     
     */
    public void setVols(ArrayOfHWVolatility value) {
        this.vols = value;
    }

    /**
     * calculated 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCalculated() {
        return calculated;
    }

    /**
     * calculated 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCalculated(Boolean value) {
        this.calculated = value;
    }

}
