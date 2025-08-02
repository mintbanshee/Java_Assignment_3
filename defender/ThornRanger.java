package defender;

import java.util.Random;

public class ThornRanger extends Defender {
  private int baseHealth = 210;
  private int bonusHealth = 35;
  private int baseStrength = 75;
  private int bonusStrength = 40;
  private int baseAccuracy = 60;
  private int bonusAccuracy = 45;

  public ThornRanger() {
    super("ThornRanger");

    super.setHealth(super.rng.nextInt(bonusHealth) + baseHealth);
    super.setStrength(super.rng.nextInt(bonusStrength) + baseStrength);
    super.setAccuracy(super.rng.nextInt(bonusAccuracy) + baseAccuracy);
  } // close constructor

  @Override
  public void useSpecialAbility(Hollowborn enemy, Random rng) {
    // TODO Auto-generated method stub
    System.out.println("You summon Needlehail - thunder rumbles as misty green clouds begin to form overhead!");

    float damageTaken = 22;

    // roll to use special ability
    if (rng.nextInt(100) < 85) {
      System.out.println("You unleash a thorny hailstorm, peppering the enemy from all angles!");
      enemy.reduceHealth(damageTaken);
    }  
      else {
        System.out.println("The thunder silences and the green clouds dissipate, your strike missed.");
      }
  } // close Needlehail

} // close class