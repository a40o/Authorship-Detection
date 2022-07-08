package model;

import controller.InputImpl;
import java.io.IOException;
import veiw.Communicator;

public class Detector {
  static InputImpl input = new InputImpl();
  static Communicator communicator = new Communicator();
  static FileExtractor fileExtractor;

  static {
    try {
      fileExtractor = new FileExtractor();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public Detector() {
    startApp();
    fileExtractor.extract();
    //communicator.getFilePath();
  }

  public static void startApp() {
    communicator.startupMessage();
  }

//  public static void divideParagraphs(int numberOfParagraphs){
//    Paragraph[] paragraphs = new  Paragraph[numberOfParagraphs];
//    for (int i = 0; i < paragraphs.length; i++) {
//      communicator.getFilePath();
//      paragraphs[i] = new Paragraph(input.getStringInput());
//    }
//  }

  public static void returnParagraphsFromFile() throws IOException {
   // FileExtractor fileExtractor = new FileExtractor();

  }
}
