  /**
   * file: Lab2_Question7
   * author: William Esposito
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 9, 2017
   * version: 1.3
   * 
   * This file contains The solution to the designated exercise 4.8
   */
import java.util.*; //Scanner is in the java.util package

public class Lab2_Question7 {
  public static void main(String[] args) {
   
    // Create a Scanner object
    Scanner input = new Scanner(System.in);
    
 // Prompt the user to enter an integer between 0 and 127
    System.out.print("Enter an integer between 0 and 127: ");
    int number = input.nextInt();
    
    char c = (char)number;
    System.out.print(c);
  }

}
