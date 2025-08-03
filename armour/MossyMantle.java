package armour;

public class MossyMantle extends Armour {
  private int defense = 35; 
  private int armourAccuracyCost = 30;

  public MossyMantle() {
    super("MossyMantle");
    super.setDefense(defense);
    super.setArmourAccuracyCost(armourAccuracyCost);
  } // close constructor

} // close class