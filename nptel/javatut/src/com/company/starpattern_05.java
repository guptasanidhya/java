package com.company;
//star pattern with upto half and then low
import java.io.*;
import java.util.*;

public class starpattern_05{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = 0;
        if(n%2!=0) {
            for (int i = 1; i <= (n / 2) + 1; i++, k = 0) {

                for (int space = 1; space <= n - i; space++) {
                    System.out.print(" ");
                }
                while (k != i) {
                    System.out.print("* ");
                    k++;
                }
                System.out.println();
            }
            ////////////////////////////////////////////
            for (int i = n / 2; i >= 1; i--, k = 0) {
                for (int space = 1; space <= n - i; space++) {
                    System.out.print(" ");
                }
                while (k != i) {
                    if(k==i-1){
                    System.out.print("*");
                    k++;}
                    else{
                        System.out.print("* ");
                        k++;
                    }
                }
                System.out.println();
            }
        }else{
            System.out.println("Invalid line number");
        }

    }
}

