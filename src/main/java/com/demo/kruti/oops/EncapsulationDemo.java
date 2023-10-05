package com.demo.kruti.oops;

public class EncapsulationDemo {
  public static void main(String[] st) {
    Product product = new Product("Dairy milk -Chocolate", 60, 2);
    product.displayProductInfo();
    product.calculateTotalCost(2);
  }
}

class Product {
  //Added access-modifier so that another class need to set it using constructor or setter.
  private final String name;
  private final double price;
  private int quantity;

  // Constructor
  public Product(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  // Getter method for name
  public String getName() {
    return name;
  }

  // Getter method for price
  public double getPrice() {
    return price;
  }

  // Getter method for quantity
  public int getQuantity() {
    return quantity;
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
}
