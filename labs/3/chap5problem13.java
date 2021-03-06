/**
   * file: chap5problem13.java
   * author: William Esposito
   * course: CMPT 220
   * assignment: Lab 3
   * due date: February 24, 2017
   * version: 1.3
   * 
   * This file contains The solution to the designated exercise 5.13
   */

public class chap5problem13 {
  public static void main(String[] args) {

    // declaring variables
    int smallest = 0;
    int n = 1;

    
     // this computes what value for n when it is multiplied by itself 3 times
    // that the value will be less than 12000
    
    while (n * n * n < 12000) {
      n++;
    }

    n = n - 1;
    
    System.out.println("The smallest n such that n cubed is < 12000 is " + n);
  }
}
