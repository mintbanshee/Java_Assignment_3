package defender;

import java.util.Random;
import hollowborn.*;

public class ThornRanger extends Defender {
  private int baseHealth = 170;
  private int bonusHealth = 25;
  private int baseStrength = 55;
  private int bonusStrength = 20;
  private int baseAccuracy = 160;
  private int bonusAccuracy = 60;

  public ThornRanger() {
    super("ThornRanger");
    this.specialAbilityName = "Needlehail";

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