package hollowborn;

import java.util.Random;

import defender.*;

public class Glimmoth extends Hollowborn {
  private int baseHealth = 180;
  private int bonusHealth = 40;
  private int baseStrength = 65;
  private int bonusStrength = 25;
  private int baseAccuracy = 100;
  private int bonusAccuracy = 40;

  public Glimmoth() {
    super("Glimmoth");

    super.setHealth(super.rng.nextInt(bonusHealth) + baseHealth);
    super.setStrength(super.rng.nextInt(bonusStrength) + baseStrength);
    super.setAccuracy(super.rng.nextInt(bonusAccuracy) + baseAccuracy);
  } // close constructor

  @Override
  public float getAttackName(Defender player, Random rng) {
    // TODO Auto-generated method stub

    float damageTaken = 15;

    // enemy attack - Glimmersting
    if (rng.nextInt(100) < 85) {
      System.out.println("Glimmoth bursts in a radiant flare, dazzling your senses with eerie brilliance!");
      player.reduceHealth(damageTaken);
      System.out.printf("You have taken %.0f damage!%n", damageTaken);
      return damageTaken;
    }  
      else {
        System.out.println("A shimmer flickers weakly before fading into the mist. Your foe's attack missed.");
        return 0;
      }
  } // close Glimmersting

} // close class