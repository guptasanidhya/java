package com.company;

public class multipleClassDemo {
    public static void main(String[] args) {
        Circle1 c1= new Circle1();
        Box1 b1 =new Box1();
        // Initialize the circles
        c1.x=3.0; c1.y=4.0; c1.r=5.0;
        b1.width=4.0; b1.height=8.0; b1.depth=10.0;
        System.out.println("circumference of circle 1 ="+ c1.circumference());
        System.out.println("Area of circle 1 ="+ c1.area());
        System.out.println("volume of box ="+ b1.volume());
        System.out.println("area of box ="+ b1.area());


    }
}

class Circle1{
    double x,y;
    double r;

    double circumference(){
        return 2*(Math.PI)*r;
    }
    double area(){
        return Math.PI*Math.pow(r, 2);
    }
}

class Box1{
    double width;
    double height;
    double depth;
    double area(){
        double a;
        a=(width*height + height*depth + width*depth) *2 ;
        return a;
    }

    double volume(){
        double v;
        v=width*height*depth;
        return v;
    }
}