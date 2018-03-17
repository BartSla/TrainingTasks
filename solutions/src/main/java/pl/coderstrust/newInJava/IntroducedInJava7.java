package pl.coderstrust.newInJava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IntroducedInJava7 {

  public void tryWithResources() throws IOException {

    String path = "c:\\";
    //old try with finally
    BufferedReader fileReader = new BufferedReader(new FileReader(path));
    try {
      fileReader.readLine();
    } finally {
      fileReader.close();
    }

    //new try with resources
    try (BufferedReader fileReader2 = new BufferedReader(new FileReader(path))) {
      fileReader2.readLine();
    }
  }

  public String getTypeOfDayWithSwitchStatement(String dayOfWeekArg) {
    String typeOfDay;
    switch (dayOfWeekArg) {
      case "Monday":
        typeOfDay = "Start of work week";
        break;
      case "Tuesday":
      case "Wednesday":
      case "Thursday":
        typeOfDay = "Midweek";
        break;
      case "Friday":
        typeOfDay = "End of work week";
        break;
      case "Saturday":
      case "Sunday":
        typeOfDay = "Weekend";
        break;
      default:
        throw new IllegalArgumentException("Invalid day of the week: " + dayOfWeekArg);
    }
    return typeOfDay;
  }

  public void multiExceptionHandling(String first) {
    //old try catch block
    try {
      if (first.equals("First")) {
        System.out.println("Great");
      }
    } catch (NullPointerException e) {
      throw e;
    } catch (IllegalArgumentException e) {
      throw e;
    }
    //new try multi catch block
    try {
      if (first.equals("First")) {
        System.out.println("Great");
      }
    } catch (NullPointerException | IllegalArgumentException e) {
      throw e;
    }
  }

  public void underscoreInNumericLiterals() {
    long creditCardNumber = 1234_5678_9012_3456L; //is equal to 1234567890123456 better readability
  }

  //Diamond operators
  //old
  List<String> list = new ArrayList<String>();
  //new
  List<String> list2 = new ArrayList<>();
}