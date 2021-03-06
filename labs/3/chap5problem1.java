
  /**
   * file: SinglyLinkedList.java
   * author: William Esposito
   * course: CMPT 220
   * assignment: Lab 3
   * due date: February 24, 2017
   * version: 1.3
   * 
   * This file contains The solution to the designated exercise 5.1
   */

import java.util.Scanner; //Scanner is in the java.util package

public class chap5problem1 {
  public static void main(String[] args) {
    // Create a Scanner object
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter integer(s)
    System.out.println("Please enter any number of integers, the input will end when you enter a 0. ");

    int number = input.nextInt();
    int positive = 0;
    int negative = 0;
    int sumofint = 0;
    int total = 0;
    double average = 0;

    do {
      sumofint += number;
      if (number > 0)
        positive++;
      else
        negative++;
      total++;
      number = input.nextInt();
    } while (number != 0);

    average = (double) (sumofint) / total;

    System.out.println("The number of positives is " + positive);
    System.out.println("The number of negatives is " + negative);
    System.out.println("The total is " + sumofint);
    System.out.println("The average is " + average);

  }

}
