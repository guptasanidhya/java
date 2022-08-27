package com.company;
import java.util.Scanner;

class Point {
    double x;
    double y;
    double result;

    void distance(Point p1, Point p2) {
        double power1=Math.pow(p1.x - p2.x, 2);
        double power2= Math.pow(p1.y - p2.y, 2);
        double sub = power1 +power2;

        result = Math.sqrt(sub);
        System.out.println(power1);
        System.out.println(power2);
        System.out.println(sub);
        System.out.println(result);
    }
}


public class power extends Point {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Point p1 = new Point();
        p1.x = sc.nextDouble();
        p1.y = sc.nextDouble();
        Point p2 = new Point();
        p2.x = sc.nextDouble();
        p2.y = sc.nextDouble();
        power c1 = new power();
        c1.distance(p1, p2);

    }

}



