package com.company;
//star pattern with up to half and then low
import java.io.*;
import java.util.*;
import java.util.Scanner;


public class practice {
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
    }
}

