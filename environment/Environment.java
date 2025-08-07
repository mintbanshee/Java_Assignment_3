package environment;

import java.util.Random;

public abstract class Environment {
  protected int accuracyBoost;
  protected int accuracyLoss;
  protected String type;
  protected Random rng = new Random();

  public Environment() {} // closed constructor

  public int getAccuracyBoost() {
    return this.accuracyBoost;
  } 
  public int getAccuracyLoss() {
    return this.accuracyLoss;
  }
  public String getType() {
    return this.type;
  } // getters closed

  public void setAccuracyBoost(int accuracyBoost) {
    this.accuracyBoost = accuracyBoost;
  }
  public void setAccuracyLoss(int accuracyLoss) {
    this.accuracyLoss = accuracyLoss;
  }
  public void setType(String type) {
    this.type = type;
  } // setters closed

} // close class
