  /**
   * file: Programming_question.java
   * author: William Esposito
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 9, 2017
   * version: 1.3
   * 
   * This file contains The solution to the designated exercise "Programming Question
   */

import java.util.Scanner; // Scanner is in the java.util package

public class Programming_question {
  public static void main(String[] args) {
    // Create Scanner object
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter the midterm exam grade
    System.out.print("Enter the midterm exam grade");
    double midterm = input.nextDouble();

    // Prompt the user to enter the final exam grade
    System.out.print("Enter the final exam grade");
    double finalexam = input.nextDouble();

    // Prompt the user to enter the projects grade
    System.out.print("Enter the Projects grade");
    double project = input.nextDouble();

    // Prompt the user to enter Homework and Labs grade
    System.out.print("Enter Homework and Labs grade");
    double homework = input.nextDouble();

    double finalgrade = (.40 * homework) + (.20 * midterm) + (.20 * finalexam) + (.20 * project);

    if (finalgrade >= 95)
      System.out.println("Your final grade is an A");
    else if (finalgrade <= 95 && finalgrade >= 90)
      System.out.println("Your final grade is an A-");
    else if (finalgrade <= 90 && finalgrade >= 87)
      System.out.println("Your final grade is a B+");
    else if (finalgrade <= 87 && finalgrade >= 83)
      System.out.println("Your final grade is a B");
    else if (finalgrade <= 83 && finalgrade >= 80)
      System.out.println("Your final grade is a B-");
    else if (finalgrade <= 80 && finalgrade >= 77)
      System.out.println("Your final grade is a C+");
    else if (finalgrade <= 77 && finalgrade >= 73)
      System.out.println("Your final grade is a C");
    else if (finalgrade <= 73 && finalgrade >= 70)
      System.out.println("Your final grade is a C-");
    else if (finalgrade <= 70 && finalgrade >= 65)
      System.out.println("Your final grade is a D+");
    else if (finalgrade <= 65 && finalgrade >= 60)
      System.out.println("Your final grade is a D");
    else if (finalgrade <= 60)
      System.out.println("Your final grade is a F");

  }

}
