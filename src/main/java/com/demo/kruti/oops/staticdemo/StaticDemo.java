package com.demo.kruti.oops.staticdemo;

//Outer class can be created as static:
public class StaticDemo {
  static {
    // Static initialization block
    System.out.println("Load Masters/DB connections etc.");
  }
  static int value;
  static void print(){
    System.out.println("VALUE :"+value);
  }
  public static void main(String[] str){
    StaticDemo.print();
    StaticDemo.value = 100;
    StaticDemo.print();
    StaticDemo.NestedStaticDemo.print();
  }

  static class NestedStaticDemo {
    static{
      System.out.println("Initialized Nested Class");
    }
    static void print(){
      System.out.println("Print Nested called.");
    }
  }
}
