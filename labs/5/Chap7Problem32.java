
/**
 * file: Chap7Problem32.java 
 * author: William Esposito 
 * course: CMPT 220 
 * assignment: Lab 5 
 * due date: April 3 2017 
 * version: 1.3
 * 
 * This file contains a program with answer for designated problem
 */

import java.util.Scanner; // Scanner is within the Java.util package

public class Chap7Problem32 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // prompt user to enter integers
    System.out.println("Please enter a list of integers");
    int numbers = input.nextInt();

    // Pass integers into an array
    int[] integers = new int[numbers];

    for (int i = 0; i < integers.length; i++)
      integers[i] = input.nextInt();

    partition(integers);

    // Displaying partition list
    System.out.print("After partition the list is. ");
    for (int i = 0; i < integers.length; i++) {
      System.out.print(integers[i] + " ");

    }
  }

  /**
   * partition
   * 
   * This partitions the array after the first element
   * 
   * Parameters: int [] list, which is the list of integers entered by the user
   * 
   * Return value: The partitioned array
   */

  public static int[] partition(int[] list) {
    int partition = list[0];
    int partitionLocation = 0;
    int high = list.length - 1;

    while (partitionLocation < high) {
      // This will swap partition and the next item
      if (partition > list[partitionLocation + 1]) {
        list[partitionLocation] = list[partitionLocation + 1];
        list[partitionLocation + 1] = partition;
        partitionLocation++;
      } else {
        // If else, the item will be moved to end of list
        int temp = list[high];
        list[high] = list[partitionLocation + 1];
        list[partitionLocation + 1] = temp;
        high--;
      }
    }

    return list;

  }
}
