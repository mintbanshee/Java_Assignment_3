package weapon;

import java.util.Random;

public abstract class Weapon {
  private String type;
  private int baseDamage;
  private int accuracyCost;

  protected Random rng = new Random();
  protected final int FACTOR_5 = 5;
  protected final int FACTOR_10 = 10;

  public Weapon(String type) {
    this.type = type;
  } // close constructor

  public String getType() {
    return this.type;
  }
  public int getBaseDamage() {
    return this.baseDamage;
  }
  public int getAccuracyCost() {
    return this.accuracyCost;
  } // getters closed

  public abstract int strike(int attackType, int strength, int accuracy, int accuracyCost);

  public void setType(String type) {
    this.type = type;
  }
  public void setBaseDamage(int baseDamage) {
    this.baseDamage = baseDamage;
  }
  public void setAccuracyCost(int accuracyCost) {
    this.accuracyCost = accuracyCost;
  } // setters closed

} // close class
