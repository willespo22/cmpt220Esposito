/**
   * file: Chapter6Problem20.java
   * author: William Esposito
   * course: CMPT 220
   * assignment: Lab 4
   * due date: March 9, 2017
   * version: 1.3
   * 
   * This file contains The solution to the designated exercise 6.20
   */

import java.util.Scanner; //Scanner is within the java.util package

public class Chapter6Problem20 {
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Prompt user to enter a string
    System.out.println("Please enter a string: ");
    String string = input.nextLine();

    // Show the number of characters in the string
    System.out.println(" There are " + characterCounter(string) + " letters in this string.");
  }

  /**
   * characterCounter
   * 
   * This function computes the number of characters in a string by forming a
   * loop that adds a number for every character in a string.
   * 
   * Parameters: String s: The string that was inputed by the user.
   * 
   * Return value: The number of characters in a string.
   */

  public static int characterCounter(String s) {
    // Counts the number of characters
    int numberOfCharacters = 0;
    for (int i = 0; i < s.length(); i++) {
      // Test if character is a letter
      if (Character.isLetter(s.charAt(i)))
        numberOfCharacters++;
    }
    return numberOfCharacters;

  }

}
