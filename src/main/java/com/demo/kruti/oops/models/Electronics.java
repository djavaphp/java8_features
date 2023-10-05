package com.demo.kruti.oops.models;

// The Electronics class is another subclass of Product
public class Electronics extends Product {
  private final String brand;
  private final String model;

  public Electronics(String name, double price, int quantity, String brand, String model) {
    super(name, price, quantity); // Call the constructor of the superclass
    this.brand = brand;
    this.model = model;
  }

  // Not adding any Getter and setter methods as of now as I don't it now
  @Override
  public void displayProductInfo() {
    super.displayProductInfo(); // Call the superclass method
    System.out.println("Brand: " + brand);
    System.out.println("Model: " + model);
  }
}
