package com.demo.kruti.lld.solid;

public class BillFile implements BillDaoService{
  Bill bill;

  public BillFile(Bill bill) {
    this.bill = bill;
  }

  @Override
  public void save() {
    System.out.println("Saving into File : "+ this.bill);
  }
}
