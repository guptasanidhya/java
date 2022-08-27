package com.company;
//DATA RACE EXAMPLE
public class thread_08 extends Thread{

    public static int x;
    public void run(){
        for(int i=0;i<100;i++){
            x=x+1;
            x=x-1;
        }
    }

    public static void main(String[] args) {
        x=0;
        for(int i=0;i<1000;i++){
            new thread_08().start();
            System.out.println(x);
            if (x==1){

                System.out.println("yes");//X IS NOT ALWAYS ZERO
            }
        }
    }
}
