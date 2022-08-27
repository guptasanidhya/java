package com.company;

public class CircleDemo3 {
    public static void main(String[] args) {
        Circle3 c1= new Circle3(1.0,2.0,3.0);
        Circle3 c2= new Circle3(2.0,3.0,4.0);
        // Initialize the circles

        System.out.println("circumference of circle 1 ="+ c1.circumference());
        System.out.println("Area of circle 1 ="+ c1.area());
        System.out.println("circumference of circle 2 ="+ c2.circumference());
        System.out.println("circumference of circle 2 ="+ c2.area());


    }
}

class Circle3 {
    double x, y;
    double r;

    double circumference() {
        return 2 * (Math.PI) * r;
    }

    double area() {
        return Math.PI*Math.pow(r, 2);
    }

//    Circle3(double a, double b, double c) {
//        x = a;
//        y = b;
//        r = c;
//    }
    Circle3(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
}