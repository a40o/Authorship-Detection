package model;

import java.util.Scanner;

public class Text {

  String value;
  String averageLengthOfWords;
  int numberOfWords;
  Scanner scanner = new Scanner(System.in);

  public Text() {
    setValue(scanner.nextLine());
    //getStrippedText(value);
    getNumberOfAllWords(value);
  }

  public static String[] getStrippedText(String text) {

    String strippedText = getPunctuationStrippedText(text);
    return strippedText.split(" ");
  }

  public static String getPunctuationStrippedText(String text) {

    return text.replaceAll("\\p{Punct}", "");
  }

  public void setAverageLengthOfWords(String averageLengthOfWords) {
    this.averageLengthOfWords = averageLengthOfWords;
  }

  public static int getNumberOfAllWords(String text) {

    int allWords = 0;
    String[] words = getStrippedText(text);

    for (int i = 0; i <= words.length; i++) {

      allWords++;
    }

    return allWords;
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
