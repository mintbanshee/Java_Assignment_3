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

  public void Welcome() {
    System.out.println("*************************************");
    System.out.println("~~~ Welcome to Dewdrop Defenders! ~~~");
    System.out.println("*************************************");
  } // close welcome

   public void Goodbye() {
    System.out.println("*************************************");
    System.out.println("~~~~~~ Thank you for playing! ~~~~~~");
    System.out.println("*************************************");
  } // close goodbye

  public void printStats(Defender player, Weapon weapon, Armour armour, Hollowborn enemy) {
    
  }
}