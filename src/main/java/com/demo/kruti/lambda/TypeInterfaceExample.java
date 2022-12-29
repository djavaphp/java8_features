package com.demo.kruti.lambda;

public class TypeInterfaceExample {

  public static void main(String[] str) {
    StringLength si1 = (String s) -> s.length();
    System.out.println(si1.len("Kruti"));
    StringLength si2 = (s) -> s.length();
    System.out.println(si2.len("Kruti"));
    StringLength si3 = s -> s.length();
    System.out.println(si3.len("Kruti"));
    print(s -> s.length());
  }

  public static void print(StringLength sl) {
    System.out.println(sl.len("Kruti"));
  }

  interface StringLength {
    int len(String str);
  }
}
