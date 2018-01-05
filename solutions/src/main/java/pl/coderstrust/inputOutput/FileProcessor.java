package pl.coderstrust.inputOutput;

import java.io.*;
import java.util.*;

public class FileProcessor {

    public FileProcessor() {
    }

    public List<String> readNumbersFromFile(String fileName) throws IOException {
        List<String> readLines = new ArrayList<>();

        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = fileReader.readLine()) != null) {
                Scanner scanner = new Scanner(line);
                while (scanner.hasNextInt()) {
                    readLines.add(scanner.nextLine());
                }
            }
        }
        return readLines;
    }

    public void writeNumbersToFile(List<String> stringListIn, String resultFileName) throws IOException {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(resultFileName))) {
            writer.write(stringListIn.toString());
        }
    }
}
