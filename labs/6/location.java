/**
 * file: location.java 
 * author: William Esposito 
 * course: CMPT 220
 * assignment: Lab 5 
 * due date: April 20 2017 
 * version: 1.3
 * 
 * This file contains a program with answer for designated problem
 */


package location;

public class Location {

  public int row;
  public int column;
  public double maxValue;

  public Location(int row, int column, double maxValue) {
    this.row = row;
    this.column = column;
    this.maxValue = maxValue;
  }

  /**
   * locateLargest
   * 
   * This find the largest element in a 2 dimensional array
   * 
   * Parameters: double[][]a, the array entered by user.
   * 
   * Return value: The location of the largest element.
   */
  
  public static Location locateLargest(double[][] a) {

    int row = 0;
    int column = 0;
    double maxValue = a[row][column];

    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        if (maxValue < a[i][j]) {
          maxValue = a[i][j];
          row = i;
          column = j;
      }
    }
  }

    return new Location(row, column, maxValue);
  }
}
