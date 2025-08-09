import utility.*;
import defender.*;
import hollowborn.*;
import weapon.*;
import armour.*;
import environment.*;
  
import java.util.Random;


public class BeginQuest {
  private static Ink ink = new Ink();
  private static Validator validator = new Validator();
  private static Random rng = new Random();
  private static Defender player;
  private static Weapon weapon;
  private static Armour armour;
  private static Hollowborn enemy;
  public static Environment currentEnvironment;

  private static boolean isPlayerTurn = true;
  private static boolean gameOver = false;
  private static float damageTaken;
  private static int maxDefenders = 4;
  private static int maxWeapons = 4;
  private static int maxArmours = 3;
  private static boolean usedSpecial = false;

  private static Hollowborn[] enemies = {
    new Glimmoth(), new Sludgling(), new Shadowisp(), new Thistlebeast()
  };
  
  public static void main(String[] args) {
    gameSetup();
    ink.welcome(currentEnvironment);
    

    /////////////////////
    /// Game Loop
    while(!gameOver) {
      if(isPlayerTurn) {
        int attackType;
        boolean canUseSpecial = !usedSpecial && player.getHealth() <= 35;

          ink.attackMenu(player, canUseSpecial);
          int max = canUseSpecial ? 3 : 2;
          attackType = validator.validateAttackChoice(max);

          if(canUseSpecial && attackType == 3) {
            player.useSpecialAbility(enemy, rng);
            usedSpecial = true;
            isPlayerTurn = false;
            continue;
          }
          else {
            damageTaken = weapon.strike(
              attackType, player.getStrength(), player.getAccuracy(), armour.getArmourAccuracyCost());
          }
        if(damageTaken > 0) {
          enemy.reduceHealth(damageTaken);
          if(enemy.getHealth() <= 0) {
            ink.playerWin();
            gameOver = true;
          } 
        } 
      ink.attackResults(damageTaken, enemy, "Player");
      damageTaken = 0;  
    }
    else {
      damageTaken = enemy.getAttackName(player, rng);

    if(damageTaken > 0) {
      player.reduceHealth(damageTaken);
      if(player.getHealth() <= 0) {
        ink.enemyWin();
        gameOver = true;
      }
    } 
    
    ink.attackResults(damageTaken, player, "Enemy");
    damageTaken = 0;
    }
    isPlayerTurn = !isPlayerTurn;
  } 

  ink.goodbye();

} // close main

  //////////// Helper Methods
  /// 
  
private static Environment createWeather() {
  Random rng = new Random();
  int roll = rng.nextInt(2);

  switch (roll) {
    case 1: return new Fog();
    case 2: return new Sunshine();

    default: return new Sunshine();
  } // close environment switch
} // close Environment

private static void createDefender(String who, int choice) {
    switch (choice) {
      case 1: // Petal Knight
        if(who.equals("Player"))
          player = new PetalKnight();
        break;
      case 2: // Thorn Ranger
        if(who.equals("Player"))
          player = new ThornRanger();
        break;
      case 3: // Moss Guardian
        if(who.equals("Player"))
          player = new MossGuardian();
        break;
      case 4: // Dandelight Mystic
        if(who.equals("Player"))
          player = new Dandelight();
        break;
      
      default:
        System.out.println("Oops! The mystics scrambled reality again! Please try again and select 1, 2, 3 or 4!");
        break;
    } // close switch
} // close createDefender

private static void createWeapon(String who, int choice) {
  switch (choice) {
    case 1: // Moonveil
      if(who.equals("Player"))
        weapon = new Moonveil(); 
      break;
    case 2: // Starlit Bow
      if(who.equals("Player"))
        weapon = new StarlitBow();
      break;
    case 3: // Crystal Hammer
      if(who.equals("Player"))
        weapon = new CrystalHammer();
      break;
    case 4: // Glowbranch
      if(who.equals("Player"))
        weapon = new Glowbranch();
      break;

    default: 
      System.out.println("Whoops! The valley echoes with confusion—please choose 1, 2, 3, or 4 to continue your path.");
      break;
  } // close switch
} // close createWeapon

private static void createArmour(String who, int choice) {
  switch (choice) {
    case 1: // Patchwork Cloak
      if(who.equals("Player"))
        armour = new PatchworkCloak();
      break;
    case 2: // Mossy Mantle
      if(who.equals("Player"))
        armour = new MossyMantle();
      break;
    case 3: // Crystalplate
      if(who.equals("Player"))
        armour = new Crystalplate();
      break;

    default:
      System.out.println("The dewdrops ripple oddly… something went wrong! Try again with 1, 2 or 3.");
      break;
  } // close switch
} // close createArmour

private static void gameSetup() {
  ///////////////
  /// Player Defender
  ink.defenderMenu();
  int defenderChoice = validator.validatePick(maxDefenders);
  createDefender("Player", defenderChoice);

  ///////////////
  /// Player Weapon
  ink.weaponMenu();
  int weaponChoice = validator.validatePick(maxWeapons);
  createWeapon("Player", weaponChoice);

  ///////////////
  /// Player Armour
  ink.armourMenu();
  int armourChoice = validator.validatePick(maxArmours);
  createArmour("Player", armourChoice);

  ///////////////
  /// Enemy RNG Assignment
  enemy = enemies[rng.nextInt(enemies.length)];

  ///////////////
  /// Environment
  currentEnvironment = createWeather();

  ///////////////
  /// Print all stats
  ink.printStats(player, weapon, armour, enemy);

} // close gameSetup 

} // close class