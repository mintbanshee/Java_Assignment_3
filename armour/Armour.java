package armour;

public abstract class Armour {
  private String type;
  private int defense;
  private int accuracyCost;

  public Armour(String type) {
    this.type = type;
  }

  public String getType() {
    return this.type;
  }
  public int getDefense() {
    return this.defense;
  }
  public int getAccuracyCost() {
    return this.accuracyCost;
  } // getters closed

  public void setType(String type) {
    this.type = type;
  }
  public void setDefense(int defense) {
    this.defense = defense;
  }
  public void setAccuracyCost(int accuracyCost) {
    this.accuracyCost = accuracyCost;
  } // setters closed

} // close class