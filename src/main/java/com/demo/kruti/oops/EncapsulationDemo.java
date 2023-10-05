package com.demo.kruti.oops;

import com.demo.kruti.oops.models.Product;

public class EncapsulationDemo {
  public static void main(String[] st) {
    Product product = new Product("Dairy milk -Chocolate", 60, 2);
    product.displayProductInfo();
    product.calculateTotalCost(2);
  }
}
