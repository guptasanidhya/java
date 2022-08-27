package com.company;
//Star pattern odd
import java.io.*;
import java.util.*;

public class starpattern{
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        int n = s.nextInt();
        int k=0; int sum=0;

        for(int i =1;i<=n;i++,k=0){
            for(int space=1 ;space<=n-i;space++){
                System.out.print("  ");
            }
            while(k!=2*i-1) {
                System.out.print("* ");
                sum =sum+1;
                k++;
            }
            System.out.println();
        }
        System.out.println(sum);
    }

}

//public class starpattern{
//    public static void main(String[] args) {
//        Scanner s  = new Scanner(System.in);
//        int n = s.nextInt();
//        int k=0; int sum=0;
//
//        for(int i =1;i<=n;i++,k=0){
//            for(int space=0 ;space<=n-i-1;space++){
//                System.out.print(" ");
//            }
//            while(k!=2*i-1) {
//                System.out.print("*");
//                sum =sum+1;
//                k++;
//            }
//            System.out.println();
//        }
//        System.out.println(sum);
//    }
//
//
//}

