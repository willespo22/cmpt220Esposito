/**
 * file: Chap9Problem1.java 
 * author: William Esposito 
 * course: CMPT 220
 * assignment: Lab 5 
 * due date: April 20 2017 
 * version: 1.3
 * 
 * This file contains a program with answer for designated problem
 */

public class Chap9Problem1 {
  /** Main method */
  public static void main(String[] args) {
    // Create a rectangle with width of 3.5 and height of 35.9
    Simplerectangle rectangle1 = new Simplerectangle(3.5, 35.9);
    System.out.println("The area of the rectangle with a width of " + rectangle1.width + " and a height of "
        + rectangle1.height + " is " + rectangle1.getArea() + "The perimiter is. " + rectangle1.getPerimeter());

    // Create a rectangle with width of 4 and height of 40
    Simplerectangle rectangle2 = new Simplerectangle(4, 40);
    System.out.println("The area of the rectangle with a width of " + rectangle2.width + " and a height of "
        + rectangle2.height + " is " + rectangle2.getArea() + " The perimiter is. " + rectangle2.getPerimeter());

  }
}

// Define the rectangle class with two constructors
class Simplerectangle {
  double width = 1;
  double height = 1;

  /** Construct a rectangle with radius 1 */
  Simplerectangle() {
    width = 1;
    height = 1;
  }

  /** Construct a rectangle with a specified height and width */
  Simplerectangle(double newWidth, double newHeight) {
    width = newWidth;
    height = newHeight;
  }

  /** Return the area of this rectangle */
  double getArea() {
    return width * height;
  }

  /** Return the perimeter of this rectangle */
  double getPerimeter() {
    return 2 * width * height;
  }
}
