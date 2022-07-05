package Model;

import Veiw.Communicator;

public class Detector {

  public Detector() {
    startApp();
    //TODO get text amount from input
    //createText();
  }

  public static void startApp() {
    Communicator Communicator = new Communicator();
    Communicator.startupMessage();
    Communicator.getAmountOfTexts();
  }

  public static void createText(int numberOfTexts){
    Text[] texts = new  Text[numberOfTexts];
    for (int i = 0; i < numberOfTexts; i++) {
      System.out.println(texts[i]);
    }
  }
}
