package weapon;

public class StarlitBow extends Weapon {
  private int baseDamage = 40;
  private int accuracyCost = 25;
  private int hitChance = 100; // relies on defender's skills

  public StarlitBow() {
    super("StarlitBow");
    super.setBaseDamage(baseDamage);
    super.setAccuracyCost(accuracyCost);
  } // close constructor

  public int strike(int attackType, int accuracy, int accuracyCost, int strength) {
    int damageTaken = 0;
    int roll = super.rng.nextInt(100) + 1;
    roll += attackType * super.FACTOR_5;
    roll -= attackType / super.FACTOR_10;
    roll += this.accuracyCost / super.FACTOR_10;

    if(roll <= this.hitChance) {
      damageTaken = this.baseDamage + super.rng.nextInt(strength / super.FACTOR_5);
    }

    return damageTaken;
  } // close strike

} // close class