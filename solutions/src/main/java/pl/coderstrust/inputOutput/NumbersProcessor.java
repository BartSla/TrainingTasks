package pl.coderstrust.inputOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumbersProcessor {

    public NumbersProcessor() {
    }

    public List<String> processLine(List<String> readLines) {
        List<String> resultList = new ArrayList<>();
        int total = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < readLines.size(); i++) {
            String[] element = readLines.get(i).split("\\s+");
            for (int j = 1; j < element.length; j++) {
                int temp = Integer.parseInt(element[j]);
                total += temp;
                sb.append(temp);
                if (j == element.length - 1) {
                    sb.append(" = " + total);
                    sb.append(System.getProperty("line.separator"));
                } else {
                    sb.append(" + ");
                }

                resultList = Arrays.asList(sb.toString());
            }
        }
        return resultList;
    }
}