package com.quant.pricer.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;

public class OutputFileWriter {

    private static final Logger LOG = LoggerFactory.getLogger(OutputFileWriter.class);

    private String rootDir;

    public OutputFileWriter() {

    }

    public void setRootDir(String outputFilePath) {
        this.rootDir = outputFilePath;
    }
    //데이터를 생성된 파일안에 써넣는다.
    public void writeOutputFile(String fileName, String output) {

        String outputFilePath = Paths.get(rootDir, fileName).toString();
        FileWriter writer = null; //FileWriter type의 writer 참조변수 생성해서 null값 참조.

        try {
            writer = new FileWriter(new File(outputFilePath));
            writer.write(output);
        } catch(IOException ioe) {
            LOG.warn("can not write output file.");
            ioe.getStackTrace();

        } finally {
            try {
                writer.close();
            } catch (IOException ioe) {
                LOG.warn("IOException in close: " + ioe.getMessage());
            }
        }
    }
}
