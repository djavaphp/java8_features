package com.demo.kruti.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaDemo {
  public static void main(String[] str) {
    List<Person> listofPerson = Arrays.asList(new Person("Kruti", "Dave", 32),
        new Person("Kruti", "Dave", 32),
        new Person("Louis", "Clirk", 30),
        new Person("Tom", "Courge", 43),
        new Person("Tim", "Linder", 22),
        new Person("Alex", "Zender", 55),
        new Person("Navish", "Dave", 5));

    System.out.println("Before Java 8");
    //1. Sort by last name
    Collections.sort(listofPerson, new Comparator<Person>() {
      @Override
      public int compare(Person o1, Person o2) {
        return o1.getfName().compareTo(o2.getfName());
      }
    });
    //2. create method that prints all elements in the list
    printJava7(listofPerson);
    System.out.println("---------");
    //3. print last name with C
    printJava7StartsWithC(listofPerson);
    List<Person> listofPerson1 = Arrays.asList(new Person("Kruti", "Dave", 32),
        new Person("Kruti", "Dave", 32),
        new Person("Louis", "Clirk", 30),
        new Person("Tom", "Courge", 43),
        new Person("Tim", "Linder", 22),
        new Person("Alex", "Zender", 55),
        new Person("Navish", "Dave", 5));
    System.out.println("After Java 8");
    //1. Sort by last name
    Collections.sort(listofPerson1, (p1, p2) -> p1.getfName().compareTo(p2.getfName()));
    //2. create method that prints all elements in the list
    listofPerson1.forEach(f -> System.out.println(f));
    System.out.println("---------");
    //3. print last name with C
    listofPerson1.forEach(f -> {
      if (f.getfName().startsWith("K")) {
        System.out.println(f);
      }
    });
  }

  public static void printJava7(List<Person> personList) {
    for (Person p : personList) {
      System.out.println(p);
    }
  }

  public static void printJava7StartsWithC(List<Person> personList) {
    for (Person p : personList) {
      if (p.getlName().startsWith("C")) {
        System.out.println(p);
      }
    }
  }
}
