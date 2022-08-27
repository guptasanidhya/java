package com.company;
//an abstract class without any abstract method

abstract class Base2{
    void fun(){System.out.println("Base fun() is called");}
}

class Derived2 extends Base2{
    Derived2(){System.out.println("derived constructor is called ");}
    void fun(){

        System.out.println("Derived fun() is called");
        super.fun();}
}
public class inheritance_10 {
    public static void main(String[] args) {
        Derived2 d = new Derived2();
        d.fun();

    }
}
