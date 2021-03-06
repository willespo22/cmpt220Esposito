
/**
 * file: Lab2_question2.java
 * author: William Esposito
 * course: CMPT 220
 * assignment: Lab 2
 * due date: February 9, 2017
 * version: 1.3
 * 
 * This file contains The solution to the designated exercise 3.8
 */

import java.util.Scanner; //Scanner is in the java.util package

public class Lab2_question2 {
  public static void main(String[] args) {
    // Create a Scanner object
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter an integer
    System.out.print("Enter an integer.");
    double int1 = input.nextDouble();

    // Prompt the user to enter another integer
    System.out.print("Enter another integer.");
    double int2 = input.nextDouble();

    // Prompt the user to enter another integer
    System.out.print("Enter one more integer.");
    double int3 = input.nextDouble();

    /**
     * if statement
     *
     * This function compares certain integer values to other integer values
     * 
     * Parameters: int l, int 2, and int 3
     * 
     * Return value: The integers spit out in a certain order
     */

    if (int1 > int2 && int1 > int3 && int2 > int3)
      System.out.println(int1 + int2 + int3);
    else if (int2 > int1 && int2 > int3 && int1 > int3)
      System.out.println(int2 + int1 + int3);
    else if (int3 > int1 && int3 > int2 && int1 > int2)
      System.out.println(int3 + int1 + int2);

  }
}
