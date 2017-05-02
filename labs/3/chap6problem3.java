
/**
 * file: chap6problem3.java
 * author: William Esposito
 * course: CMPT 220
 * assignment: Lab 3
 * due date: February 24, 2017
 * version: 1.3
 * 
 * This file contains The solution to the designated exercise 6.3
 */

import java.util.Scanner; // Scanner is in the java.util package

public class chap6problem3 {
  public static void main(String[] args) {
    // Creating Scanner
    Scanner input = new Scanner(System.in);

    // Create Palindrome boolean
    boolean ispalindrome;

    // Request user to enter integer
    System.out.println("Enter an integer: ");
    int number = input.nextInt();

    // Retrieving isPalindrom method
    ispalindrome = isPalindrome(number);

    if (ispalindrome)
      System.out.println(number + "This is a Palindrome number.");
    else
      System.out.println(number + "Is not a Palindrome number.");
  }

  /**
   * isPalindrome
   *
   * This function computes the reversal of the int number
   * 
   * Parameters: number: The number entered by user.
   * 
   * Return value: true or false value depending on whether number is a
   * Palindrome or not.
   */
  public static boolean isPalindrome(int number) {
    int reverse = reverse(number);

    // Now compare the reversed value to that of the original value
    if (reverse == number)
      return true;
    else
      return false;

  }

  /**
   * reverse
   *
   * This function takes the number entered by user and computes it's reversed
   * value.
   * 
   * Parameters: number: The number entered by user
   * 
   * Return value: The reverse of the number, to be used by function
   * isPalindrome.
   */
  public static int reverse(int number) {
    // declaring variables for loop

    int reverse = 0;
    int remainder;

    // loop to find reverse
    while (number > 0) {
      remainder = number % 10;
      reverse = reverse * 10 + remainder;
      number = number / 10;
    }
    return reverse;
  }
}
