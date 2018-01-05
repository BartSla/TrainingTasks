
package pl.coderstrust.inputOutput;

import java.io.IOException;

public class Processor {
    private NumbersProcessor numbersProcessor;
    private FileProcessor fileProcessor;

    public Processor(NumbersProcessor numbersProcessor, FileProcessor fileProcessor) {
        this.numbersProcessor = numbersProcessor;
        this.fileProcessor = fileProcessor;
    }

    public void process(String fileName, String resultFileName) throws IOException {

        fileProcessor.writeNumbersToFile(numbersProcessor.processLine(fileProcessor.readNumbersFromFile(fileName)), resultFileName);
    }
}