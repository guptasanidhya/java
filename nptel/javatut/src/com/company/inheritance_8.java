package com.company;
//simple abstract class example
//An abstract class is a template definition of methods and variables of a class (category of objects)
// that contains one or more abstracted methods. ...
// Declaring a class as abstract means that it cannot be directly instantiated,
// which means that an object cannot be created from it.


abstract class Base{
    abstract void fun();
}

class Derived extends Base{
    void fun(){ System.out.println("Derived fun() is called");}
}
public class inheritance_8 {
    public static void main(String[] args) {
        Base b = new Derived();
        b.fun();
    }
}
