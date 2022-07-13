package model;

public class ExampleAuthor {

  String name;
  double averageWordLength, typeTokenRatio, hapax, averageSentenceLength, averageSentenceComplexity;

  public ExampleAuthor(){
    
  }
  public void setFeatures(String text) {
    String[] features = text.split(", ");
    setName(features[0]);
    setAverageWordLength(Double.parseDouble(features[1]));
    setTypeTokenRatio(Double.parseDouble(features[2]));
    setHapax(Double.parseDouble(features[3]));
    setAverageSentenceLength(Double.parseDouble(features[4]));
    setAverageSentenceComplexity(Double.parseDouble(features[5]));
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getAverageWordLength() {
    return averageWordLength;
  }

  public void setAverageWordLength(double averageWordLength) {
    this.averageWordLength = averageWordLength;
  }

  public double getTypeTokenRatio() {
    return typeTokenRatio;
  }

  public void setTypeTokenRatio(double typeTokenRatio) {
    this.typeTokenRatio = typeTokenRatio;
  }

  public double getHapax() {
    return hapax;
  }

  public void setHapax(double hapax) {
    this.hapax = hapax;
  }

  public double getAverageSentenceLength() {
    return averageSentenceLength;
  }

  public void setAverageSentenceLength(double averageSentenceLength) {
    this.averageSentenceLength = averageSentenceLength;
  }

  public double getAverageSentenceComplexity() {
    return averageSentenceComplexity;
  }

  public void setAverageSentenceComplexity(double averageSentenceComplexity) {
    this.averageSentenceComplexity = averageSentenceComplexity;
  }
}
