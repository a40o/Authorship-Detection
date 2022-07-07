import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import model.Detector;

public class Main {

  static final String file = "resources/KnownSignatures.txt";

  public static void main(String[] args) {
    new Detector();
  }
}