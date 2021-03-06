/**
 * file: Chap10Problem17.java 
 * author: William Esposito 
 * course: CMPT 220
 * assignment: Lab 5 
 * due date: April 20 2017 
 * version: 1.3
 * 
 * This file contains a program with answer for designated problem
 */

import java.math.BigInteger; //Big integers are within the package 

public class Chap10Problem17 {
  public static void main(String[] args) {

    // This number has a square value very near long.max_value for
    // a decreased ammount of time of execution
    BigInteger number = new BigInteger("3037000300");

    int count = 1;

    System.out.println("The first ten squared numbers that are greater than the Long.Max_value are: ");

    // Store max value in a variable
    BigInteger longValue = new BigInteger(Long.MAX_VALUE + "");

    // Loop until first ten square numbers are greater than max value
    while (count <= 10) {
      BigInteger n_square = number.multiply(number);

      // compare this number to the longValue

      if (n_square.compareTo(longValue) > 0) {
        System.out.println("Square of " + number + " is " + n_square + " . ");
        count++;
      }

      }
    }
  }
