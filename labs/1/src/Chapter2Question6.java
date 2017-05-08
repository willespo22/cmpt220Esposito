/**
 * file: Chap2Question6.java 
 * author: William Esposito 
 * course: CMPT 220 
 * assignment: Lab 1
 * due date: January 26
 * version: 1.3
 * 
 * This file contains a program with answer for designated problem
 */

import java.util.Scanner; //Scanner is in the java.util package

public class Chapter2Question6 {
  public static void main(String[] args) {
    // Create Scanner object
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter the integer
    System.out.print("Enter a number betwen 0 and 1000");
    int integer = (int) input.nextDouble();

    // Calculate

    // Extract the ones place number
    int ones = integer % 10;

    // Extract the tens place number
    int tens = (integer / 10) % 10;

    // Extract the hundreds place number
    int hundreds = (integer / 100) % 10;

    int answer = ones + tens + hundreds;

    System.out.print(" The sum of the digit is " + answer);

  }
}
