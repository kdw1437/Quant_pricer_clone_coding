//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.3.0 버전을 통해 생성되었습니다. 
// <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2024.09.03 시간 11:35:08 PM KST 
//


package com.quant.pricer.common.output;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.quant.pricer.common.output package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CalculationOutput_QNAME = new QName("", "CalculationOutput");
    private final static QName _TenorYear_QNAME = new QName("", "Year");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.quant.pricer.common.output
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalculationOutput }
     * 
     */
    public CalculationOutput createCalculationOutput() {
        return new CalculationOutput();
    }

    /**
     * Create an instance of {@link Terminal }
     * 
     */
    public Terminal createTerminal() {
        return new Terminal();
    }

    /**
     * Create an instance of {@link ArrayOfPriceOutput }
     * 
     */
    public ArrayOfPriceOutput createArrayOfPriceOutput() {
        return new ArrayOfPriceOutput();
    }

    /**
     * Create an instance of {@link PriceOutput }
     * 
     */
    public PriceOutput createPriceOutput() {
        return new PriceOutput();
    }

    /**
     * Create an instance of {@link ArrayOfGreekOutput }
     * 
     */
    public ArrayOfGreekOutput createArrayOfGreekOutput() {
        return new ArrayOfGreekOutput();
    }

    /**
     * Create an instance of {@link GreekOutput }
     * 
     */
    public GreekOutput createGreekOutput() {
        return new GreekOutput();
    }

    /**
     * Create an instance of {@link ArrayOfCashFlowOutput }
     * 
     */
    public ArrayOfCashFlowOutput createArrayOfCashFlowOutput() {
        return new ArrayOfCashFlowOutput();
    }

    /**
     * Create an instance of {@link CashFlowOutput }
     * 
     */
    public CashFlowOutput createCashFlowOutput() {
        return new CashFlowOutput();
    }

    /**
     * Create an instance of {@link ArrayOfHWModelParameter }
     * 
     */
    public ArrayOfHWModelParameter createArrayOfHWModelParameter() {
        return new ArrayOfHWModelParameter();
    }

    /**
     * Create an instance of {@link HWModelParameter }
     * 
     */
    public HWModelParameter createHWModelParameter() {
        return new HWModelParameter();
    }

    /**
     * Create an instance of {@link ArrayOfHWVolatility }
     * 
     */
    public ArrayOfHWVolatility createArrayOfHWVolatility() {
        return new ArrayOfHWVolatility();
    }

    /**
     * Create an instance of {@link HWVolatility }
     * 
     */
    public HWVolatility createHWVolatility() {
        return new HWVolatility();
    }

    /**
     * Create an instance of {@link Tenor }
     * 
     */
    public Tenor createTenor() {
        return new Tenor();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculationOutput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalculationOutput }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "CalculationOutput")
    public JAXBElement<CalculationOutput> createCalculationOutput(CalculationOutput value) {
        return new JAXBElement<CalculationOutput>(_CalculationOutput_QNAME, CalculationOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Year", scope = Tenor.class)
    public JAXBElement<BigDecimal> createTenorYear(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TenorYear_QNAME, BigDecimal.class, Tenor.class, value);
    }

}
