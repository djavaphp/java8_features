package com.demo.kruti.lld.solid;

public class Printer {
  Bill bill;

  public Printer() {
  }

  public Printer(Bill bill) {
    this.bill = bill;
  }

  public void printBill() {
    System.out.println("Printing: "+ this.bill);
    //print bill
  }
}
