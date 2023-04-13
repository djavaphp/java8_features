package com.demo.kruti.lld.solid;


public class Pen {
  String name;
  String color;
  int price;

  public Pen(String name, String color, int price) {
    this.name = name;
    this.color = color;
    this.price = price;
  }

  @Override
  public String toString() {
    return "Pen{" +
        "name='" + name + '\'' +
        ", color='" + color + '\'' +
        ", price=" + price +
        '}';
  }
}
