package com.company;

class A5{
    int i;
}
class B5 extends A5{
    int i; //this i hides the i in A
    B5(int a,int b){
       super.i=a; //i in A
       i=b;//i in B
    }

    void show(){
        System.out.println("i in superclass:"+super.i);
        System.out.println("i in subclass:"+i);
    }

}
public class inheritance_5 {
    public static void main(String[] args) {
        B5 subob = new B5(1,2);
        subob.show();
    }
}
