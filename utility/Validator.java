package utility;

import java.util.Scanner;

public class Validator {
  Scanner input = new Scanner(System.in);
  int choice = 0;

  public Validator() {}

  public int validatePick(int maxVal) {
    choice = 0;

    while (true) {
      System.out.printf("Enter a number between 1 and %d%n", maxVal);
      try { 
        choice = Integer.parseInt(input.nextLine());

        if (choice >= 1 && choice <= maxVal) {
          System.out.println("You entered: " + choice);
          break;
        } // close if
        else {
          System.out.printf("Invalid number. Please enter from 1 to %d%n", maxVal);
        } // close else
      } // close try
      catch (NumberFormatException e) {
        System.out.println("that's not a valid number. Please try again");
      } // close catch
      finally {
        // do nothing
      }
    } // close while

    return choice;
  } // close validate()

  public int validateAttackChoice(int maxVal) {
    choice = 0;

    while (true) {
      System.out.printf("Enter a number between 1 and %d%n", maxVal);
      try {
        choice = Integer.parseInt(input.nextLine());

        if (choice >= 1 && choice <= maxVal) {
          System.out.println("You entered: " + choice);
          break;
        }
        else {
          System.out.printf("Invalid number. Please enter from 1 to %d%n", maxVal);
        }
      } // close try
        catch (NumberFormatException e) {
          System.out.println("That's not a valid number. Please try again.");
        } // close catch
      
    } // close while

    return choice;

  } // close validate 

} // close class