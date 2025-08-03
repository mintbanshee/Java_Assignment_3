package armour;

public class Crystalplate extends Armour {
  private int defense = 50; 
  private int accuracyCost = 45;

  public Crystalplate() {
    super("Crystalplate");
    super.setDefense(defense);
    super.setAccuracyCost(accuracyCost);
  } // close constructor

} // close class