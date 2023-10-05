package com.demo.kruti.oops.polymorphism;

public class GPayPayment implements PaymentMethod {
  private final String mobile;

  public GPayPayment(String mobile) {
    this.mobile = mobile;
  }

  @Override
  public void processPayment(double amount) {
    // Here I will implement Gpay logic based on mobile and verified with OTP etc
    System.out.println(
        "Paid Rs" + amount + " using Gpay account associated with mobile no: " + mobile);
  }
}
