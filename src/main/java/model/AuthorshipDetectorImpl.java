package model;

import java.io.InputStream;
import java.util.Arrays;

public class AuthorshipDetectorImpl implements AuthorshipDetector {
  static FileExtractor fileExtractor = new FileExtractor();

  public AuthorshipDetectorImpl(InputStream signaturesDataset, double[] weights) {

  }

  public AuthorshipDetectorImpl() {

  }

  @Override
  public LinguisticSignature calculateSignature(InputStream mysteryText) {
    Feature feature = new Feature();

    //path might not work
    averageSentenceLength(fileExtractor.extract());
    return null;
  }

  public int averageSentenceLength(String text){
    String[] sentences = text.split("[\\\\p{L}\\\\p{M}\\\\p{N}]+(?:\\\\[\\\\p{L}\\\\p{M}\\\\p{N}]+)*|[\\\\p{P}\\\\p{S}]");
    String[] words = text.split(" ");
    System.out.println(Arrays.toString(sentences));
    System.out.println(Arrays.toString(sentences));
    return words.length / sentences.length;
  }

  static void printNumberOfUniqueWords(String str)
  {
    // Maintaining a count variable
    int count = 0;
    int wordCount = 0;
    // Extract words from string
    // using split() method
    String[] words = str.split("\\W");
    System.out.println(words.length);

    // Iterating over the words array
    for (int i = 0; i < words.length; i++) {

      // Setting count of current word to one
      count = 1;

      for (int j = i + 1; j < words.length; j++) {
        if (words[i].equalsIgnoreCase(words[j])) {

          // If word found later in array
          // increment the count variable
          count++;

          words[j] = "";
        }
      }

      // If count of current word is one print it
      if (count == 1 && words[i] != "") {

        // Print statement
        System.out.println(words[i]);
        wordCount++;
      }
    }
    System.out.println(wordCount);
  }
  @Override
  public double calculateSimilarity(LinguisticSignature firstSignature,
      LinguisticSignature secondSignature) {
    return 0;
  }

  @Override
  public String findAuthor(InputStream mysteryText) {
    return null;
  }

  @Override
  public String cleanUp(String word) {
    {
      return word.toLowerCase()
          .replaceAll(
              "^[!.,:;\\-?<>#\\*\'\"\\[\\(\\]\\)\\n\\t\\\\]+|[!.,:;\\-?<>#\\*\'\"\\[\\(\\]\\)\\n\\t\\\\]+$",
              " ");
    }
  }
}
