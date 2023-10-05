package com.demo.kruti.oops.polymorphism;

import com.demo.kruti.oops.models.Book;
import com.demo.kruti.oops.models.Electronics;
import com.demo.kruti.oops.models.Product;

public class PolymorphismDemo {
  public static void main(String[] args) {
    // Create different product types
    Product book =new Book("Java Concepts", 300, 50, "John Doe", 400);
    Product laptop = new Electronics("Laptop", 800.0, 10, "DELL", "LATITUDE");

    // Calculate and display prices with polymorphism - we can override this into Book and Electronics
    System.out.println("Book Price: $" + book.calculatePrice());
    System.out.println("Laptop Price: $" + laptop.calculatePrice());

    // Create different payment methods
    PaymentMethod creditCard = new CreditCardPayment("1234-5678-9012-3456");
    PaymentMethod paypal = new GPayPayment("80000002344");

    // Process payments with polymorphism
    creditCard.processPayment(book.calculatePrice());
    paypal.processPayment(laptop.calculatePrice());
  }
}
