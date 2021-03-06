
/**
 * file: Lab2_Question 4.java
 * author: William Esposito
 * course: CMPT 220
 * assignment: Lab 2
 * due date: February 9, 2017
 * version: 1.3
 * 
 * This file contains The solution to the designated exercise 3.15
 */
import java.util.*; //Scanner is in the java.util package

public class Lab2_Question4 {
  public static void main(String[] args) {
    // Create a Scanner object
    Scanner input = new Scanner(System.in);

    int lottery = (int) (Math.random() * 1000);

    int digit1 = lottery / 100;
    int digit2 = lottery / 10;
    int digit3 = lottery % 10;

    // Prompt the user to enter a three-digit number
    System.out.print("Enter a three-digit number: ");
    int guess = input.nextInt();

    // Extracting digits from user input
    int hundredsPlace = guess / 100;
    int remainder = guess % 100;
    int tensPlace = guess / 10;
    int onesPlace = guess % 10;

    System.out.println("The lotto number is " + lottery);

    /**
     * lottery
     *
     * This function compares the randomly generated number to the number
     * inserted by the user and gives cash prize accordingly.
     * 
     * Parameters: guess: the user input lottery: the randomly generated integer
     * 
     * Return value: The prize, or lack of prize.
     */

    if (guess == lottery)
      System.out.println("You matched all 3 numbers exactly, you win $10,000!");
    else if (hundredsPlace == digit1 && tensPlace == digit2 && onesPlace == digit3)
      System.out.println("You got the correct numbers, you win $3,000!");
    else if (onesPlace == digit3 && digit1 != hundredsPlace && digit2 != tensPlace)
      System.out.println("You got one number correct, you win $1,000!");
    else if (onesPlace != digit3 && digit1 == hundredsPlace && digit2 != tensPlace)
      System.out.println("You got one number correct, you win $1,000!");
    else if (onesPlace != digit3 && digit1 != hundredsPlace && digit2 == tensPlace)
      System.out.println("You got one number correct, you win $1,000!");
    else
      System.out.println("Sorry, no match.");

  }
}
