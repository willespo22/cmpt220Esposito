/**
 * file: Chap10Problem10.java 
 * author: William Esposito 
 * course: CMPT 220
 * assignment: Lab 5 
 * due date: April 20 2017 
 * version: 1.3
 * 
 * This file contains a program with answer for designated problem
 */

package Chap10Problem10;

public class Queue {

  // array to store integers
  private int[] elements;

  // For storing number of elements in queue

  private int size;

  // Default constructor will have queue with 8

  public Queue() {

    // creating an array w/ default
    elements = new int[8];

  }

  // Adding v to the queue

  public void enqueue(int v) {
    // Here, if the number of elements exceeds the size of the que
    // the queue size will double

    if (size >= elements.length) {
      int[] tempArray = new int[elements.length * 2];
      System.arraycopy(elements, 0, tempArray, 0, elements.length);
      elements = tempArray;

    }

    // New elements stored into queue
    elements[size++] = v;

  }

  public int dequeue() {
    // retrieving first element
    int v = elements[0];

    // create a temp array w/ size of elements

    int[] tempArray = new int[elements.length];

    // From the first position copy contents of elements into temp array

    System.arraycopy(elements, 1, tempArray, 0, size);

    // Assigning temp array to elements array

    elements = tempArray;

    // Make size of queue decrease

    size--;

    return v;

  }

  // If queue is empty, this method will return true.

  public boolean empty() {

    if (size == 0) {
      return true;
    }
    return false;
  }
}
