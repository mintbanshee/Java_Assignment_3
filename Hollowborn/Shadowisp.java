package hollowborn;

import java.util.Random;

import defender.*;

public class Shadowisp extends Hollowborn {
  private int baseHealth = 190;
  private int bonusHealth = 35;
  private int baseStrength = 60;
  private int bonusStrength = 20;
  private int baseAccuracy = 95;
  private int bonusAccuracy = 25;

  public Shadowisp() {
    super("Shadowisp");

    super.setHealth(super.rng.nextInt(bonusHealth) + baseHealth);
    super.setStrength(super.rng.nextInt(bonusStrength) + baseStrength);
    super.setAccuracy(super.rng.nextInt(bonusAccuracy) + baseAccuracy);
  } // close constructor

  @Override
  public float getAttackName(Defender player, Random rng) {
    // TODO Auto-generated method stub

    float damageTaken = 18;

    // enemy attack - Whisperrend
    if (rng.nextInt(100) < 80) {
      System.out.println("A sharp whisper curls around you—cold and full of menace—as Shadowisp sinks through your guard!");
      player.reduceHealth(damageTaken);
      System.out.printf("You have taken %.0f damage!%n", damageTaken);
      return damageTaken;
    }  
      else {
        System.out.println("A shadow coils toward you, but vanishes in a wisp before it can strike. Shadowisp missed.");
        return 0;
      }
  } // close Whisperrend

} // close class