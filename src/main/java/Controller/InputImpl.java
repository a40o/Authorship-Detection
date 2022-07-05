package Controller;

import java.util.Scanner;

public class InputImpl implements Input{

  Scanner scan = new Scanner(System.in);
  @Override
  public void getStringInput() {
    int amount = scan.nextInt();
  }

  @Override
  public void getNumInput() {
    String input = scan.nextLine();
  }
}
