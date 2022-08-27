package com.company;
//an abstract class with constructor
abstract class Base1 {
    Base1() {
        System.out.println("Base constructor is called");
    }

    abstract void fun();
}

    class Derived1 extends Base1{

        Derived1() {
            super();
            System.out.println("Derived constructor is called");

        }
        void fun(){System.out.println("Derived fun() is called");}

    }

public class inheritance_9 {
    public static void main(String[] args) {
        Derived1 d = new Derived1();
        d.fun();
    }
}
