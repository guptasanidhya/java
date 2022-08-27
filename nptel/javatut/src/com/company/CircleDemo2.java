package com.company;

public class CircleDemo2 {
    public static void main(String[] args) {
        Circle2 c1= new Circle2();
        Circle2 c2= new Circle2();
        // Initialize the circles
        c1.setCircle(1,2,3);
        c2.setCircle(2,3,4);
        System.out.println("circumference of circle 1 ="+ c1.circumference());
        System.out.println("Area of circle 1 ="+ c1.area());
        System.out.println("circumference of circle 2 ="+ c2.circumference());
        System.out.println("circumference of circle 2 ="+ c2.area());


    }
}

class Circle2 {
    double x, y;
    double r;

    double circumference() {
        return 2 * (Math.PI) * r;
    }

    double area() {
        return Math.PI*Math.pow(r, 2);
    }

    void setCircle(double a, double b, double c) {
        x = a;
        y = b;
        r = c;
    }
}