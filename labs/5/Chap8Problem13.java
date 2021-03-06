
/**
 * file: Chap8Problem13.java 
 * author: William Esposito 
 * course: CMPT 220 
 * assignment: Lab 5 
 * due date: April 3 2017 
 * version: 1.3
 * 
 * This file contains a program with answer for designated problem
 */

import java.util.Scanner; // Scanner is within the Java.util package

public class Chap8Problem13 {
  public static void main(String[] args) {

    // Prompt user to enter number of rows and columns and save them
    Scanner input = new Scanner(System.in);
    System.out.printf("Enter the number of rows and columns of the array: ");
    int row = input.nextInt();
    int column = input.nextInt();
    double[][] m = new double[row][column];

    // Prompt user to enter the elements of the array and save them
    System.out.println("Enter the array ");
    for (int i = 0; i < row; i++)
      for (int k = 0; k < column; k++)
        m[i][k] = input.nextDouble();

    int[] resultPosition = findLargest(m);

    // Display results
    System.out
        .println("The location of the largest element is at (" + resultPosition[0] + ", " + resultPosition[1] + ")");
  }

  /**
   * findLargest
   * 
   * This find the largest element in a 2 dimensional array
   * 
   * Parameters: double[][]a, the array entered by user.
   * 
   * Return value: The location of the largest element.
   */

  public static int[] findLargest(double[][] a) {

    double largest = a[0][0];
    int row = 0;
    int column = 0;

    // finding location of largest element
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        if (a[i][j] > largest) {
          largest = a[i][j];
          row = i;
          column = j;
        }
      }
    }

    int[] result = { row, column };
    return result;

  }
}
