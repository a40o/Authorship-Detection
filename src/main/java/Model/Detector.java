package Model;

import Veiw.Communicator;
import java.util.Scanner;

public class Detector {

  static Scanner scan = new Scanner(System.in);
  static Communicator communicator = new Communicator();
  public Detector() {
    startApp();
    //TODO get text amount from input
    createText(communicator.getAmountOfTexts());
  }

  public static void startApp() {
    communicator.startupMessage();
  }

  public static void createText(int numberOfTexts){
    Text[] texts = new  Text[numberOfTexts];
    for (int i = 0; i < texts.length; i++) {
      texts[i] = new Text();
    }

    for (int i = 0; i < texts.length; i++) {
      System.out.println(texts[i].getValue());
      System.out.println(texts[i].getNumberOfWords());
    }
  }
}
