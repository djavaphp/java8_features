# java8_features
Java 8 features

Java 8 -Lambda Features

1. Why? 
   1. Enable Functional Programing - Java used to support Object oriented Programing
      1. Why Functional when Object-Oriented 
         Readable code, manageable code in certain situation along with Object oriented programing
      2. Problems in OOP
         Object is heart of and OOP
         All code which we write is associated with class and object
         Things as noun , Action as verb
         
   2. Readable Code - eliminate the boilerplate code
   3. Easier to use API and Lib
   4. Parallel processing
   
2. Lambda expression
   1. Pass the action and execute the action
   2. Lambda are just functions which does not belong to any class or object
   3. They are not method of any class
   4. Functions as value
      1. Piece of code which assigned to a variable to become a value
   5. No need to identifier, name , return type (Java compiler will understand from code)
3. Example: 
   1. Empty param
      helloWorldFun = () System.out.println("Hello World");
   2. With Param 
      intFun = (int a) -> a*2; 
      addFun = (int a , int b) -> a + b; [you can skip the return when only one line to return]
4. Lambda as interface
   1. No need to create new type to support lambda
   2. Java uses interface to create lambda
   3. Only one method in interface to use for lambda
   4. LambdaInterface lambdaInterface = () ->  System.out.println("Hello World Lambda!");
      1. It will check on interface to get the return type of lambdaInterface
      2. It will check method argument with the main LambdaInterface and compiler will work
5. Lambdas vs Interface Implementation
   When we have single method into the interface and uses for implementing with another class of java.
   how it will be differed from lambda? 
         1. lambda expression is behaving line an implementation of interface using instance of class
         2. Implementing interface as Function not as class
6. Type Interface
   1. Java compiler identify the type of lambda from functional interface
7. Functional Interface
   1. Only One abstract method 
   2. Can have default and static methods
   3. If added another abstract method than it won't consider as functional interface
   4. Add @FunctionalInterface to be used as library 
8. More on Lambda
   1. java.util.Functions (https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html)
      1. Predicate interface
         1. have method as test which returns boolean(conditional interface)
      2. Supplier interface
   