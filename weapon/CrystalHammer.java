package weapon;

public class CrystalHammer extends Weapon {
  private int baseDamage = 55;
  private int accuracyCost = 35;
  private int hitChance = 90;

  public CrystalHammer() {
    super("CrystalHammer");
    super.setBaseDamage(baseDamage);
    super.setAccuracyCost(accuracyCost);
  } // close constructor

  public int strike(int attackType, int accuracy, int accuracyCost, int strength) {
    int damageTaken = 0;
    int roll = super.rng.nextInt(100) + 1;
    roll += attackType * super.FACTOR_5;
    roll -= attackType / super.FACTOR_10;
    roll += (this.accuracyCost + accuracyCost) / super.FACTOR_10;

    if(roll <= this.hitChance) {
      damageTaken = this.baseDamage + super.rng.nextInt(strength / super.FACTOR_5);
    }

    return damageTaken;
  } // close strike

} // close class