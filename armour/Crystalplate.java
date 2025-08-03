package armour;

public class Crystalplate extends Armour {
  private int defense = 50; 
  private int armourAccuracyCost = 45;

  public Crystalplate() {
    super("Crystalplate");
    super.setDefense(defense);
    super.setArmourAccuracyCost(armourAccuracyCost);
  } // close constructor

} // close class