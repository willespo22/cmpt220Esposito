import java.util.Scanner;
import java.io.BufferedInputStream;

/**
   * file: Driver_lab3.java
   * author: William Esposito
   * course: CMPT 220
   * assignment: Lab 3
   * due date: February 24, 2017
   * version: 1.3
   * 
   * This file contains The solution to the Kattis exercise "different distances"
   */

public class Driver_lab3 {
  public static void main(String[] args) {

    // Create a Scanner
    double answer;
    Scanner scanner = new Scanner(System.in);
    while (scanner.nextDouble() != 0) {
      double x1 = scanner.nextDouble();
      double y1 = scanner.nextDouble();
      double x2 = scanner.nextDouble();
      double y2 = scanner.nextDouble();
      double p = scanner.nextDouble();

      // compute
      answer = Math.pow((Math.pow(Math.abs(x1 - x2), p)) + (Math.pow(Math.abs(y1 - y2), p)), (1 / p));

      System.out.println("The answer is " + answer);

    }

  }

}
