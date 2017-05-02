
  /**
   * file: Chap4problem15.java
   * author: William Esposito
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 9, 2017
   * version: 1.3
   * 
   * This file contains The solution to the designated exercise 4.15
   */

import java.util.*; //Scanner is in the java.util package

public class Chap4problem15 {
  public static void main(String[] args) {

    // Create a Scanner object
    Scanner input = new Scanner(System.in);

    // Prompt user to enter a letter
    System.out.println("Please enter a letter . ");
    String letter = input.next();

    char c = letter.toLowerCase().charAt(0);

    switch (c) {
    case 'a':
    case 'b':
    case 'c':
      System.out.println("2");
      break;

    case 'd':
    case 'e':
    case 'f':
      System.out.println("3");
      break;

    case 'g':
    case 'h':
    case 'i':
      System.out.println("4");
      break;

    case 'j':
    case 'k':
    case 'l':
      System.out.println("5");
      break;

    case 'm':
    case 'n':
    case 'o':
      System.out.println("6");
      break;

    case 'p':
    case 'q':
    case 'r':
    case 's':
      System.out.println("7");
      break;

    case 't':
    case 'u':
    case 'v':
      System.out.println("8");
      break;

    case 'w':
    case 'x':
    case 'y':
    case 'z':
      System.out.println("9");

    default:
      System.out.println("is not a valid input.");

      break;

    }

  }

}
