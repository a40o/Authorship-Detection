package Veiw;

import Controller.InputImpl;
import java.util.Scanner;

public class Communicator implements Communication{
  Scanner scan = new Scanner(System.in);
  InputImpl input = new InputImpl();

  @Override
  public void startupMessage() {
    System.out.println("Welcome");
  }

  @Override
  public void getAmountOfTexts() {
    System.out.print("Please type number of texts: ");
    input.getNumInput();
    //TODO return to model
  }

  @Override
  public void getTextInput() {
    System.out.println("Type text: ");
    input.getStringInput();
  }

  @Override
  public void outputResults() {
    System.out.println("Here are the results: ");
    //TODO add table for results
  }
}
