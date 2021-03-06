import java.util.Scanner;

  /**
   * file: Lab2_Question6.java
   * author: William Esposito
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 9, 2017
   * version: 1.3
   * 
   * This file contains The solution to the designated exercise 4.5
   */

import java.util.*; //Scanner is in the java.util package

public class Lab2_Question6 {
  public static void main(String[] args) {

    // Create a Scanner object
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter sides
    System.out.print("Enter the number of sides for this polygon: ");
    int n = input.nextInt();

    // Prompt the user to enter length
    System.out.print("Enter the length of this polygon: ");
    double s = input.nextDouble();

    double area = (double)((n * Math.pow(s, 2))) / (double)((4 * Math.tan(Math.PI / n)));
    System.out.println("The area of the polygon is: " + area);

  }
}
