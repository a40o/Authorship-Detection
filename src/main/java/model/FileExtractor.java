package model;

import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import veiw.Communicator;

public class FileExtractor {

  Communicator communicator = new Communicator();

  public String extract() {
    File fileName = new File(communicator.getFilePath());

    try (FileInputStream fileInputStream = new FileInputStream(fileName)) {

      int i = 0;
      do {

        byte[] buffer = new byte[(int) fileName.length()];
        i = fileInputStream.read(buffer);

        String value = new String(buffer, StandardCharsets.UTF_8);
        return value;

      } while (i != -1);


    } catch (Exception e) {
      communicator.errorMessage();
      return null;
    }
  }
}