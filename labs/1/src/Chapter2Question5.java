/**
 * file: Chapter2Question5.java 
 * author: William Esposito 
 * course: CMPT 220 
 * assignment: Lab 1
 * due date: January 26
 * version: 1.3
 * 
 * This file contains a program with answer for designated problem
 */


import java.util.Scanner; //Scanner is in the java.util package

public class Chapter2Question5 {
  public static void main(String[] args) {
    // Create Scanner object
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter the subtotal and a gratuity rate
    System.out.print("Enter a subtotal and gratuity rate, the numbers should be seperated by a space.: ");
    double subtotal = input.nextDouble();
    double gratuityRate = input.nextDouble();

    // Calculate gratuity and total
    double gratuity = subtotal * (gratuityRate / 100);
    double total = subtotal + gratuity;

    // Show results
    System.out.println("The gratuity is $" + gratuity + " and total is $" + total);

  }
}
