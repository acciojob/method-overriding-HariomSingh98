package com.driver;

public class Main {
  public static  class A {
   public String meth(){
   return "Invoking method from class A";
  }
}
 public static class B  extends A{
     @Override
   public String meth(){
    return  "Method is overridden in Extendend class B";
  }
}
  public static void main(String[] args){
  B ob1 =  new B();
  ob1.meth();
  B ob2 = new B();
   ob2.meth();
  }
}
 
  
