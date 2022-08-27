package com.company;
interface anInterface{
    //final public static int a=10; //public static final
    int a = 10;
    void display();
}


class interface_1 implements anInterface {
    public void display() {
        System.out.println("Fine!");
    }

    public static void main(String[] args) {
        interface_1 t = new interface_1();
        t.display();
        System.out.println("The final value of a in myinterface"+a);
    }
}