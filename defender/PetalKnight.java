package defender;

import java.util.Random;

public class PetalKnight extends Defender {
  private int baseHealth = 210;
  private int bonusHealth = 35;
  private int baseStrength = 75;
  private int bonusStrength = 40;
  private int baseAccuracy = 60;
  private int bonusAccuracy = 45;

  public PetalKnight() {
    super("PetalKnight");

    super.setHealth(super.rng.nextInt(bonusHealth) + baseHealth);
    super.setStrength(super.rng.nextInt(bonusStrength) + baseStrength);
    super.setAccuracy(super.rng.nextInt(bonusAccuracy) + baseAccuracy);
  } // close constructor

  @Override
  public void useSpecialAbility(Hollowborn enemy, Random rng) {
    // TODO Auto-generated method stub
    System.out.println("You whirl in to PetalStorm, petals rushing all around you!");

    float damageTaken = 30;

    // roll to use special ability
    if (rng.nextInt(100) < 70) {
      System.out.println("With a whirl of petals, you strike twice with elegance and fury.");
      enemy.reduceHealth(damageTaken);
    }  
      else {
        System.out.println("The petals flutter and fall slowly to the ground, your strike missed.");
      }
  } // close PetalStorm

} // close class