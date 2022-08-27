package com.company;

public class CircleDemo4This {
    public static void main(String[] args) {
        // Initialize the circles
        Circle4 c1 = new Circle4(3.0,4.0,5.0);
        Circle4 c2 = new Circle4(5.0);
        Circle4 c3 = new Circle4(c1);
        Circle4 c4 = new Circle4();
        System.out.println("circumference of circle 1 ="+ c1.circumference());
        System.out.println("Area of circle 1 ="+ c1.area());
        System.out.println("circumference of circle 2 ="+ c2.circumference());
        System.out.println("Area of circle 2 ="+ c2.area());
        System.out.println("circumference of circle 2 ="+ c3.circumference());
        System.out.println("Area of circle 3 ="+ c3.area());


        System.out.println("circumference of circle 4 ="+ c4.circumference());
        System.out.println("Area of circle 4 ="+ c4.area());


    }
}

//class Circle4{
//    double x,y;
//    double r;
//    double circumference() {
//        return 2 * (Math.PI) * r;
//    }
//
//    double area() {
//        return Math.PI*Math.pow(r, 2);
//    }
//    Circle4 (double x , double y, double r){
//        this.x=x;this.y=y;this.r=r;
//    }
//    Circle4 ( double r){
//        x=0;y=0;this.r=r;
//    }
//    Circle4 (Circle4 c){
//        x=c.x;y=c.y;r=c.r;
//    }
//    Circle4 (){
//        this.x=0.0;this.y=0.0;this.r=1.0;
//    }
//}

class Circle4{
    double x,y;
    double r;
    double circumference() {
        return 2 * (Math.PI) * r;
    }

    double area() {
        return Math.PI*Math.pow(r, 2);
    }
    Circle4 (double x , double y, double r){
        this.x=x;this.y=y;this.r=r;
    }
    Circle4 ( double r){
        this(0,0,r);
    }
    Circle4 (Circle4 c){
        this(c.x,c.y,c.r);
    }
    Circle4 (){
        this(0,0,1.0);
    }
}