package com.demo.kruti.lld.solid;

public class SingleRespPrinciple {
  public static void main(String[] str){
    Pen pen = new Pen("Raymond", "Blue", 20);
    Bill bill = new Bill(pen, 5);
    System.out.println(bill.calculateTotal());
    BillDao billDao = new BillDao(bill);
    billDao.saveBill();
    Printer printer = new Printer(bill);
    printer.printBill();
  }
}
