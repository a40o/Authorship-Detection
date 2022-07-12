package model;

import java.io.InputStream;

public class AuthorshipDetectorImpl implements AuthorshipDetector {
  static FileExtractor fileExtractor = new FileExtractor();

  public AuthorshipDetectorImpl(InputStream signaturesDataset, double[] weights) {

  }

  @Override
  public LinguisticSignature calculateSignature(InputStream mysteryText) {
    Feature feature = new Feature();

    feature.setValue(5.4);
    feature.setFeatureType(FeatureType.AVERAGE_SENTENCE_COMPLEXITY);
    //path might not work
    averageSentenceLength(fileExtractor.extract());
    return null;
  }

  public int averageSentenceLength(String text){

    return 0;
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
