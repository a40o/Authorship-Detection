package Veiw;

import java.util.Scanner;

public class Communicator implements Communication{
  Scanner scan = new Scanner(System.in);

  @Override
  public void startupMessage() {
    System.out.println("Welcome");
    getAmountOfTexts();
  }

  @Override
  public void getAmountOfTexts() {
    System.out.print("Please type number of texts: ");
    int numberOfTexts = scan.nextInt();
    //TODO return to model
  }

  @Override
  public void outputResults() {
    System.out.println("Here are the results: ");
    //TODO add table for results
  }
}
