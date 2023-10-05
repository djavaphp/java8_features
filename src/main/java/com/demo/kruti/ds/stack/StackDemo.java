package com.demo.kruti.ds.stack;

import java.util.Stack;

/**
 * LIFO - LAst In First Out
 * Added on top and removed from top
 *
 */
public class StackDemo {
  public static void main(String aar[]){
    Stack<String> animals = new Stack();
    // Add elements to Stack
    animals.push("Dog");
    animals.push("Horse");
    animals.push("Cat");


    System.out.println("Stack: " + animals);
    //Stack: [Dog, Horse, Cat]

    // Remove element stacks
    String element = animals.pop();
    System.out.println("Removed Element: " + element);
    System.out.println("Stack: " + animals);
    //Stack: [Dog, Horse]

    // Access element from the top
    String element1 = animals.peek();
    System.out.println("Element at top: " + element1);

    // Search an element
    int position = animals.search("Horse");
    System.out.println("Position of Horse: " + position);

    // Check if stack is empty
    boolean result = animals.empty();
    System.out.println("Is the stack empty? " + result);
  }
}
