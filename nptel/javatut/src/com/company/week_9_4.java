package com.company;
import java.io.*;
import java.util.*;
import java.util.Scanner;
/*
A program needs to be developed which can mirror
 reflect any 5 × 5 2D character array into its side-by-side reflection.
 INPUT:                                       OUTPUT:
               OOXOO                                        OOXOO
               OOXOO                                        OOXOO
               XXXOO                                        OOXXX
               OOOOO                                        OOOOO
               XOABC                                        CBAOX
 */
public class week_9_4 {
 public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char arr[][] = new char[5][5];
        for (int line = 0; line < 5; line++) {
            String input = sc.nextLine();
            char seq[] = input.toCharArray();
            if (seq.length == 5) {
                for (int i = 0; i < 5; i++) {
                    arr[line][i] = seq[i];
                }
            } else {
                System.out.print("Wrong Input!");
                System.exit(0);
            }
        }
        for(int i=0;i<5;i++){
            for(int j=4;j>=0;j--){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
