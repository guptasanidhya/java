package com.company;
//an interface method  cannot be final
interface i6{
    public static int i = 555;
//    public final static void printInterface();//error
}


public class interface_6 implements i6{
    public static int j =111;
    void printInterface(){
        System.out.print("Geek!");}
    public static void main(String[] args) {


    }
}
