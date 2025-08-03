package armour;

public abstract class Armour {
  private String type;
  private int defense;
  private int armourAccuracyCost;

  public Armour(String type) {
    this.type = type;
  }

  public String getType() {
    return this.type;
  }
  public int getDefense() {
    return this.defense;
  }
  public int getArmourAccuracyCost() {
    return this.armourAccuracyCost;
  } // getters closed

  public void setType(String type) {
    this.type = type;
  }
  public void setDefense(int defense) {
    this.defense = defense;
  }
  public void setArmourAccuracyCost(int armourAccuracyCost) {
    this.armourAccuracyCost = armourAccuracyCost;
  } // setters closed

} // close class