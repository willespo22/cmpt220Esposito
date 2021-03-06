
/**
 * file: Chap7Problem31.java 
 * author: William Esposito 
 * course: CMPT 220 
 * assignment: Lab 5 
 * due date: April 3 2017 
 * version: 1.3
 * 
 * This file contains a program with answer for designated problem
 */

import java.util.Scanner; // Scanner is within the Java.util package

public class Chap7Problem31 {
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

    // Display results
    int[] answer = (merge(vFirst, vSecond));
    for (int i = 0; i < answer.length; i++) {
      System.out.print(answer[i] + " ");
    }
  }

  /**
   * merge
   *
   * This function merges two arrays
   * 
   * Parameters: double [] vFirst, the array of elements entered by user above
   * double [] vSecond, array of elements entered by user above
   * 
   * Return value: The two arrays merged
   */

  public static int[] merge(double[] vFirst, double[] vSecond) {
    int[] answer = new int[vFirst.length + vSecond.length];
    int i;
    for (i = 0; i < vFirst.length; i++)
      answer[i] = (int) vFirst[i];

    for (int j = 0; j < vSecond.length; j++)
      answer[i++] = (int) vSecond[j];

    return answer;

  }
}
