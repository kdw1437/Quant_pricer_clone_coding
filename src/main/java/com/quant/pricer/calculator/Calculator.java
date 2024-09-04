package com.quant.pricer.calculator;

import com.quant.pricer.common.input.CalculationInput;
import com.quant.pricer.common.output.CalculationOutput;
import com.quant.pricer.service.pricer.AbstractPricerFactory;
import com.quant.pricer.service.pricer.PricingFactory;
import com.quant.pricer.util.CommonUtil;
import com.quant.pricer.util.InputFileReader;
import com.quant.pricer.util.OutputFileWriter;
import com.quant.pricer.util.XmlUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Calculator {

    private static final Logger LOG = LoggerFactory.getLogger(Calculator.class);

    public void calculate(String xmlPath) throws Exception {

        LOG.info("Calculation Start.");

        String basePath;
        String inputXmlName;

        File file = new File(xmlPath);

        if(!file.isAbsolute()) {
            basePath = System.getProperty("user.dir");
            Path path = Paths.get(basePath, xmlPath);
            //xml파일 Name
            inputXmlName = path.getFileName().toString();
            //xml파일이 있는 directory
            basePath = path.getParent().toString();
        }
        else {
            Path path = Paths.get(xmlPath);
            inputXmlName = path.getFileName().toString();
            basePath = path.getParent().toString();
        }

        InputFileReader inputFileReader = new InputFileReader();
        OutputFileWriter outputFileWriter = new OutputFileWriter();

        //RootDir property set
        inputFileReader.setRootDir(basePath);
        outputFileWriter.setRootDir(basePath);
        CalculationInput input = null;

        try {
            //xml data unmarshal해서 CalculationInput 객체 return
            input = XmlUtil.unmarshal(inputFileReader.readInputXml(inputXmlName));
        } catch (Exception e) {
            String errMsg = e.getMessage();
            CalculationOutput errOutput = new CalculationOutput();
            errOutput.setWarnMessage(errMsg);
        }

        CalculationOutput outputResult = null;

        try {
            outputResult = calculateByPricer(input);
        } catch (Exception e) {
            String errMsg = e.getMessage();
            outputResult = new CalculationOutput();
            outputResult.setWarnMessage(errMsg);
        } finally {
            //계산 결과 나온 outputResult값 xml형태로 marshal
            String output = XmlUtil.marshal(outputResult);
            String outputFileName = CommonUtil.generateOutputFileName(inputXmlName);
            outputFileWriter.writeOutputFile(outputFileName, output);
        }

        //이거 불필요한 반복임. (밑의 3줄, finally에서 이미 수행되고 있는 과정)

        String output = XmlUtil.marshal(outputResult);

        String outputFileName = CommonUtil.generateOutputFileName(inputXmlName);
        outputFileWriter.writeOutputFile(outputFileName, output);

        LOG.info("Calculation Finished.");
    }

    public CalculationOutput calculateByPricer(CalculationInput input) throws Exception {

        CalculationOutput output = new CalculationOutput();

        //PricingFactory의 getPricer static method 호출. input데이터에 맞는 pricerFactory. ID가 stepDown이 들어오면, AbstractPricerFactory를 extend하는 StepDownPricingFactory return.
        AbstractPricerFactory pricerFactory = PricingFactory.getPricer(input.getPricer().getId());

        if(pricerFactory == null) {
            String errMsg = "Unknown Pricer.";
            output.setWarnMessage(errMsg);
        }
        else {
            output = pricerFactory.calculate(input);
        }

        return output;
    }
}
