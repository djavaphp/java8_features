package com.demo.kruti.lld.solid;

public class BillDB implements BillDaoService{

  Bill bill;

  public BillDB(Bill bill) {
    this.bill = bill;
  }

  @Override
  public void save() {
    System.out.println("Saving into DB : "+ this.bill);
    //save logic here.
  }
}
