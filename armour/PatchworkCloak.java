package armour;

public class PatchworkCloak extends Armour {
  private int defense = 20; 
  private int armourAccuracyCost = 15;

  public PatchworkCloak() {
    super("PatchworkCloak");
    super.setDefense(defense);
    super.setArmourAccuracyCost(armourAccuracyCost);
  } // close constructor

} // close class