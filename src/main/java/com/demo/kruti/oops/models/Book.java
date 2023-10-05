package com.demo.kruti.oops.models;

//Book class is a subclass of Product
public class Book extends Product {
  private String author;
  private int pageCount;

  public Book(String name, double price, int quantity, String author, int pageCount) {
    super(name, price, quantity); // Call the constructor of the superclass
    this.author = author;
    this.pageCount = pageCount;
  }

  @Override
  public void displayProductInfo() {
    super.displayProductInfo(); // Call the superclass method
    System.out.println("Author: " + author);
    System.out.println("Page Count: " + pageCount);
  }
}
