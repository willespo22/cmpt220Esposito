  /**
   * file: Lab2_Question3
   * author: William Esposito
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 9, 2017
   * version: 1.3
   * 
   * This file contains The solution to the designated exercise 3.11
   */

import java.util.Scanner; //Scanner is in the java.util package

public class Lab2_Question3 {
  public static void main(String[] args) {
    // Create a Scanner object
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter a year
    System.out.print("Enter a year.");
    int year = input.nextInt();

    // Prompt the user to enter a month
    System.out.print("Enter a month, use a number. January = 1, Febuary = 2, etc.");
    int month = input.nextInt();

      /**
   * switch (month)
   *
   * This function is a switch statement that will return the month and how many days it had
   * based on the year.
   * 
   * Parameters:
   *   Month, user input. 
   * 
   * Return value: "month" + year + " had ___ days."
   */
    switch (month) {
    case 1:
      System.out.println("January " + year + " had 31 days.");
      break;
    case 2:
      System.out.println("Febuary " + year + " had either 28 or 29 days.");
      break;
    case 3:
      System.out.println("March " + year + " had 31 days");
      break;
    case 4:
      System.out.println("April " + year + " had 30 days");
      break;
    case 5:
      System.out.println("May " + year + " had 31 days.");
      break;
    case 6:
      System.out.println("June " + year + " had 30 days");
      break;
    case 7:
      System.out.println("July " + year + " had 31 days");
      break;
    case 8:
      System.out.println("August " + year + " had 31 days");
      break;
    case 9:
      System.out.println("September " + year + " had 30 days");
      break;
    case 10:
      System.out.println("October " + year + "had 31 days");
      break;
    case 11:
      System.out.println("November " + year + " had 30 days");
      break;
    case 12:
      System.out.println("December " + year + " had 31 days");

    }
  }
}
