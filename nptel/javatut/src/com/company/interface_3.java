package com.company;
interface i3{
    public static final double PI=3.14159265; //ok
    static final double lambda = 0.04; //OK:public implicit
//    int x; //declaration of a instance variable is NOT allowed
    //private static final int p=444;
    //error private protected is not allowed.
    //abstract public static void methodi3(); //static method is not allowed
    //if you declare static only then it should have a body
    void methodi33();//public abstract by default
        }

class A3 implements i3{
    public int a1 = 555;
    public void methodi3(){
        System.out.println("FROM I3 "+ PI);
    }
     public void methodi33(){
         System.out.println("again from i3"+ lambda);
     }
}

public class interface_3{
    public static void main(String[] args) {
        A3 a = new A3();
        a.methodi3();
        a.methodi33();
    }
}
