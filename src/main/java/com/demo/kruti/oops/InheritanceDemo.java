package com.demo.kruti.oops;

import com.demo.kruti.oops.models.Book;
import com.demo.kruti.oops.models.Electronics;

public class InheritanceDemo {
  public static void main(String[] args) {
    Book book = new Book("Java Concepts", 300, 50, "John Doe", 400);
    Electronics laptop = new Electronics("Laptop", 800.0, 10, "DELL", "LATITUDE");

    System.out.println("Book Information:");
    book.displayProductInfo();
    System.out.println("\n");
    System.out.println("Electronics Information:");
    laptop.displayProductInfo();
  }
}
