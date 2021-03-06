/**
   * file: Chap7Problem20.java
   * author: William Esposito
   * course: CMPT 220
   * assignment: Lab 4
   * due date: March 9, 2017
   * version: 1.3
   * 
   * This file contains The solution to the designated exercise 7.20
   */

import java.util.Scanner; //Scanner is within the java.util package

public class Chap7Problem20 {
  public static void main(String[] args) {

    // Create a Scanner
    Scanner input = new Scanner(System.in);

    double[] numbers = new double[10];
    // Prompt user to enter 10 numbers
    System.out.println("Please enter 10 numbers: ");
    for (int i = 0; i < 10; i++) {
      numbers[i] = input.nextDouble();
    }
    numbers = bubbleSort(numbers);
    for (int i = 0; i < 10; i++) {
      System.out.print(numbers[i] + " ");
    }

  }

  /**
   * bubbleSort
   *
   * This function sorts an array of numbers inputed by the user by comparing
   * neighboring values and swapping them depending on which one is greater than
   * the other.
   * 
   * Parameters: double [] numbers: the array of 10 numbers inputed by user.
   * 
   * Return value: The set of 10 numbers sorted accordingly.
   */

  public static double[] bubbleSort(double[] numbers) {
    double t;
    boolean switched = true;
    int end = numbers.length;
    while (end > 0 && switched == true) {
      for (int i = 1; i < end; i++) {

        if (numbers[i] < numbers[i - 1]) {
          t = numbers[i];
          numbers[i] = numbers[i - 1];
          numbers[i - 1] = t;
          switched = true;
        }
      }
      end = end - 1;
    }

    return numbers;
  }
}
