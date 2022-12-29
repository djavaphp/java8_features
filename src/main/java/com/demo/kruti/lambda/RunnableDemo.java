package com.demo.kruti.lambda;

public class RunnableDemo {
  public static void main(String[] str) {
    Thread t1 = new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("Thread 1");
      }
    });
    t1.run();

    Thread t2 = new Thread(() -> System.out.println("Thread 2"));
    t2.run();
  }
}
