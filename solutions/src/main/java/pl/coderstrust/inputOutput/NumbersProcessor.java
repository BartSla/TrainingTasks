package pl.coderstrust.inputOutput;

import java.util.List;


public class NumbersProcessor {
    public NumbersProcessor() {
    }

    public static FileProcessor fileProcessor = new FileProcessor();
    private static String fileName = "src\\test\\resources\\1000.txt";
    public static List<Integer> inputList = fileProcessor.readNumbersFromFile(fileName);

    public StringBuilder processLine(List<Integer> inputList) {
        StringBuilder sb =  new StringBuilder();
        this.inputList = inputList;
        int total = 0;
        int k = 0;
        for (int j = 0 + k; j <= 999; j++) {
            int temp = inputList.get(j);
            sb.append(temp + " + ");
            total += inputList.get(j);
            if (j == (k + 9)) {
                sb.append(inputList.get(j) + " = " + total);
                sb.append("\n");
                k += 10;
            }
        }
        return sb;
    }
}

