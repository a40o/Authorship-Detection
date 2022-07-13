package model;

import java.io.InputStream;

public interface AuthorshipDetector {

  LinguisticSignature calculateSignature(InputStream mysteryText);

  double calculateSimilarity(LinguisticSignature firstSignature,
      LinguisticSignature secondSignature);
  String findAuthor(InputStream mysteryText);

  String cleanUp(String word);
}
