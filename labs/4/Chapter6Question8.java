/**
   * file: Chapter6Question8.java
   * author: William Esposito
   * course: CMPT 220
   * assignment: Lab 4
   * due date: March 9, 2017
   * version: 1.3
   * 
   * This file contains The solution to the designated exercise 6.8
   */


import java.util.Scanner; //Scanner is within the java.util package

public class Chapter6Question8 {
  public static void main(String[] args) {

    // Declaring variables

    double[] celsius = { 40.0, 39.0, 32.0, 31.0 };
    double[] fahrenheit = { 120.0, 110.0, 40.0, 30.0 };
    // Declaring the strings for the Table
    String header1 = "Celsius";
    String header2 = "Fahrenheit";

    // Setting up the display of the table
    System.out.printf("%-10s%-10s | %15s%12s \n", header1, header2, header2, header1);
    System.out.println("------------------------------------");
    for (int i = 0; i < 4; i++) {
      System.out.println(celsius[i] + "\t" + celsiusToFahrenheit(celsius[i]) + "\t" + fahrenheit[0] + "\t"
          + fahrenheitToCelsius(fahrenheit[0]));

    }
  }

  /** Convert from Celsius to Fahrenheit */
  public static double celsiusToFahrenheit(double celsius) {
    double f = (9.0 / 5) * celsius + 32;
    return f;
  }

  /** Convert from Fahrenheit to Celsius */
  public static double fahrenheitToCelsius(double fahrenheit) {
    double c = (5.0 / 9) * (fahrenheit - 32);
    return c;
  }
}
