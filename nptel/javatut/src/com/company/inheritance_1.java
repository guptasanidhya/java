package com.company;
/*A simple example of inheritance. */
//create a super class.
class A {
    int i,j;
    void showij(){
        System.out.println("i and j :"+i+" "+j);
    }
}
//create a sub class by extending class A.
class B extends A{
    int k;
    void showk(){
        System.out.println("k:"+ k);
    }
    void sum() {
        System.out.println("i+j+k:"+(i+j+k));
    }
}

public class inheritance_1 {
    public static void main(String args[]){
        //The superclass may be used ny itself
        A superob = new A();
        B subob = new B();
        superob.i=10;
        superob.j=20;
        System.out.println("contents of superob:" );
        superob.showij();
        System.out.println();
        // the subclass has access to all public mumbers
        subob.i=7;
        subob.j=8;
        subob.k=9;
        System.out.println("Contents of subob:");
        subob.showij();
        subob.showk();
        System.out.println();
        System.out.println("Sum of i,j and k in subob:");
        subob.sum();
    }
}
