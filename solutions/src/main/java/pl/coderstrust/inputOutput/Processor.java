
package pl.coderstrust.inputOutput;

import java.util.List;

public class Processor {

    private NumbersProcessor numbersProcessor = new NumbersProcessor();
    private FileProcessor fileProcessor = new FileProcessor();
    private static String fileName = "src\\main\\resources\\1000.txt";
    private static String resultFileName = "src\\main\\resources\\1000result.txt";

    public Processor() {
    }

    public void process(String fileName, String resultFileName) {
        this.fileName = fileName;
        this.resultFileName = resultFileName;
        List<Integer> arrayOfPrimes = fileProcessor.readNumbersFromFile(fileName);
        String resultString = numbersProcessor.processLine(arrayOfPrimes);
        fileProcessor.writeNumbersToFile(resultString, resultFileName);
    }
}





