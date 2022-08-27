
package com.company;
//Interface, in many way, similar to as class;
//however no object can be instantiated from an interface
interface C{
    public static int i = 555;
    void printInterface();
}
//Attempting to create an oject of interface
public class interface_2 {
    public static void main(String[] args) {
//        C c = new C(); //ERROR: Object cannot be instantiated
        C c2;//OK: declaration of objet is possible
        C c3[] = new C[3];//THis is also OK: declaration of
        //array of objects for an interface is permitted
    }
}
