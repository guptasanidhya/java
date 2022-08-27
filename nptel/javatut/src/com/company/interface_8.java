package com.company;
//multiple inheritance
interface i8{
    int i=123;
    void printi8();
}
interface i88{
    public static int j=555;
    void printi88();
}

class i888 implements i8,i88{
    public int aValue = 999;
    public void printi8(){
        System.out.println("I am from i8 "+i);
    }

    public void printi88(){
        System.out.println("I am from i88 "+j);
    }

    public void printi888(){
        System.out.println("I am from i888 "+(aValue=i+j));
    }
}
public class interface_8 {
    public static void main(String[] args) {
        i888 a = new i888();
        a.printi888();
        a.printi88();
        a.printi8();
    }
}

