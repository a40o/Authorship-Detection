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
  public String getFilePath() {
    System.out.print("File Path: ");
    return input.getStringInput();
  }

  @Override
  public void errorMessage() {
    System.out.println("Error");
  }

  @Override
  public void outputResults() {
    System.out.println("Here are the results: ");
    //TODO add table for results
  }
}
