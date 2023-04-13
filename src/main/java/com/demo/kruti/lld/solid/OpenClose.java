package com.demo.kruti.lld.solid;
/**
 * Open/Close principle - open for extension but closed for modification
 * Using BillDaoService interface we are open for extending but not modifying save()
 */
public class OpenClose {
  public static void main(String[] str){
    Pen pen = new Pen("Raymond", "Blue", 20);
    Bill bill = new Bill(pen, 5);
    BillDaoService billDBService = new BillDB(bill);
    billDBService.save();
    BillDaoService billFileService = new BillFile(bill);
    billFileService.save();
  }
}
