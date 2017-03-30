
/**
 * file: Driver_prj1.java
 * author: William Esposito
 * course: CMPT 220
 * assignment: Project 1
 * due date: March 30 2017
 * version: 1.3
 * 
 * This file contains a program for convuluting matrices.
 */

import java.util.Scanner;

public class Driver_prj1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // prompt user to enter size of first vector
    System.out.println("Please enter size of the first vector.");
    int vectorOne = input.nextInt();

    // prompt user to enter size of second vector
    System.out.println("Please enter size of the second vector.");
    int vectorTwo = input.nextInt();

    // prompt user to enter elements of first vector, to be stored in array.
    System.out.println("Please enter the elements of the first vector");
    double[] vFirst = new double[vectorOne];
    for (int i = 0; i < vectorOne; i++) {
      vFirst[i] = input.nextDouble();
    }

    // prompt user to enter elements of second vector, to be stored in array.
    System.out.println("Please enter the elements of the second vector");
    double[] vSecond = new double[vectorTwo];
    for (int i = 0; i < vectorTwo; i++) {
      vSecond[i] = input.nextDouble();
    }

    // This is printing the final result
    int[] vResult = convolveVectors(vFirst, vSecond);
    System.out.print("[");
    for (int i = 0; i < vResult.length; i++) {
      System.out.print(Math.round(vResult[i]) + " ");
    }
    System.out.print("]");
  }

  /**
   * convolveVectors
   *
   * This function performs the convulution of the two matrices.
   * 
   * Parameters: double [] vFirst, the array of elements entered by user above
   * double [] vSecond, array of elements entered by user above
   * 
   * Return value: The convuluted matrix.
   */

  public static int[] convolveVectors(double[] vFirst, double[] vSecond) {
    int resultLength = (vFirst.length + vSecond.length) - 1;
    int[] vResult = new int[resultLength];
    for (int idx = 0; idx < resultLength; idx++) {
      for (int shift = 0; shift < 3; shift++)
        if (idx - shift < 0 || idx - shift > 2)
          vResult[idx] += 0;
        else
          vResult[idx] += vFirst[idx - shift] * vSecond[shift];
    }
    return vResult;
  }

}
