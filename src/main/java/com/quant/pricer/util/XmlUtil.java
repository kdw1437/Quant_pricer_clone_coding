package com.quant.pricer.util;

import com.quant.pricer.common.input.CalculationInput;
import com.quant.pricer.common.output.CalculationOutput;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBIntrospector;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;

public class XmlUtil {

    private static final Logger LOG = LoggerFactory.getLogger(XmlUtil.class);

    //inputXml를 넣어주면, CalculationInput type의 객체를 반환한다.
    public static CalculationInput unmarshal(String inputXml) throws Exception {
        JAXBContext context = JAXBContext.newInstance(CalculationInput.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();

        CalculationInput input = (CalculationInput) JAXBIntrospector.getValue(unmarshaller.unmarshal(new StringReader(inputXml)));

        return input;

    }

    //CalculationOutput 객체를 넣어주면, xml String이 반환된다.
    public static String marshal(CalculationOutput output) throws Exception {

        JAXBContext context = JAXBContext.newInstance(CalculationOutput.class);
        Marshaller marshaller = context.createMarshaller();

        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");

        StringWriter sw = new StringWriter();

        marshaller.marshal(output, sw);
        return sw.toString();
    }
}
