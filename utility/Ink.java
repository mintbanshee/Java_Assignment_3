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
    System.out.printf("~~~~ Today's weather is " + BLUE + "%s " + RESET + "~~~~%n", environment.getType());
      if (environment.getType().equals("Fog")) {
        System.out.println("~~~ Effect: " + BLUE + "Accuracy reduced by 5 ~~~~" + RESET);
      }
      else if
        (environment.getType().equals("Sunshine")) {
          System.out.println("~ Effect: " + BLUE + "Accuracy increased by 10 ~" + RESET);
      }
    System.out.println("*************************************\n");
  } // close welcome

  public void goodbye() {
    System.out.println("\n*************************************");
    System.out.println("~~~~~~ Thank you for playing! ~~~~~~");
    System.out.println("*************************************\n");
  } // close goodbye


  public void dandelightSpecial() {
    System.out.println(PURPLE + "\n***************************************************************************************\n" + RESET);
    System.out.println(PURPLE + "~~~~~~~~~~~~~~~~~~~~~~~~~ Dandelight calls upon Sporeshift! ~~~~~~~~~~~~~~~~~~~~~~~~~~" + RESET);
    System.out.println(PURPLE + "Glowing spores drift through the air, gently settle on your skin restoring your health" + RESET);
    System.out.println(PURPLE + "~~~~~~~~~~~~~~~~~~ while the rest find their mark and sting your foe! ~~~~~~~~~~~~~~~~~\n" + RESET);
    System.out.println(PURPLE + "\n***************************************************************************************\n" + RESET);
  }
   public void mossSpecial() {
    System.out.println(PURPLE + "\n************************************************************************************************\n" + RESET);
    System.out.println(PURPLE + "~~~~~~~~~~~ Moss Guardian slams their rootspike into the ground, summoning Rootwall! ~~~~~~~~~~~" + RESET);
    System.out.println(PURPLE + "The ground rumbles as roots surge up from the earth to encase you and patch some of your wounds" + RESET);
    System.out.println(PURPLE + "~~~~~~~~~~~~~~~~~~~~~~ while the rest find their mark and sting your foe! ~~~~~~~~~~~~~~~~~~~~~~\n" + RESET);
    System.out.println(PURPLE + "\n*************************************************************************************************\n" + RESET);
  }
   public void petalSpecial() {
    System.out.println(PURPLE + "\n*****************************************************************************\n" + RESET);
    System.out.println(PURPLE + "Petal Knight whirls in to a Petalstorm, petals rushing all around the battle!" + RESET);
    System.out.println(PURPLE + "Surrounded by petals, you strike twice with elegance and fury.\n" + RESET);
    System.out.println(PURPLE + "\n*****************************************************************************\n" + RESET);
  }
   public void rangerSpecial() {
    System.out.println(PURPLE + "\n**********************************************************************\n" + RESET);
    System.out.println(PURPLE + "~~~~~~~~~~~~~~~~~~~ Thorn Ranger summons Needlehail ~~~~~~~~~~~~~~~~~~" + RESET);
    System.out.println(PURPLE + "~~~ Thunder rumbling as misty green clouds begin to form overhead! ~~~" + RESET);
    System.out.println(PURPLE + "You unleash a thorny hailstorm, peppering the enemy from all angles!\n" + RESET);
    System.out.println(PURPLE + "********************************************************************\n" + RESET);
  } // special abilities close

    public void playerWin() {
    System.out.println(GREEN + "\n***************************************" + RESET);
    System.out.println(GREEN + "~~~~~~~~ !! Congratulations !! ~~~~~~~~" + RESET);
    System.out.println(GREEN + "~~~~ You have defended the valley! ~~~~" + RESET);
    System.out.println(GREEN + "~~~~~~~~~~ !! Player Wins !! ~~~~~~~~~~" + RESET);
    System.out.println(GREEN + "***************************************\n" + RESET);
  } // close playerwin
    public void enemyWin() {
    System.out.println(RED + "\n********************************************************" + RESET);
    System.out.println(RED + "~~~~~ !! The Hollowborn have taken the valley !! ~~~~~~" + RESET);
    System.out.println(RED + "~~~~~~~~~~~~~~ !! The Hollowborn Wins !! ~~~~~~~~~~~~~~" + RESET);
    System.out.println(RED + "********************************************************\n" + RESET);
  } // close enemywin




  public void printStats(Defender player, Weapon weapon, Armour armour, Hollowborn enemy) {
    System.out.println("\n*************************************");
    System.out.printf("~~~ " + GREEN + "%s(%s) Stats: " + RESET + "%n", "Player", player.getArchetype());
    System.out.printf("~~~ " + CYAN + "Armour:" + RESET + " %s%n", armour.getType());
    System.out.printf("~~~ " + CYAN + "Weapon:" + RESET + " %s%n", weapon.getType());
    System.out.printf("~~~ " + CYAN + "Ability:" + RESET + " %s%n", player.getSpecialAbilityName());
    System.out.printf("~~~ " + CYAN + "Health:" + RESET + " %s%n", player.getHealth());
    System.out.printf("~~~ " + CYAN + "Strength:" + RESET + " %s%n", player.getStrength());
    System.out.printf("~~~ " + CYAN + "Accuracy:" + RESET + " %s%n", player.getAccuracy());
    System.out.println("*************************************");
    System.out.printf("~~~ " + RED + "%s(%s) Stats: " + RESET + "%n", "Enemy", enemy.getArchetype());
    System.out.printf("~~~ " + YELLOW + "Attack:" + RESET + " %s%n", enemy.getHollowbornAttack());
    System.out.printf("~~~ " + YELLOW + "Health:" + RESET + " %s%n", enemy.getHealth());
    System.out.printf("~~~ " + YELLOW + "Strength:" + RESET + " %s%n", enemy.getStrength());
    System.out.printf("~~~ " + YELLOW + "Accuracy:" + RESET + " %s%n", enemy.getAccuracy());
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

// player attacking enemy
  public void attackResults(float damage, Hollowborn enemy, String who) {
    if(damage > 0) {
      System.out.printf(GREEN + "%n%s HITS %s for %.0f damage!%n" + RESET,
        who, enemy.getArchetype(), damage);
      System.out.printf(RED + "%s has %d HP remaining%n" + RESET, enemy.getArchetype(), enemy.getHealth());
    }
    else {
      System.out.printf(GREEN + "%n%s MISSES %s!%n%n" + RESET, who, enemy.getArchetype());
    } 
  } // close attackResults()

  // enemy attacking player
    public void attackResults(float damage, Defender defender, String who) {
    if(damage > 0) {
      System.out.printf(RED + "%n%s HITS %s for %.0f damage!%n" + RESET,
        who, defender.getArchetype(), damage);
      System.out.printf(GREEN + "%s has %d HP remaining%n" + RESET, defender.getArchetype(), defender.getHealth());
    }
    else {
      System.out.printf(RED + "%n%s MISSES %s!%n%n" + RESET, who, defender.getArchetype());
    } 
  } // close attackResults()

   public void defenderMenu() {
    System.out.println("\n*************************************");
    System.out.println("~~~~~~~ Choose Your Defender! ~~~~~~~");
    System.out.println("~~~ 1) Petal Knight");
    System.out.println("~~~ 2) Thorn Ranger");
    System.out.println("~~~ 3) Moss Guardian");
    System.out.println("~~~ 4) Dandelight");
    System.out.println("*************************************\n");
  } // close defenderMenu()

   public void weaponMenu() {
    System.out.println("\n*************************************");
    System.out.println("~~~~~~~ Choose Your Weapon! ~~~~~~~");
    System.out.println("~~~ 1) Moonveil (sword)");
    System.out.println("~~~ 2) Starlit Bow");
    System.out.println("~~~ 3) Crystal Hammer");
    System.out.println("~~~ 4) Glowbranch (staff)");
    System.out.println("*************************************\n");
  } // close weaponMenu()

   public void armourMenu() {
    System.out.println("\n*************************************");
    System.out.println("~~~~~~~ Choose Your Armour! ~~~~~~~");
    System.out.println("~~~ 1) Patchwork Cloak");
    System.out.println("~~~ 2) Mossy Mantle");
    System.out.println("~~~ 3) Crystalplate");
    System.out.println("*************************************\n");
  } // close armourMenu()

   public void attackMenu(Defender player, boolean canUseSpecial) {
    System.out.println("\n*************************************");
    System.out.println("~~~~~~~ Make Your Move! ~~~~~~~");
    System.out.println("~~~ 1) Normal");
    System.out.println("~~~ 2) Heavy");
      if(canUseSpecial) {
        System.out.println("~~~ 3) Special Ability");
      }
    System.out.println("*************************************\n");
  } // close attackMenu()

}