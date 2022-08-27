package com.company;

import java.util.Scanner;

public class starpattern_03 {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        int n = s.nextInt();
        int k=0; int sum=0;

        for(int i=1;i<=n;i++,k=0){
            for(int space=1 ;space<=n-i;space++){
                System.out.print(" ");
            }
            while(k!=i) {
                System.out.print("* ");
                k++;
            }
            System.out.println();
        }
    }

}
