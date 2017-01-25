//William Esposito
//Professor Rivas
//CMPT220L Lab 1

import java.util.Scanner; //Scanner is in the java.util package

public class Chapter2Question5 {
  public static void main(String[] args) {
    // Create Scanner object
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter the subtotal and a gratuity rate
    System.out.print("Enter a subtotal and gratuity rate, the numbers should be seperated by a space.: ");
    double subtotal = input.nextDouble();
    double gratuityRate = input.nextDouble();

    // Calculate gratuity and total
    double gratuity = subtotal * (gratuityRate / 100);
    double total = subtotal + gratuity;

    // Show results
    System.out.println("The gratuity is $" + gratuity + " and total is $" + total);

  }
}
