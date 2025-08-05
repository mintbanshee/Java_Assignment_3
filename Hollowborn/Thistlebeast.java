package hollowborn;

import java.util.Random;

import defender.*;

public class Thistlebeast extends Hollowborn {
  private int baseHealth = 320;
  private int bonusHealth = 60;
  private int baseStrength = 95;
  private int bonusStrength = 35;
  private int baseAccuracy = 35;
  private int bonusAccuracy = 15;

  public Thistlebeast() {
    super("Thistlebeast");

    super.setHealth(super.rng.nextInt(bonusHealth) + baseHealth);
    super.setStrength(super.rng.nextInt(bonusStrength) + baseStrength);
    super.setAccuracy(super.rng.nextInt(bonusAccuracy) + baseAccuracy);
  } // close constructor

  @Override
  public float getAttackName(Defender player, Random rng) {
    // TODO Auto-generated method stub

    float damageTaken = 35;

    // enemy attack - Briarcrush
    if (rng.nextInt(100) < 60) {
      System.out.println("Thistlebeast slams down its thorny bulk, crushing everything beneath with a groaning roar of splintered earth!");
      System.out.printf("You have taken %.0f damage!%n", damageTaken);
      return damageTaken;
    }  
      else {
        System.out.println("Thistlebeast lunges, but its massive limbs crash into the dirt—missing their mark as the thorns rustle in frustration.");
        return 0;
      }
  } // close Briarcrush

} // close class