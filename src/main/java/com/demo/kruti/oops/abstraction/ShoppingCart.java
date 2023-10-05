package com.demo.kruti.oops.abstraction;

import com.demo.kruti.oops.models.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;

public abstract class ShoppingCart {
  protected List<Product> items; // Store items in the cart

  public ShoppingCart() {
    items = new ArrayList<>();
  }

  // Abstract method to add a product to the cart
  public abstract void addItem(Product product);

  // Abstract method to remove a product from the cart
  public abstract void removeItem(Product product);

  // Abstract method to calculate the total price of items in the cart
  public double calculateTotalPrice() {
    return items.stream().flatMapToDouble(product -> DoubleStream.of(product.getPrice())).sum();
  }

  // Abstract method to display the cart contents
  public void displayCart() {
    for (Product item : items) {
      System.out.println(item.getName() + " - Rs" + item.getPrice());
    }
  }

}

class MemberShoppingCart extends ShoppingCart {
  @Override
  public void addItem(Product product) {
    items.add(product);
    System.out.println("Added for member " + product.getName());
  }

  @Override
  public void removeItem(Product product) {
    items.remove(product);
    System.out.println("Removed for member" + product.getName());
  }

  @Override
  public double calculateTotalPrice() {
    return super.calculateTotalPrice();
  }

  @Override
  public void displayCart() {
    System.out.println("Cart contents for Member user:");
    super.displayCart();
  }
}

class GuestShoppingCart extends ShoppingCart {
  @Override
  public void addItem(Product product) {
    items.add(product);
    System.out.println("Added for Guest " + product.getName());
  }

  @Override
  public void removeItem(Product product) {
    items.remove(product);
    System.out.println("Removed for Guest " + product.getName());
  }

  @Override
  public double calculateTotalPrice() {
    return super.calculateTotalPrice();
  }

  @Override
  public void displayCart() {
    System.out.println("Cart contents for Guest user:");
    super.displayCart();
  }
}
