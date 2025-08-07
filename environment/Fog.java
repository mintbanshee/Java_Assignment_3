package environment;

public class Fog extends Environment {

  public Fog() {
    super();
    int accuracyLoss = -5;
    super.setAccuracyLoss(accuracyLoss);
    super.setType("Fog");
  } // close constructor

  public Fog(int accuracyLoss) {
    super();
    super.setAccuracyLoss(accuracyLoss);
    super.setType("Fog");
  } // close constructor

} // close class