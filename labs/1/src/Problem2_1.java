/**
 * file: Problem2_1.java 
 * author: William Esposito 
 * course: CMPT 220 
 * assignment: Lab 1
 * due date: January 26
 * version: 1.3
 * 
 * This file contains a program with answer for designated problem
 */

import java.util.Scanner; //Scanner is in the java.util package

public class Problem2_1 {
  public static void main(String[] args) {
    // Create a Scanner object
    Scanner input = new Scanner(System.in);
 
    // Prompt the user to enter a degree in Celcius
    System.out.print("Enter a degree in Celcius: ");
    double celcius = 0, farenheit = input.nextDouble();

     // Compute temperature
     farenheit = (9.0 / 5) * celcius + 32;

     System.out.println(celcius + " celcius is " + farenheit + " degrees Farenheit.");
  }
}
