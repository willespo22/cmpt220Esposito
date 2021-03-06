/**
   * file: chap5problem12.java
   * author: William Esposito
   * course: CMPT 220
   * assignment: Lab 3
   * due date: February 24, 2017
   * version: 1.3
   * 
   * This file contains The solution to the designated exercise 5.12
   */

public class chap5problem12 {
  public static void main(String[] args) {

    // declaring variables
    int smallest = 0;
    int n = 1;

    while (n * n <= 12000) {
        n++;
    }

    System.out.println("The smallest n such that n multiplied by n is > 12000 is " + n);
  }
}
