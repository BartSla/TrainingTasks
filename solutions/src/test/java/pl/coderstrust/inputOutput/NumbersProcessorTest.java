package pl.coderstrust.inputOutput;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;


public class NumbersProcessorTest {
    FileProcessor fileProcessor = new FileProcessor();
    String pathIn = "src\\test\\resources\\testInput.txt";
    List<String> result = fileProcessor.readNumbersFromFile(pathIn);
    NumbersProcessor numbersProcessor = new NumbersProcessor();

    public NumbersProcessorTest() throws IOException {
    }

    @Test
    public void shouldReturnStringListWithAddsAndSum() {

        List<String> expected  = Arrays.asList("3 + 5 + 66 + 77 + 99 + 222 + 333 + 444 + 555 + 666 = 2470");
        List<String> testingList = Arrays.asList(" 3  5  66  77  99  222  333  444  555  666");
        List<String> numProcess = numbersProcessor.processLine(testingList);
        System.out.println(numbersProcessor.toString());

        Assert.assertArrayEquals(new List[]{expected}, new List[]{numProcess});
    }
}
