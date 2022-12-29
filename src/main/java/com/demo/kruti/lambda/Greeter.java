package com.demo.kruti.lambda;

interface LambdaInterface {
  void show();
}

interface AddInteger {
  int add(int a, int b);
}

public class Greeter {

  public static void main(String[] ar) {
    Greeter greeter = new Greeter();
    greeter.sayHello();

    LambdaInterface lambdaInterface = () -> System.out.println("Hello World Lambda!");
    lambdaInterface.show();
    AddInteger addInteger = (int a, int b) -> a + b;
    StringInterface stringInterface = () -> System.out.println("Hello from another interface");
    stringInterface.print();
    //Anonymous inner class
    StringInterface stringInterface1 = new StringInterface() {
      @Override
      public void print() {
        System.out.println("Hello from Anonymous interface");
      }
    };
    stringInterface1.print();

  }

  public void sayHello() {
    System.out.println("Hello World!");
  }
}
