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

//  public String getAverageLengthOfWords() {
//    int allWords = 0;
//    double sumOfAllWords = 0;
//    String[] words = getStrippedText1(text);
//    for (String word : words) {
//      double wordLength = word.length();
//      sumOfAllWords += wordLength;
//      allWords++;
//    }
//
//    double averageWordLength = 0;
//    if (allWords > 0) {
//      averageWordLength = sumOfAllWords / allWords;
//    }
//
//    DecimalFormat df = new DecimalFormat("#.###");
//    return df.format(averageWordLength);
//    return averageLengthOfWords;
//  }

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
