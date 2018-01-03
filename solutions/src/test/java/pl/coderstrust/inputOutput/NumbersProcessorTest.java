package pl.coderstrust.inputOutput;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;
import static pl.coderstrust.inputOutput.NumbersProcessor.fileProcessor;

public class NumbersProcessorTest {

    String pathIn = "src\\test\\resources\\testInput.txt";
    List<Integer> result = fileProcessor.readNumbersFromFile(pathIn);
    NumbersProcessor numbersProcessor = new NumbersProcessor();

    @Test
    public void shouldReturnStringBuilderArrayWithAddsAndSum() {

        String expected = "3 + 5 + 66 + 77 + 99 + 222 + 333 + 444 + 555 + 666 = 2470";
        String numProcess = numbersProcessor.processLine(result);
        System.out.println(numbersProcessor.toString());

        Assert.assertEquals(expected, numProcess.toString());
    }
}