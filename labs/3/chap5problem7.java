/**
   * file: chap5problem7.java
   * author: William Esposito
   * course: CMPT 220
   * assignment: Lab 3
   * due date: February 24, 2017
   * version: 1.3
   * 
   * This file contains The solution to the designated exercise 5.7
   */

public class chap5problem7 {
  public static void main(String[] args) {

    // establish tuition cost
    double tuition = 10000;

    // establish increase rate
    double increaseRate = 0.05;

    for (int i = 0; i < 10; i++) {
      tuition = tuition * 1.05;

    }

    int total = 0;

    for (int i = 0; i < 4; i++) {
      tuition = tuition * 1.05;
      total += tuition;
    }

    System.out.println("The tuition after 10 years will be " + tuition);
    System.out.println("The total cost of four years' worth of tuition after the tenth year will be " + total);
  }
}
