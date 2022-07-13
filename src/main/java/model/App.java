package model;

import controller.InputImpl;
import veiw.Communicator;

public class App {

  static InputImpl input = new InputImpl();
  static Communicator communicator = new Communicator();
  static FileExtractor fileExtractor = new FileExtractor();
  static AuthorshipDetectorImpl authorshipDetector = new AuthorshipDetectorImpl();

  public App() {
    startApp();
    System.out.println(authorshipDetector.getAverageSentenceLength(fileExtractor.extract()));
  }

  public static void startApp() {
    communicator.startupMessage();
  }
}
