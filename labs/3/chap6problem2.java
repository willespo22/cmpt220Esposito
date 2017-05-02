
/**
 * file: chap6problem2.java
 * author: William Esposito
 * course: CMPT 220
 * assignment: Lab 3
 * due date: February 24, 2017
 * version: 1.3
 * 
 * This file contains The solution to the designated exercise 6.2
 */

import java.util.Scanner; //Scanner is within the java.util package

public class chap6problem2 {
  private static Scanner input;

  public static void main(String[] args) {
    input = new Scanner(System.in);
    System.out.println("Please enter an integer: ");
    long n = input.nextLong();
    System.out.println("The sum of the integers are " + sumDigits(n));
  }

  /**
   * sumDigits
   *
   * This function computes the sum of the digits entered
   * 
   * Parameters: temp: Temp here represents the absolute value of the integer
   * generated. answer: Answer is a variable set to 0
   * long n: The user input of an integer.
   * 
   * Return value: The sum of the digits
   */
  public static int sumDigits(long n) {
    // Creating temporary integer as an absolute value of n
    int temp = (int) Math.abs(n);
    int answer = 0;
    while (temp != 0) {
      answer += (temp % 10);
      temp = temp / 10;

    }

    // return answer
    return answer;

  }
}
