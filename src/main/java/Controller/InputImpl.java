package Controller;

import java.util.Scanner;

public class InputImpl implements Input{

  Scanner scan = new Scanner(System.in);
  @Override
  public String getStringInput() {
    return scan.nextLine();
  }

  @Override
  public int getNumInput() {
    return scan.nextInt();
  }
}
