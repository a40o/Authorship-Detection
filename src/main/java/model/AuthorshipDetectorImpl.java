package model;

import java.io.InputStream;

public class AuthorshipDetectorImpl implements AuthorshipDetector{
  public AuthorshipDetectorImpl(InputStream signaturesDataset, double[] weights){
    
  }

  @Override
  public LinguisticSignature calculateSignature(InputStream mysteryText) {
    return null;
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
}
