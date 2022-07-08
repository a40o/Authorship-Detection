package model;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileExtractor {
  public FileExtractor() throws IOException {
    extract();
  }

  void extract() throws IOException {
    String fileName = "/home/a40o/Codes/Java/AuthorshipDetection/src/main/java/resources/mysteryFiles/mystery1.txt";

    try (FileInputStream fis = new FileInputStream(fileName)) {

      int i = 0;

      do {

        int optimalSize = 1024;
        byte[] buf = new byte[optimalSize];
        i = fis.read(buf);

        String value = new String(buf, StandardCharsets.UTF_8);
        System.out.print(value);

      } while (i != -1);
    }
  }
}
