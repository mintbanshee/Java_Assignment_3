package utility;

import defender.*;
import weapon.*;
import armour.*;
import hollowborn.*;
import environment.*;

public class Ink {
  public static final String RESET = "\u001B[0m";
  public static final String BLACK = "\u001B[30m"; // not really black
  public static final String RED = "\u001B[31m";
  public static final String GREEN = "\u001B[32m";
  public static final String YELLOW = "\u001B[33m";
  public static final String BLUE = "\u001B[34m";
  public static final String PURPLE = "\u001B[35m";
  public static final String CYAN = "\u001B[36m";
  public static final String WHITE = "\u001B[37m";

  public static final String BOLD = "\u001B[0m";
  public static final String UNDERLINE = "\u001B[1m";

  public Ink() {} 

  public void welcome(Environment environment) {
    System.out.println("*************************************");
    System.out.println("~~~ Welcome to Dewdrop Defenders! ~~~");
    System.out.printf("~~~ Today's weather is" + BLUE + "%s" + RESET, environment.getType());
    System.out.println("*************************************\n");
  } // close welcome

   public void goodbye() {
    System.out.println("*************************************");
    System.out.println("~~~~~~ Thank you for playing! ~~~~~~");
    System.out.println("*************************************\n");
  } // close goodbye

  public void printStats(Defender player, Weapon weapon, Armour armour, Hollowborn enemy) {
    System.out.println("*************************************");
    System.out.printf("~~~ " + GREEN + "%s(%s) Stats:%n", "Player" + RESET, player.getArchetype());
    System.out.printf("~~~ " + CYAN + "Armour:" + RESET + " %s%n", armour.getType());
    System.out.printf("~~~ " + CYAN + "Weapon:" + RESET + " %s%n", weapon.getType());
    System.out.printf("~~~ " + CYAN + "Ability:" + RESET + " %s%n", player.getSpecialAbilityName());
    System.out.printf("~~~ " + CYAN + "Health:" + RESET + " %s%n", player.getHealth());
    System.out.printf("~~~ " + CYAN + "Strength:" + RESET + " %s%n", player.getStrength());
    System.out.printf("~~~ " + CYAN + "Accuracy:" + RESET + " %s%n", player.getAccuracy());
    System.out.println("*************************************\n");
    System.out.printf("~~~ " + RED + "%s(%s) Stats:%n", "Enemy" + RESET, enemy.getArchetype());
    System.out.printf("~~~ " + YELLOW + "Attack:" + RESET + " %s%n", enemy.getHollowbornAttack());
    System.out.printf("~~~ " + YELLOW + "Health:" + RESET + " %s%n", player.getHealth());
    System.out.printf("~~~ " + YELLOW + "Strength:" + RESET + " %s%n", player.getStrength());
    System.out.printf("~~~ " + YELLOW + "Accuracy:" + RESET + " %s%n", player.getAccuracy());
    System.out.println("*************************************\n");
  } // close printStats()

  public void printResults(String who, int damage, Defender defender) {
    System.out.println("*************************************");
    if(who.equals("Player")) {
      if(damage > 0) {
        System.out.printf("~~~ %s does %d damage leaving%n~~~ Hollowborn with %d HP left%n",
          who, damage, defender.getHealth());
      }
      else {
        System.out.printf("~~~ %s misses, Hollowborn still has %d%n",
          who, defender.getHealth());
      }
    }
    else {
      if(damage > 0) {
        System.out.printf("~~~ %s does %d damage leaving%n~~~ defender with %d HP left%n",
          who, damage, defender.getHealth());
      }
      else {
        System.out.printf("~~~ %s misses, defender still has %d HP%n",
          who, defender.getHealth());
      }
    }
    System.out.println("*************************************\n");
  }

  public void attackResults(float damage, Defender defender, String who) {
    if(damage > 0) {
      System.out.printf(GREEN + "%s %s HITS for %.0f damage!%n",
        who, defender.getArchetype(), damage);
      System.out.printf("%.0f HP lost%n", damage);
      System.out.printf("%d HP remaining%n" + RESET, defender.getHealth());
    }
    else {
      System.out.printf(GREEN + "%n%s %s MISSES!%n%n" + RESET, who, defender.getArchetype());
    } 
  } // close attackResults()

    public void attackResults(float damage, Hollowborn enemy, String who) {
    if(damage > 0) {
      System.out.printf(RED + "%s %s HITS for %.0f damage!%n",
        who, enemy.getArchetype(), damage);
      System.out.printf("%.0f HP lost%n", damage);
      System.out.printf("%d HP remaining%n" + RESET, enemy.getHealth());
    }
    else {
      System.out.printf(RED + "%n%s %s MISSES!%n%n" + RESET, who, enemy.getArchetype());
    } 
  } // close attackResults()

   public void defenderMenu() {
    System.out.println("*************************************");
    System.out.println("~~~~~~~ Choose Your Defender! ~~~~~~~");
    System.out.println("~~~ 1) Petal Knight");
    System.out.println("~~~ 2) Thorn Ranger");
    System.out.println("~~~ 3) Moss Guardian");
    System.out.println("~~~ 4) Dandelight");
    System.out.println("*************************************\n");
  } // close defenderMenu()

   public void weaponMenu() {
    System.out.println("*************************************");
    System.out.println("~~~~~~~ Choose Your Weapon! ~~~~~~~");
    System.out.println("~~~ 1) Moonveil (sword)");
    System.out.println("~~~ 2) Starlit Bow");
    System.out.println("~~~ 3) Crystal Hammer");
    System.out.println("~~~ 4) Glowbranch (staff)");
    System.out.println("*************************************\n");
  } // close weaponMenu()

   public void armourMenu() {
    System.out.println("*************************************");
    System.out.println("~~~~~~~ Choose Your Armour! ~~~~~~~");
    System.out.println("~~~ 1) Patchwork Cloak");
    System.out.println("~~~ 2) Mossy Mantle");
    System.out.println("~~~ 3) Crystalplate");
    System.out.println("*************************************\n");
  } // close armourMenu()

   public void attackMenu(Defender player) {
    System.out.println("*************************************");
    System.out.println("~~~~~~~ Make Your Move! ~~~~~~~");
    System.out.println("~~~ 1) Normal");
    System.out.println("~~~ 2) Heavy");
      if(player.getHealth() <= 35) {
        System.out.println("~~~ 3) Special Ability");
      }
    System.out.println("*************************************\n");
  } // close attackMenu()

}