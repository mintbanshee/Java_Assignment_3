package defender;

import java.util.Random;
import hollowborn.*;

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
    System.out.println("You slam your Rootspike into the ground, calling Rootwall to protect you!");

    int healAmount = 25;

    System.out.println("The ground rumbles as roots surge up from the earth to encase you and patch some of your wounds.");
      this.heal(healAmount);
    System.out.printf("You have recovered %d health!%n", healAmount);
    }  // close Rootwall

} // close class