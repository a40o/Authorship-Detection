package veiw;

import controller.InputImpl;
import java.util.Scanner;

public class Communicator implements Communication{
  Scanner scan = new Scanner(System.in);
  InputImpl input = new InputImpl();

  @Override
  public void startupMessage() {
    System.out.println("Welcome");
  }

  @Override
  public int getAmountOfTexts() {
    System.out.print("Please type number of texts: ");
    return input.getNumInput();
  }

  @Override
  public void getTextInput() {
    System.out.print("Type text: ");
    input.getStringInput();
  }

  @Override
  public void outputResults() {
    System.out.println("Here are the results: ");
    //TODO add table for results
  }
}
