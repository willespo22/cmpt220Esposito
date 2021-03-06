  /**
   * file: Lab2_Question5.java
   * author: William Esposito
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 9, 2017
   * version: 1.3
   * 
   * This file contains The solution to the designated exercise 4.1
   */

import java.util.*; //Scanner is in the java.util package

public class Lab2_Question5 {
  public static void main(String[] args) {
    // Create a Scanner object
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter the radius
    System.out.print("Enter the length from center of a pentagon to a vertex: ");
    double r = input.nextDouble();

    double s = (2 * r) * Math.sin(Math.PI / 5);

    double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));

    System.out.format("%.2f%n", area);
  }
}
