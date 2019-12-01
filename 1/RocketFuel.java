import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RocketFuel {

  private static List<Integer> readInput() throws IOException {
    List <Integer> moduleMasses = new ArrayList<>();
    Scanner fileScanner = new Scanner(new File("data"));
    while (fileScanner.hasNextLine()) {
      moduleMasses.add(Integer.parseInt(fileScanner.nextLine()));
    }
    fileScanner.close();
    return moduleMasses;
  }

  private static int calculateFuelConsumption(int rocketMass) {
    return ((int) Math.floor(rocketMass / 3.0)) - 2;
  }

  public static void main(String[] args) throws IOException {
    List<Integer> inputNumber = null;
    try {
      inputNumber = readInput();
    } catch (IOException e) {
      System.out.println("Encoountered error.. Aborting");
      System.err.println(e);
      System.exit(1);
    }
    int totalFuelConsumption = 0;
    for (Integer number : inputNumber) {
      totalFuelConsumption += calculateFuelConsumption(number);
    }
    System.out.printf("Total fuel consumption: %d\n", totalFuelConsumption);
  }
}