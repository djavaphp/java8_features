package com.demo.kruti.lld.solid;

/**
 * If calculation logic change or printBill or saveBill logic change than class required changes.
 * Need to convert to Single resp Principle.
 */
public class Bill {

  private Pen pen;
  private int qty;

  public Bill(Pen pen, int qty) {
    this.pen = pen;
    this.qty = qty;
  }

  public int calculateTotal(){
    return pen.price * qty;
  }

//  public void printBill(){
//  }
//  public void saveBill(){
//  }

  @Override
  public String toString() {
    return "Bill{" +
        "pen=" + pen +
        ", qty=" + qty +
        '}';
  }
}
