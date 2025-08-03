package armour;

public class MossyMantle extends Armour {
  private int defense = 35; 
  private int accuracyCost = 30;

  public MossyMantle() {
    super("MossyMantle");
    super.setDefense(defense);
    super.setAccuracyCost(accuracyCost);
  } // close constructor

} // close class