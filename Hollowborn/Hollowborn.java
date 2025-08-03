package hollowborn;

import java.util.Random;
import defender.*;

public abstract class Hollowborn {
  private String archetype;
  private int health;
  private int strength;
  private int accuracy;
  private String attack;

  protected Random rng = new Random();

  public Hollowborn(String archetype) {
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
  public String getAttack() {
    return this.attack;
  }
  public int getAccuracy() {
    return this.accuracy;
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
  public void setAttack(String attack) {
    this.attack = attack;
  }
  public void setAccuracy(int accuracy) {
    this.accuracy = accuracy;
  } // setters closed

  public void reduceHealth(float damageTaken) {
    this.health -= damageTaken;
  }
  public void heal(float healAmount) {
    this.health += healAmount;
  }
  
  public abstract float getAttackName(Defender player, Random rng);
    // each archetype has their own attack

 } // close class