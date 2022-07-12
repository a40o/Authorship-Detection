package model;

import java.util.Arrays;
import java.util.Scanner;

public class Paragraph {

  String value;
  String averageLengthOfWords;
  int numberOfWords;
  Scanner scanner = new Scanner(System.in);
  private static final String PARAGRAPH_SPLIT_REGEX = "(?m)(?=^\\s{0})";

  public Paragraph(String value) {
    this.value = value;
    //System.out.println(getNumberOfWords(value));
    //System.out.println(Arrays.toString(splitTextByWord(value)));
  }


  public static String getPunctuationStrippedText(String text) {

    return text.replaceAll("\\p{Punct}", "");
  }

  public void setAverageLengthOfWords(String averageLengthOfWords) {
    this.averageLengthOfWords = averageLengthOfWords;
  }

  public static int getNumberOfWords(String text) {

    return (splitTextByWord(text).length);
  }

  public static int getNumberOfParagraphs(String text) {

    return (splitTextByParagraphs(text).length);
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public static String[] splitTextByWord(String text){
    String[] words = text.split(" ");
    return words;
  }

  public static String[] splitTextByParagraphs(String text) {
    String[] paragraphs = text.split(PARAGRAPH_SPLIT_REGEX);
//    for (String paragraph : paragraphs) {
//      System.out.println("Paragraph: " + paragraph.trim());
//    }
    return paragraphs;
  }
}
