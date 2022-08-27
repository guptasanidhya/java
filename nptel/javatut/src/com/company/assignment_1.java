package com.company;
import java.util.Scanner;
class Shape1{
    double length, breadth;
    Shape1(double l, double b){ //Constructor to initialize a Shape1 object
        length = l;
        breadth= b;
    }
    Shape1(double len){    //Constructor to initialize another Shape1 object
        length = breadth = len;
    }
    double calculate(){// To calculate the area of a Shape1 object
        return length * breadth ;
    }
}
public class assignment_1 extends Shape1{
    double height;
    assignment_1(double len,double h){
        super(len);
        height=h;
    }
    assignment_1(double l,double b,double h){
        super(l,b);
        height = h;
    }
    double calculate(){
        return length*breadth*height;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);//Create an object to read                                                               
        //input
        double l=sc.nextDouble(); //Read length
        double b=sc.nextDouble(); //Read breadth	
        double h=sc.nextDouble(); //Read height
        assignment_1 myShape11 = new assignment_1(l,h);
        assignment_1 myShape12 = new assignment_1(l,b,h);
        double volume1;
        double volume2;
        volume1 = myShape11.calculate();
        volume2=myShape12.calculate();

        System.out.println(volume1);
        System.out.println(volume2);
    }
}