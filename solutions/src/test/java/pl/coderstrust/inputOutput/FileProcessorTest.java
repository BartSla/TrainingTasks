package pl.coderstrust.inputOutput;


import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

public class FileProcessorTest {

    FileProcessor fileProcessor;
    String path;
    @BeforeClass
    public void preper(){
        fileProcessor = new FileProcessor();
    path = "";
    }

    @Test
    public void readNumbersFromFile (){

//        expected
        List<Integer> result = fileProcessor.readNumbersFromFile(path);



    }



}