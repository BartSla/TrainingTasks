package pl.coderstrust.inputOutput;

import java.io.*;
import java.util.*;

public class FileProcessor {

    public FileProcessor() {
    }

    public List<Integer> readNumbersFromFile(String fileName) {
        List<Integer> inputString = new ArrayList<>();
        BufferedReader file = null;

        try {
            file = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            System.out.println("Open file error");
            System.exit(1);
        }

        try {
            String line;

            while ((line = file.readLine()) != null) {
                Scanner scanner = new Scanner(line);
                while (scanner.hasNextInt()) {
                    inputString.add(scanner.nextInt());
                }
            }
        } catch (IOException e) {
            System.out.println("File reading error.");
            System.exit(2);
        }

        try {
            file.close();
        } catch (IOException e) {
            System.out.println("Erro while clos");
            System.exit(3);
        }

        return inputString;

    }

    public void writeNumbersToFile(StringBuilder stringIn, String resultFileName) {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(resultFileName));
            writer.write(stringIn.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

