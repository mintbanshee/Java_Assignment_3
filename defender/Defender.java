package defender;

import java.util.Random;
import hollowborn.*;
import armour.*;

public abstract class Defender {
  private String archetype;
  private int health;
  private int strength;
  private int accuracy;
  private Armour armour;


  protected Random rng = new Random();

  public Defender(String archetype) {
    this.archetype = archetype;
  } // close constructor



  public String getArchetype() {
    return this.archetype;
  }
  public int getHealth() {
    if(this.health <= 0)
      return 0;
    else 
      return this.health;
  }
  public int getStrength() {
    return this.strength;
  }
  public int getAccuracy() {
    return this.accuracy;
  }
  public Armour getArmour() {
    return this.armour;
  } // getters closed 

  public void setArchetype(String archetype) {
    this.archetype = archetype;
  }
  public void setHealth(int health) {
    this.health = health;
  }
  public void setStrength(int strength) {
    this.strength = strength;
  }
  public void setAccuracy(int accuracy) {
    this.accuracy = accuracy;
  }
  public void setArmour(Armour selectedArmour) {
    this.armour = selectedArmour;
  } // setters closed

  public void reduceHealth(float damageTaken) {
    this.health -= damageTaken;
  }
  public void heal(float healAmount) {
    this.health += healAmount;
  }
  public abstract void useSpecialAbility(Hollowborn enemy, Random rng);
    // each archetype has their own ability
    
} // close class