package pl.coderstrust.inputOutput;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.*;

@RunWith(MockitoJUnitRunner.class)
public class ProcessorTest {

    String pathIn = "src\\test\\resources\\testInput.txt";
    String pathOut = "src\\test\\resources\\testOutput.txt";

    @Mock
    FileProcessor fileProcessor;

    @Mock
    NumbersProcessor numbersProcessor;

    @InjectMocks
    Processor processor;

    @Test
    public void shouldReadNumbersFromInputFileAndWriteStringToOutputFile() {

        List<Integer> list = Arrays.asList(1, 2);
        Mockito.when(fileProcessor.readNumbersFromFile(anyString())).thenReturn(list);

        String processedNumbers = "1 + 2 = 3";
        Mockito.when(numbersProcessor.processLine(anyList())).thenReturn(processedNumbers);

        fileProcessor.writeNumbersToFile(pathIn, pathOut);
        processor.process("input", "output");
    }
}