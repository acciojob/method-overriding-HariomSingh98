package com.driver;

public class Main {
  public class A {
  String meth(){
   return "Invoking method from class A";
  }
}
 public class B  extends A{
  String meth(){
   return  "Method is overridden in Extendend class B";
  }
}
  public static void main(String[] args){
  B ob1 =  new B();
  ob1.meth();
  }
}
 
  
