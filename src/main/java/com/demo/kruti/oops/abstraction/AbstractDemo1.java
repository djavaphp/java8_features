package com.demo.kruti.oops.abstraction;

/**
 * Can we instantiate a class which does not have even a single abstract methods but declared as abstract?
 * ans : It will not allow to create even dont have any abstract method. Check Main.java in same package
 */
public abstract class AbstractDemo1 {

  private final String message;

  public AbstractDemo1(String message) {
    this.message = message;
  }

  private String print() {
    return message;
  }
}

