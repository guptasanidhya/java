package com.company;
//star pattern with up to half and then low
import java.io.*;
import java.util.*;

public class normal_string_calculator{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        char c=input.charAt(0);
        char c1=input.charAt(1);
        char c2=input.charAt(2);

        double op1 = Character.getNumericValue(c);
        double op2 = Character.getNumericValue(c2);
        switch(c1){
            case '+' :{
                long sum=Math.round(op1+op2);
                System.out.print(c);
                System.out.print(c1);
                System.out.print(c2);
                System.out.print(" = "+sum);
                break;
            }
            case '-': {
                long sub=Math.round(op1-op2);
                System.out.print(c);
                System.out.print(c1);
                System.out.print(c2);
                System.out.println(" = "+sub);
                break;
            }
            case '*': {
                long mul=Math.round(op1*op2);
                System.out.print(c);
                System.out.print(c1);
                System.out.print(c2);
                System.out.println(" = "+mul);
                break;

            }
            case '/': {
                long div=Math.round(op1/op2);
                System.out.print(c);
                System.out.print(c1);
                System.out.print(c2);
                System.out.println(" = "+div);
                break;
            }
        }

//        char[] ch=input.toCharArray();
//        for(int i=0;i<ch.length;i++){
//            System.out.println("char at "+i+" index is: "+ch[i]);
//        }




    }
}

