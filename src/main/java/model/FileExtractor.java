package model;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ModuleLayer.Controller;
import java.nio.charset.StandardCharsets;
import veiw.Communicator;

public class FileExtractor {

  Communicator communicator = new Communicator();

  public FileExtractor() throws IOException {
    extract();
  }

  void extract() {
    String fileName = communicator.getFilePath();

    try (FileInputStream fis = new FileInputStream(fileName)) {

      int i = 0;

      do {
        int optimalSize = 1024;
        byte[] buf = new byte[optimalSize];
        i = fis.read(buf);

        String value = new String(buf, StandardCharsets.UTF_8);
        System.out.print(value);

      } while (i != -1);
    } catch (Exception e) {
      System.out.println("Error");
    }
  }
}
