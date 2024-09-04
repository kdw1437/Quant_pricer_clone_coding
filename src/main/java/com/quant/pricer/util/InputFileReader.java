package com.quant.pricer.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;

public class InputFileReader {
    //constant, class 수준의 logger 정의
    private static final Logger LOG = LoggerFactory.getLogger(InputFileReader.class);

    private String rootDir;

    public InputFileReader() {}

    public void setRootDir(String inputFilePath) {
        this.rootDir = inputFilePath;
    }
    //읽고자 하는 FileName을 parameter로 받아들인다. line break를 보존한 single String을 반환한다. (파일 내용 반환)
    public String readInputXml(String inputFileName) throws Exception {
        //Path object를 String으로 바꾼다.(toString)
        String filePath = Paths.get(rootDir, inputFileName).toString();

        //file내용을 하나하나 쌓는다.
        StringBuilder sb = new StringBuilder();

        //file을 line by line으로 읽는데 사용된다.
        BufferedReader br = null;

        try {
            FileReader fileReader = new FileReader(filePath);
            br = new BufferedReader(fileReader);

            String readLine = null;
            //BufferedReader가 파일로부터 한줄 읽어들이고, 그 결과값을 readLine 참조변수로 참조한다.
            while((readLine = br.readLine()) != null) {
                sb.append(readLine);
                
                //한줄 추가
                sb.append(System.lineSeparator());
            }
            br.close();
            return sb.toString();
        } catch (FileNotFoundException fne) {
            String errMsg = "Can not find file : " + inputFileName;
            LOG.info(errMsg);
            throw new IllegalArgumentException(errMsg);
        } catch (IOException ioe) {
            String errMsg = "Can not find file : " + inputFileName;
            LOG.info(errMsg);
            throw new IllegalArgumentException(errMsg);
        }



    }


}
