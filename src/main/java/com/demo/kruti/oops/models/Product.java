package com.demo.kruti.oops.models;

public class Product {
  //Added access-modifier so that another class need to set it using constructor or setter.
  private final String name;
  private final double price;
  private int quantity;

  public String getName() {
    return name;
  }

  // Constructor
  public Product(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public double getPrice() {
    return price;
  }

  // Setter method for quantity with validation
  // Based on my requirement I will create setter method, In this example I am only allowing to set qty.
  public void setQuantity(int quantity) {
    if (quantity >= 0) {
      this.quantity = quantity;
    } else {
      System.out.println("Quantity cannot be negative.");
    }
  }

  // Method to calculate the total cost for a given quantity
  public double calculateTotalCost(int quantityToBuy) {
    if (quantityToBuy >= 0 && quantityToBuy <= quantity) {
      return price * quantityToBuy;
    } else {
      System.out.println("Invalid quantity to buy.");
      return 0.0;
    }
  }

  public void displayProductInfo() {
    System.out.println("Product Name: " + name);
    System.out.println("Price: " + price);
    System.out.println("Quantity in stock: " + quantity);
  }

  public double calculatePrice() {
    return price;
  }
}
