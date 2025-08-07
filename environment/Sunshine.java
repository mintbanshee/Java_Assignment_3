package environment;

public class Sunshine extends Environment {

  public Sunshine() {
    super();
    int accuracyBoost = 10;
    super.setAccuracyBoost(accuracyBoost);
    super.setType("Sunshine");
  } // close constructor

  public Sunshine(int accuracyBoost) {
    super();
    super.setAccuracyBoost(accuracyBoost);
    super.setType("Sunshine");
  } // close constructor

} // close class