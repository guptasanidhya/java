package com.company;
import java.util.Scanner;
public class MaximumCalculator {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("please enter two numbers to fimd maximum of two");
        int a =scnr.nextInt();
        int b =scnr.nextInt();
        if (a>b) {
            System.out.printf("Between %d and %d, maximum is %d \n",a,b,a);
        }
        else{
            System.out.printf("Between %d and %d, maximum is %d \n",a,b,b);
        }
    }
}
