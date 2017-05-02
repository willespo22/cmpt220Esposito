/**
   * file: Chap7Problem9.java
   * author: William Esposito
   * course: CMPT 220
   * assignment: Lab 4
   * due date: March 9, 2017
   * version: 1.3
   * 
   * This file contains The solution to the designated exercise 7.9
   */

import java.util.Scanner; //Scanner is within the java.util package

public class Chap7Problem9 {
  public static void main(String[] args) {

    // Create a Scanner
    Scanner input = new Scanner(System.in);
    double[] numbers = new double[10];
    // Prompt user to enter 10 numbers
    System.out.println("Please enter 10 numbers: ");
    for (int i = 0; i < 10; i++) {
      numbers[i] = input.nextDouble();

    }

    System.out.print(min(numbers));
  }

  /**
   * min
   *
   * This function takes an array of numbers inputed by the user and determines
   * which number has the lowest numeric value.
   * 
   * Parameters: double [] array: The array of numbers input by the user
   * 
   * Return value: The minimum value of the array.
   */

  public static double min(double[] array) {
    double min = array[0];
    for (int i = 1; i < 10; i++)
      if (array[i] < min)
        min = array[i];
    return min;
  }

}
