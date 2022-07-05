package Model;

import java.util.Scanner;

public class Text {

  String value;
  String averageLengthOfWords;
  int numberOfWords;
  Scanner scanner = new Scanner(System.in);

  public Text() {
    setValue(scanner.nextLine());
  }

  public void setAverageLengthOfWords(String averageLengthOfWords) {
    this.averageLengthOfWords = averageLengthOfWords;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public int getNumberOfWords() {

    return numberOfWords;
  }

  public void setNumberOfWords(int numberOfWords) {
    this.numberOfWords = numberOfWords;
  }
}
