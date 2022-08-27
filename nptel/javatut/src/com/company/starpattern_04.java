package com.company;
////star pattern upto n opposite
import java.util.Scanner;

import java.io.*;
import java.util.*;

public class starpattern_04{
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        int n = s.nextInt();
        int k=0; int sum=0;

        for(int i =n;i>=1;i--,k=0){
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

