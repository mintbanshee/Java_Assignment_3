package defender;

import java.util.Random;
import hollowborn.*;
import utility.Ink;

public class MossGuardian extends Defender {
  private int baseHealth = 360;
  private int bonusHealth = 60;
  private int baseStrength = 115;
  private int bonusStrength = 50;
  private int baseAccuracy = 15;
  private int bonusAccuracy = 15;

  public MossGuardian() {
    super("MossGuardian");
    this.specialAbilityName = "Rootwall";

    super.setHealth(super.rng.nextInt(bonusHealth) + baseHealth);
    super.setStrength(super.rng.nextInt(bonusStrength) + baseStrength);
    super.setAccuracy(super.rng.nextInt(bonusAccuracy) + baseAccuracy);
  } // close constructor

  @Override
  public void useSpecialAbility(Hollowborn enemy, Random rng) {
    // TODO Auto-generated method stub

    int healAmount = 25;

      Ink ink = new Ink();
      ink.mossSpecial();

      this.heal(healAmount);
    System.out.printf("You have recovered %d health!%n", healAmount);
    }  // close Rootwall

} // close class