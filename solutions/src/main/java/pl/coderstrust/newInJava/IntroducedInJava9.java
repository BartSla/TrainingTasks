package pl.coderstrust.newInJava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class IntroducedInJava9 {

  public interface PrivateMethodesInInterface {

    private Long createCardId() {
      // Method implementation goes here.
    }

    private static void displayCardDetails() {
      // Method implementation goes here.
    }
  }

  public void tryWithReosurcesJava7() throws IOException {
    BufferedReader reader1 = new BufferedReader(new FileReader("journaldev.txt"));
    try (BufferedReader reader2 = reader1) {
      System.out.println(reader2.readLine());
    }
  }

  public void tryWithReosurcesJava9() throws IOException {
    BufferedReader reader1 = new BufferedReader(new FileReader("journaldev.txt"));
    try (reader1) {
      System.out.println(reader1.readLine());
    }
  }

  // JAVA SHELL:
  // Oracle Corp has introduced a new tool called “jshell”.
  // It stands for Java Shell and also known as REPL (Read Evaluate Print Loop).
  // It is used to execute and test any Java Constructs like class,
  // interface, enum, object, statements etc. very easily.
}