package model;

import controller.InputImpl;
import java.io.IOException;
import veiw.Communicator;

public class App {

  static InputImpl input = new InputImpl();
  static Communicator communicator = new Communicator();
  static FileExtractor fileExtractor = new FileExtractor();

  public App() {
    startApp();
    System.out.println(Paragraph.getNumberOfWords(
        String.valueOf(fileExtractor.extract())));
    //AuthorshipDetectorImpl authorshipDetector = new AuthorshipDetectorImpl();
    //give input stream & weights array ^^^
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