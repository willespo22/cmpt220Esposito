/**
 * file: Chap9Problem13test.java 
 * author: William Esposito 
 * course: CMPT 220
 * assignment: Lab 5 
 * due date: April 20 2017 
 * version: 1.3
 * 
 * This file contains a program with answer for designated problem
 */

import java.util.Scanner;

import location.Location;

public class Chap9Problem13test {

  public static void main(String[] args) {

    // Prompt user to enter number of rows and columns and save those values
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of rows and columns in the array: ");
    int row = input.nextInt();
    int column = input.nextInt();
    double[][] m = new double[row][column];

    // Prompt user to enter the array
    System.out.println("Enter the array:");
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[i].length; j++) {
        m[i][j] = input.nextDouble();
      }
    }

    // Display results

    Location location = Location.locateLargest(m);

    System.out.println("The location of the largest element is " + location.maxValue + " at (" + location.row + ", "
        + location.column + ")");
  }
}
