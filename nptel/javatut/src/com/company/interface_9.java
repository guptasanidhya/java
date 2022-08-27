package com.company;
//multiple inheritance using 1 class 1 interface
class i9{
    protected int j=1000;
    void print(){
        System.out.println("I am from A"+ j);
    }
}

interface i99{
    public static int i = 555;
    void printInterface();
}

class i999 extends i9 implements i99{
    public int aValue =999;
    public void printInterface(){
        System.out.println("I am from i99"+i);
    }
    public void printB(){
        super.print();
        printInterface();
    }
}


public class interface_9 {
    public static void main(String[] args) {
        i999 b = new i999();
        b.printB();
    }

}
