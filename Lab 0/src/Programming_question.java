//William Esposito
//Professor Rivas
//CMPT220L Lab 1

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

    System.out.println("Your final grade is " + finalgrade);

  }

}
