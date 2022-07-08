package model;

import controller.InputImpl;
import java.util.Arrays;
import veiw.Communicator;

public class Detector {
  static InputImpl input = new InputImpl();
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
      texts[i] = new Text(input.getStringInput());
    }
  }
}
