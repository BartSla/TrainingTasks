package pl.coderstrust.inputOutput;

import org.junit.Assert;
import org.junit.Test;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class FileProcessorTest {

    String pathIn = "src\\test\\resources\\testInput.txt";
    String pathOut = "src\\test\\resources\\testOutput.txt";
    FileProcessor fileProcessor = new FileProcessor();

    @Test
    public void shouldReadNumbersFromTestingFile() throws IOException {

        String[] expected = new String []{"3  5  66  77  99  222  333  444  555 666"};
        List<String> result = fileProcessor.readNumbersFromFile(pathIn);

        Assert.assertArrayEquals(expected, result.toArray());
    }

    @Test
    public void shouldWriteNumbersToTestingFile() throws IOException {
        List<String> testingString = Arrays.asList("3 + 5 + 66 + 77 + 99 + 222 + 333 + 444 + 555 + 666 = 2470");
        fileProcessor.writeNumbersToFile(testingString, pathOut);
        String expected = "[3 + 5 + 66 + 77 + 99 + 222 + 333 + 444 + 555 + 666 = 2470]";

        BufferedReader testRead = new BufferedReader(new FileReader(pathOut));

        Assert.assertEquals(expected, testRead.readLine());
    }
}