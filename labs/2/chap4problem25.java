  /**
   * file: chap4problem25.java
   * author: William Esposito
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 9, 2017
   * version: 1.3
   * 
   * This file contains The solution to the designated exercise 4.25
   */

public class chap4problem25 {
  public static void main(String[] args) {

    // Generate letters based off of ASCII code A-Z is between 65 - 90
    char letter1 = (char) ((int) (Math.random() * 26 + 65));
    char letter2 = (char) ((int) (Math.random() * 26 + 65));
    char letter3 = (char) ((int) (Math.random() * 26 + 65));

    // Generate numbers
    int number1 = (int) (Math.random() * 10);
    int number2 = (int) (Math.random() * 10);
    int number3 = (int) (Math.random() * 10);

    System.out.println("The liscence plate is " + letter1 + letter2 + letter3 + number1 + number2 + number3);
  }
}
