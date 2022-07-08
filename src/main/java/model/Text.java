package model;

import java.util.Arrays;
import java.util.Scanner;

public class Text {

  String value;
  String averageLengthOfWords;
  int numberOfWords;
  Scanner scanner = new Scanner(System.in);

  public Text(String value) {
    this.value = value;
    System.out.println(getNumberOfWords(value));
    System.out.println(Arrays.toString(splitText(value)));
  }


  public static String getPunctuationStrippedText(String text) {

    return text.replaceAll("\\p{Punct}", "");
  }

  public void setAverageLengthOfWords(String averageLengthOfWords) {
    this.averageLengthOfWords = averageLengthOfWords;
  }

  public static int getNumberOfWords(String text) {

    return (splitText(text).length);
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public static String[] splitText(String text){
    String[] words = text.split(" ");
    return words;
  }
}
