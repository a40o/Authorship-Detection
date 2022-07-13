package model;

import java.io.InputStream;

public class AuthorshipDetectorImpl implements AuthorshipDetector {

  static FileExtractor fileExtractor = new FileExtractor();

  public AuthorshipDetectorImpl(InputStream signaturesDataset, double[] weights) {

  }

  public AuthorshipDetectorImpl() {

  }

  Feature[] initializeFeatures() {
    Feature[] features = new Feature[5];
    for (int i = 0; i < features.length; i++) {

    }
    return features;
  }

  @Override
  public LinguisticSignature calculateSignature(InputStream mysteryText) {
    return null;
  }

  public Feature getAverageSentenceLength(String text) {
    Feature averageSentenceLength = new Feature();
    String[] sentences = text.split("[:,;]+(?=\s|$)");
    String[] words = text.split(" ");
    averageSentenceLength.setFeatureType(FeatureType.AVERAGE_SENTENCE_LENGTH);
    averageSentenceLength.setValue(words.length / sentences.length);
    return averageSentenceLength;
  }

  static Feature getNumberOfUniqueWordsFeature(String str) {
    Feature typeTokenRatio = new Feature();
    int count;
    int wordCount = 0;
    String[] words = str.split("\\W");
    System.out.println(words.length);

    for (int i = 0; i < words.length; i++) {

      count = 1;

      for (int j = i + 1; j < words.length; j++) {
        if (words[i].equalsIgnoreCase(words[j])) {

          count++;

          words[j] = "";
        }
      }

      if (count == 1 && words[i] != "") {

        System.out.println(words[i]);
        wordCount++;
      }
    }
    typeTokenRatio.setValue(wordCount / words.length);
    typeTokenRatio.setFeatureType(FeatureType.TYPE_TOKEN_RATIO);
    return typeTokenRatio;
  }

  public Feature getAverageWordLength(String text) {
    Feature averageWordLength = new Feature();
    averageWordLength.setFeatureType(FeatureType.AVERAGE_WORD_LENGTH);

    int allWordsLength = 0;
    String[] words = text.split(" ");
    for (int i = 0; i < words.length; i++) {
      allWordsLength += words[i].length();
    }
    averageWordLength.setValue(allWordsLength / words.length);
    return averageWordLength;
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
