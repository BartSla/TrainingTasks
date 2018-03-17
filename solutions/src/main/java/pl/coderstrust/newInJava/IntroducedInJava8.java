package pl.coderstrust.newInJava;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntroducedInJava8 {

  public void lambdaExpression() {
    Runnable r1 = new Runnable() {

      @Override
      public void run() {
        System.out.println("Hello world one!");
      }
    };

    // Lambda expression
    Runnable r2 = () -> System.out.println("Hello world two!");
  }

  public void forEachWithLambdaExpression() {

    List<String> items = new ArrayList<>();
    items.add("A");
    items.add("B");
    items.add("C");
    items.add("D");
    items.forEach(item -> System.out.println(item));
  }

  public void streams() {

    List<String> myList =
        Arrays.asList("a1", "a2", "b1", "c2", "c1");

    myList
        .stream()
        .filter(s -> s.startsWith("c"))
        .map(String::toUpperCase)
        .sorted()
        .forEach(System.out::println);
  }

  public void dateToString() {
    String polishIndependeceDayDate = "2018-11-11";

    LocalDate aLocalDate = LocalDate.parse(polishIndependeceDayDate);
    System.out.println("Date: " + aLocalDate);

    String polishIndependeceDayDateTime = "2016-04-04T11:50";

    LocalDateTime aLocalDateTime = LocalDateTime.parse(polishIndependeceDayDateTime);
    System.out.println("Date/Time: " + aLocalDateTime);
  }
}