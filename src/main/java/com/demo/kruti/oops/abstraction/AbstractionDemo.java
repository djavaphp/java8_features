package com.demo.kruti.oops.abstraction;

import com.demo.kruti.oops.models.Product;

public class AbstractionDemo {
  public static void main(String[] args) {
    // Create a shopping cart for a registered user
    ShoppingCart memberUserCart = new MemberShoppingCart();

    // Create a shopping cart for a guest user
    ShoppingCart guestUserCart = new GuestShoppingCart();

    // Add products to the carts
    Product product1 = new Product("Product A", 29.99, 1);
    Product product2 = new Product("Product B", 19.99, 1);

    memberUserCart.addItem(product1);
    memberUserCart.addItem(product2);

    guestUserCart.addItem(product1);

    // Display cart contents and calculate total prices
    memberUserCart.displayCart();
    double memberUserTotalPrice = memberUserCart.calculateTotalPrice();
    System.out.println("Total Price for Member User: Rs" + memberUserTotalPrice);

    guestUserCart.displayCart();
    double guestUserTotalPrice = guestUserCart.calculateTotalPrice();
    System.out.println("Total Price for Guest User: Rs" + guestUserTotalPrice);
  }
}
