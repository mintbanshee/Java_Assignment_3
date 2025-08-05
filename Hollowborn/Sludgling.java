package hollowborn;

import java.util.Random;

import defender.*;

public class Sludgling extends Hollowborn {
  private int baseHealth = 300;
  private int bonusHealth = 50;
  private int baseStrength = 85;
  private int bonusStrength = 30;
  private int baseAccuracy = 40;
  private int bonusAccuracy = 20;

  public Sludgling() {
    super("Sludgling");

    super.setHealth(super.rng.nextInt(bonusHealth) + baseHealth);
    super.setStrength(super.rng.nextInt(bonusStrength) + baseStrength);
    super.setAccuracy(super.rng.nextInt(bonusAccuracy) + baseAccuracy);
  } // close constructor

  @Override
  public float getAttackName(Defender player, Random rng) {
    // TODO Auto-generated method stub

    float damageTaken = 20;

    // enemy attack - Mirelash
    if (rng.nextInt(100) < 70) {
      System.out.println("A whipping tendril of muck lashes out, flinging bile and decay in its wake!");
      System.out.printf("You have taken %.0f damage!%n", damageTaken);
      return damageTaken;
    }  
      else {
        System.out.println("Tendrils of muck start to flail and fall to the ground. Your foe's attack failed.");
        return 0;
      }
  } // close Mirelash

} // close class