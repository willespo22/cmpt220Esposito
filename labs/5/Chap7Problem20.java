
/**
 * file: Chap7Problem20.java 
 * author: William Esposito 
 * course: CMPT 220 
 * assignment: Lab 5 
 * due date: April 3 2017 
 * version: 1.3
 * 
 * This file contains a program with answer for designated problem
 */

import java.util.Scanner; // Scanner is within the Java.util package

public class Chap7Problem20 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double[] numbers = new double[10];

    // Prompt user to enter 10 numbers
    System.out.println("Please enter ten numbers.");

    // Pass numbers into array
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = input.nextDouble();
    }

    // Displaying the sorted numbers
    selectionSort(numbers);
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
    }

  }

  /**
   * selectionSort
   *
   * This function sorts an array of doubles by finding the largest number and
   * swapping it with the last.
   * 
   * Parameters: double [] list, the array of double values entered by user.
   * 
   * Return value: The sorted array.
   */
 
  public static void selectionSort(double[] list) {
    for (int i = 0; i < list.length - 1; i++) {
      // Finding the Maximum in the list[i..list.length-1]
      double currentMax = list[i];
      int currentMaxIndex = i;

      for (int j = i + 1; j < list.length; j++) {
        if (currentMax > list[j]) {
          currentMax = list[j];
          currentMaxIndex = j;

        }
      }

      // Swap list [i] with list [currentMaxIndex] if necessary
      if (currentMaxIndex != i) {
        list[currentMaxIndex] = list[i];
        list[i] = currentMax;
      }
    }
  }
}
