package com.company;
import java.lang.*;
class calculator{
    double i;
    double x=Math.sqrt(i);
}

public class Echo1
{
    public static void main(String[] args) {
    calculator a =new calculator();
    a.i=Integer.parseInt(args[0]);
    System.out.println("Square Root of "+a.i+"is"+a.x);
    }
}
