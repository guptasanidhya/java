package com.company;
//star pattern but number
import java.io.*;
import java.util.*;

public class starpattern_02{
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        int n = s.nextInt();
        int k=0; int sum=0;

        for(int i =1;i<=n;i++,k=0){
            for(int space=1 ;space<=n-i;space++){
                System.out.print("  ");
            }
            while(k!=2*i-1) {


                if(i==1){
                    System.out.print(1+" ");
                    sum=sum+1;
                }
                else{
                    for(int num=1;num<=2*i-1;num++){
                        System.out.print(num+" ");
                        sum=sum+num;
                    }
                }
                System.out.println();
                break;
            }
        }
        System.out.println(sum);
    }
}


