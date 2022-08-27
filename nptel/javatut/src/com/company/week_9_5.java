package com.company;
//star pattern with up to half and then low
import java.io.*;
import java.util.*;
import java.util.Scanner;
/*
Write suitable code to develop a 2D Flip-Flop Array with dimension 5 × 5,
 which replaces all input elements with values 0 by 1 and 1 by 0
 INPUT:
00100
00100
11111
00100
00100

OUTPUT:
10001
01010
00100
0101010001
 */

public class week_9_5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char arr[][]= new char[5][5];
        for(int i=0;i<5;i++){
            String input = sc.nextLine();
            char seq[] = input.toCharArray();
            if (seq.length==5){
                for(int j=0;j<5;j++){
                    arr[i][j]=seq[j];
                }
            } else {
                System.out.print("Wrong Input!");
                System.exit(0);
            }


        }
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(arr[i][j]=='0'){
                    System.out.print('1');
                } else if(arr[i][j]=='1') {
                    System.out.print('0');

                }
            }
            System.out.println();
        }
    }
}