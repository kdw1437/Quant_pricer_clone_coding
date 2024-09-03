//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.3.0 버전을 통해 생성되었습니다. 
// <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2024.09.03 시간 11:35:07 PM KST 
//


package com.quant.pricer.common.input;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.quant.pricer.common.input package. 
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

    private final static QName _CalculationInput_QNAME = new QName("", "CalculationInput");
    private final static QName _TenorYear_QNAME = new QName("", "Year");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.quant.pricer.common.input
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalculationInput }
     * 
     */
    public CalculationInput createCalculationInput() {
        return new CalculationInput();
    }

    /**
     * Create an instance of {@link Terminal }
     * 
     */
    public Terminal createTerminal() {
        return new Terminal();
    }

    /**
     * Create an instance of {@link GreekLevel }
     * 
     */
    public GreekLevel createGreekLevel() {
        return new GreekLevel();
    }

    /**
     * Create an instance of {@link ArrayOfGreekCalculationMethod }
     * 
     */
    public ArrayOfGreekCalculationMethod createArrayOfGreekCalculationMethod() {
        return new ArrayOfGreekCalculationMethod();
    }

    /**
     * Create an instance of {@link GreekCalculationMethod }
     * 
     */
    public GreekCalculationMethod createGreekCalculationMethod() {
        return new GreekCalculationMethod();
    }

    /**
     * Create an instance of {@link Pricer }
     * 
     */
    public Pricer createPricer() {
        return new Pricer();
    }

    /**
     * Create an instance of {@link ArrayOfModelParameter }
     * 
     */
    public ArrayOfModelParameter createArrayOfModelParameter() {
        return new ArrayOfModelParameter();
    }

    /**
     * Create an instance of {@link ModelParameter }
     * 
     */
    public ModelParameter createModelParameter() {
        return new ModelParameter();
    }

    /**
     * Create an instance of {@link Instrument }
     * 
     */
    public Instrument createInstrument() {
        return new Instrument();
    }

    /**
     * Create an instance of {@link Money }
     * 
     */
    public Money createMoney() {
        return new Money();
    }

    /**
     * Create an instance of {@link ArrayOfUnderlying }
     * 
     */
    public ArrayOfUnderlying createArrayOfUnderlying() {
        return new ArrayOfUnderlying();
    }

    /**
     * Create an instance of {@link Underlying }
     * 
     */
    public Underlying createUnderlying() {
        return new Underlying();
    }

    /**
     * Create an instance of {@link ArrayOfExerciseEvent }
     * 
     */
    public ArrayOfExerciseEvent createArrayOfExerciseEvent() {
        return new ArrayOfExerciseEvent();
    }

    /**
     * Create an instance of {@link ExerciseEvent }
     * 
     */
    public ExerciseEvent createExerciseEvent() {
        return new ExerciseEvent();
    }

    /**
     * Create an instance of {@link ArrayOfExercise }
     * 
     */
    public ArrayOfExercise createArrayOfExercise() {
        return new ArrayOfExercise();
    }

    /**
     * Create an instance of {@link Exercise }
     * 
     */
    public Exercise createExercise() {
        return new Exercise();
    }

    /**
     * Create an instance of {@link ArrayOfExoticEvent }
     * 
     */
    public ArrayOfExoticEvent createArrayOfExoticEvent() {
        return new ArrayOfExoticEvent();
    }

    /**
     * Create an instance of {@link ExoticEvent }
     * 
     */
    public ExoticEvent createExoticEvent() {
        return new ExoticEvent();
    }

    /**
     * Create an instance of {@link ArrayOfExoticCondition }
     * 
     */
    public ArrayOfExoticCondition createArrayOfExoticCondition() {
        return new ArrayOfExoticCondition();
    }

    /**
     * Create an instance of {@link ExoticCondition }
     * 
     */
    public ExoticCondition createExoticCondition() {
        return new ExoticCondition();
    }

    /**
     * Create an instance of {@link ArrayOfCouponEvent }
     * 
     */
    public ArrayOfCouponEvent createArrayOfCouponEvent() {
        return new ArrayOfCouponEvent();
    }

    /**
     * Create an instance of {@link CouponEvent }
     * 
     */
    public CouponEvent createCouponEvent() {
        return new CouponEvent();
    }

    /**
     * Create an instance of {@link ArrayOfCashflow }
     * 
     */
    public ArrayOfCashflow createArrayOfCashflow() {
        return new ArrayOfCashflow();
    }

    /**
     * Create an instance of {@link Cashflow }
     * 
     */
    public Cashflow createCashflow() {
        return new Cashflow();
    }

    /**
     * Create an instance of {@link ArrayOfLeg }
     * 
     */
    public ArrayOfLeg createArrayOfLeg() {
        return new ArrayOfLeg();
    }

    /**
     * Create an instance of {@link Leg }
     * 
     */
    public Leg createLeg() {
        return new Leg();
    }

    /**
     * Create an instance of {@link AdditionalInfo }
     * 
     */
    public AdditionalInfo createAdditionalInfo() {
        return new AdditionalInfo();
    }

    /**
     * Create an instance of {@link ArrayOfProperty }
     * 
     */
    public ArrayOfProperty createArrayOfProperty() {
        return new ArrayOfProperty();
    }

    /**
     * Create an instance of {@link Property }
     * 
     */
    public Property createProperty() {
        return new Property();
    }

    /**
     * Create an instance of {@link DataSet }
     * 
     */
    public DataSet createDataSet() {
        return new DataSet();
    }

    /**
     * Create an instance of {@link ArrayOfPrice }
     * 
     */
    public ArrayOfPrice createArrayOfPrice() {
        return new ArrayOfPrice();
    }

    /**
     * Create an instance of {@link Price }
     * 
     */
    public Price createPrice() {
        return new Price();
    }

    /**
     * Create an instance of {@link Corr }
     * 
     */
    public Corr createCorr() {
        return new Corr();
    }

    /**
     * Create an instance of {@link VolSurface }
     * 
     */
    public VolSurface createVolSurface() {
        return new VolSurface();
    }

    /**
     * Create an instance of {@link ArrayOfTenor }
     * 
     */
    public ArrayOfTenor createArrayOfTenor() {
        return new ArrayOfTenor();
    }

    /**
     * Create an instance of {@link Tenor }
     * 
     */
    public Tenor createTenor() {
        return new Tenor();
    }

    /**
     * Create an instance of {@link ArrayOfTenor1 }
     * 
     */
    public ArrayOfTenor1 createArrayOfTenor1() {
        return new ArrayOfTenor1();
    }

    /**
     * Create an instance of {@link ArrayOfDecimal }
     * 
     */
    public ArrayOfDecimal createArrayOfDecimal() {
        return new ArrayOfDecimal();
    }

    /**
     * Create an instance of {@link ArrayOfDecimal1 }
     * 
     */
    public ArrayOfDecimal1 createArrayOfDecimal1() {
        return new ArrayOfDecimal1();
    }

    /**
     * Create an instance of {@link VolCurve }
     * 
     */
    public VolCurve createVolCurve() {
        return new VolCurve();
    }

    /**
     * Create an instance of {@link ArrayOfVolatility1 }
     * 
     */
    public ArrayOfVolatility1 createArrayOfVolatility1() {
        return new ArrayOfVolatility1();
    }

    /**
     * Create an instance of {@link Volatility }
     * 
     */
    public Volatility createVolatility() {
        return new Volatility();
    }

    /**
     * Create an instance of {@link DividendStream }
     * 
     */
    public DividendStream createDividendStream() {
        return new DividendStream();
    }

    /**
     * Create an instance of {@link ArrayOfDividend }
     * 
     */
    public ArrayOfDividend createArrayOfDividend() {
        return new ArrayOfDividend();
    }

    /**
     * Create an instance of {@link Dividend }
     * 
     */
    public Dividend createDividend() {
        return new Dividend();
    }

    /**
     * Create an instance of {@link DividendYield }
     * 
     */
    public DividendYield createDividendYield() {
        return new DividendYield();
    }

    /**
     * Create an instance of {@link YieldCurve }
     * 
     */
    public YieldCurve createYieldCurve() {
        return new YieldCurve();
    }

    /**
     * Create an instance of {@link ArrayOfYield }
     * 
     */
    public ArrayOfYield createArrayOfYield() {
        return new ArrayOfYield();
    }

    /**
     * Create an instance of {@link Yield }
     * 
     */
    public Yield createYield() {
        return new Yield();
    }

    /**
     * Create an instance of {@link ArrayOfYieldCurve }
     * 
     */
    public ArrayOfYieldCurve createArrayOfYieldCurve() {
        return new ArrayOfYieldCurve();
    }

    /**
     * Create an instance of {@link ArrayOfDividendYield }
     * 
     */
    public ArrayOfDividendYield createArrayOfDividendYield() {
        return new ArrayOfDividendYield();
    }

    /**
     * Create an instance of {@link ArrayOfDividendStream }
     * 
     */
    public ArrayOfDividendStream createArrayOfDividendStream() {
        return new ArrayOfDividendStream();
    }

    /**
     * Create an instance of {@link ArrayOfVolatility }
     * 
     */
    public ArrayOfVolatility createArrayOfVolatility() {
        return new ArrayOfVolatility();
    }

    /**
     * Create an instance of {@link ArrayOfVolCurve }
     * 
     */
    public ArrayOfVolCurve createArrayOfVolCurve() {
        return new ArrayOfVolCurve();
    }

    /**
     * Create an instance of {@link ArrayOfVolSurface }
     * 
     */
    public ArrayOfVolSurface createArrayOfVolSurface() {
        return new ArrayOfVolSurface();
    }

    /**
     * Create an instance of {@link ArrayOfCorr }
     * 
     */
    public ArrayOfCorr createArrayOfCorr() {
        return new ArrayOfCorr();
    }

    /**
     * Create an instance of {@link ArrayOfPriceList }
     * 
     */
    public ArrayOfPriceList createArrayOfPriceList() {
        return new ArrayOfPriceList();
    }

    /**
     * Create an instance of {@link PriceList }
     * 
     */
    public PriceList createPriceList() {
        return new PriceList();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link ArrayOfDecimal2 }
     * 
     */
    public ArrayOfDecimal2 createArrayOfDecimal2() {
        return new ArrayOfDecimal2();
    }

    /**
     * Create an instance of {@link ArrayOfCalendar }
     * 
     */
    public ArrayOfCalendar createArrayOfCalendar() {
        return new ArrayOfCalendar();
    }

    /**
     * Create an instance of {@link Calendar }
     * 
     */
    public Calendar createCalendar() {
        return new Calendar();
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
     * Create an instance of {@link ImpliVolParameter }
     * 
     */
    public ImpliVolParameter createImpliVolParameter() {
        return new ImpliVolParameter();
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
     * Create an instance of {@link ArrayOfImpliVolParameter }
     * 
     */
    public ArrayOfImpliVolParameter createArrayOfImpliVolParameter() {
        return new ArrayOfImpliVolParameter();
    }

    /**
     * Create an instance of {@link Context }
     * 
     */
    public Context createContext() {
        return new Context();
    }

    /**
     * Create an instance of {@link ArrayOfContextMap }
     * 
     */
    public ArrayOfContextMap createArrayOfContextMap() {
        return new ArrayOfContextMap();
    }

    /**
     * Create an instance of {@link ContextMap }
     * 
     */
    public ContextMap createContextMap() {
        return new ContextMap();
    }

    /**
     * Create an instance of {@link ArrayOfMarketDataMap }
     * 
     */
    public ArrayOfMarketDataMap createArrayOfMarketDataMap() {
        return new ArrayOfMarketDataMap();
    }

    /**
     * Create an instance of {@link MarketDataMap }
     * 
     */
    public MarketDataMap createMarketDataMap() {
        return new MarketDataMap();
    }

    /**
     * Create an instance of {@link Simulation }
     * 
     */
    public Simulation createSimulation() {
        return new Simulation();
    }

    /**
     * Create an instance of {@link ArrayOfScenario }
     * 
     */
    public ArrayOfScenario createArrayOfScenario() {
        return new ArrayOfScenario();
    }

    /**
     * Create an instance of {@link Scenario }
     * 
     */
    public Scenario createScenario() {
        return new Scenario();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculationInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalculationInput }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "CalculationInput")
    public JAXBElement<CalculationInput> createCalculationInput(CalculationInput value) {
        return new JAXBElement<CalculationInput>(_CalculationInput_QNAME, CalculationInput.class, null, value);
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
