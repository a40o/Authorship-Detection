package Model;

import Veiw.Communicator;
import java.util.Scanner;

public class Detector {

  static Scanner scan = new Scanner(System.in);
  static Communicator communicator = new Communicator();
  public Detector() {
    startApp();
    createText(communicator.getAmountOfTexts());
  }

  public static void startApp() {
    communicator.startupMessage();
  }

  public static void createText(int numberOfTexts){
    Text[] texts = new  Text[numberOfTexts];
    for (int i = 0; i < texts.length; i++) {
      communicator.getTextInput();
      texts[i] = new Text();
    }

    for (Text text : texts) {
      System.out.println(text.getValue());
      System.out.println(text.getNumberOfWords());
    }
  }
}
