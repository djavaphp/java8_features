package com.demo.kruti.oops.polymorphism;

public class CreditCardPayment implements PaymentMethod {
  private final String cardNumber;

  public CreditCardPayment(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  @Override
  public void processPayment(double amount) {
    // we can validate card and processing of payment logic
    System.out.println("Paid Rs " + amount);
  }
}
