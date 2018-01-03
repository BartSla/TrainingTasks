package pl.coderstrust.inputOutput;

import java.util.List;

public class NumbersProcessor {

    public NumbersProcessor() {
    }

    public static FileProcessor fileProcessor = new FileProcessor();

    public String processLine(List<Integer> inputList) {
        StringBuilder sb = new StringBuilder();
        int total = 0;
        int k = 0;
        for (int j = 0 + k; j < inputList.size(); j++) {
            int temp = inputList.get(j);
            sb.append(temp);
            total += inputList.get(j);
            if (j == (k + 9)) {
                sb.append(" = " + total);
                k += 10;
            } else {
                sb.append(" + ");
            }
        }
        return sb.toString();
    }
}

