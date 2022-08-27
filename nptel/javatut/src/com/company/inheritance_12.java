package com.company;
//final class inheritance
//final class cannot be inherited
//final method cannot be overridden
//final varibale value can't be changed
abstract class Base12 {
    final void fun(){
        System.out.print("final fun() is called ");
    }
}

class Derived12 extends Base12{
    Derived12() {
        System.out.println("Derived conctructor is called");
    }
//    void fun(){
//            System.out.println("Derived function is called");
//
//    }
}

public class inheritance_12 {
    public static void main(String[] args) {
        Base12  b= new Derived12();
        b.fun();
    }
}
