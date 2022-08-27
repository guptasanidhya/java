package com.company;

public class CircleDemo {
    public static void main(String[] args) {
        Circle c1= new Circle();
        Circle c2= new Circle();
        // Initialize the circles
        c1.x=3.0; c1.y=4.0; c1.r=5.0;
        c2.x=-4.0; c2.y=-8.0; c2.r=10.0;
        System.out.println("circumference of circle 1 ="+ c1.circumference());
        System.out.println("Area of circle 1 ="+ c1.area());
        System.out.println("circumference of circle 2 ="+ c2.circumference());
        System.out.println("circumference of circle 2 ="+ c2.area());


    }
}

class Circle{
    double x,y;
    double r;

    double circumference(){
        return 2*(Math.PI)*r;
    }
    double area(){
        return Math.PI*Math.pow(r, 2);
    }
}
