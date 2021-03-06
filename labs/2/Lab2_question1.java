
/**
 * file: Lab2_question1.java
 * author: William Esposito
 * course: CMPT 220
 * assignment: Lab 2
 * due date: February 9, 2017
 * version: 1.3
 * 
 * This file contains The solution to the designated exercise 3.4
 */

import java.util.Random; //Random is in the java.util package

public class Lab2_question1 {
  public static void main(String[] args) {
    // Random number generator
    Random rand = new Random();
    int month = rand.nextInt(12) + 1;

    String date = null;

    /**
     * Month
     *
     * This function converts the numberic value of 1 - 12 to the corresponding
     * Month
     * 
     * Date: The month Month: the number that was generated.
     * 
     * Return value: The month, i.e "January"
     */

    if (month == 1)
      date = "January";
    else if (month == 2)
      date = "Febuary";
    else if (month == 3)
      date = "March";
    else if (month == 4)
      date = "April";
    else if (month == 5)
      date = "May";
    else if (month == 6)
      date = "June";
    else if (month == 7)
      date = "July";
    else if (month == 8)
      date = "August";
    else if (month == 9)
      date = "September";
    else if (month == 10)
      date = "October";
    else if (month == 11)
      date = "November";
    else if (month == 12)
      date = "December";

    System.out.println("The month is " + date + ".");

  }

}
