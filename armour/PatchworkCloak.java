package armour;

public class PatchworkCloak extends Armour {
  private int defense = 20; 
  private int accuracyCost = 15;

  public PatchworkCloak() {
    super("PatchworkCloak");
    super.setDefense(defense);
    super.setAccuracyCost(accuracyCost);
  } // close constructor

} // close class