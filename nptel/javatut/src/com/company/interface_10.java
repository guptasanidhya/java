package com.company;
class i10A {
    protected int i = 1000;
    public void print(){
        System.out.println("I am from A"+ i);
    }
}

interface i10C{
    public static int j = 555;
    void printInterfaceC();
}

interface i10D{
    public static int k =666;
    void printInterfaceD();
}

class i10B extends i10A implements i10C,i10D{
    public int aValue =999;
    public void printInterfaceC(){
        System.out.println("I am from C"+j);
    }
    public void printInterfaceD(){
        System.out.println("I am from D"+k);
    }
    public void printB(){
        super.print();
        printInterfaceC();
        printInterfaceD();
    }

}
public class interface_10 {
    public static void main(String[] args) {
        i10B b = new i10B();
        b.printB();
    }
}
