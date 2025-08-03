package defender;

import java.util.Random;
import hollowborn.*;

public class Dandelight extends Defender {
  private int baseHealth = 210;
  private int bonusHealth = 35;
  private int baseStrength = 75;
  private int bonusStrength = 40;
  private int baseAccuracy = 60;
  private int bonusAccuracy = 45;

  public Dandelight() {
    super("Dandelight");

    super.setHealth(super.rng.nextInt(bonusHealth) + baseHealth);
    super.setStrength(super.rng.nextInt(bonusStrength) + baseStrength);
    super.setAccuracy(super.rng.nextInt(bonusAccuracy) + baseAccuracy);
  } // close constructor

  @Override
  public void useSpecialAbility(Hollowborn enemy, Random rng) {
    // TODO Auto-generated method stub
    System.out.println("Glowing spores drift through the air as you call upon Sporeshift,");

    float damageTaken = 30;
    int healAmount = 20;

      System.out.println("Some of the spores gently settle on your skin restoring your health while the rest find their mark and sting your foe!");
      enemy.reduceHealth(damageTaken);
      this.heal(healAmount);
      System.out.printf("You have recovered %d health!%n", healAmount);
    } // close Sporeshift

} // close class