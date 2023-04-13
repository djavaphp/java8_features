package com.demo.kruti.lld.solid;

public class BillDao {
  private  Bill bill;

  public BillDao() {
  }

  public BillDao(Bill bill) {
    this.bill = bill;
  }

  public void saveBill() {
    System.out.println("Saving : "+ this.bill);
    //save logic here.
  }
}
