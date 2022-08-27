package com.company;
//creating three thread using the class thread and then running
//them concurrently
class threadA1 extends Thread{
    public void run(){
        for(int i =1;i<=5;i++){
            System.out.println("From Thread A with i="+ -1*i);
        }
        System.out.println("exiting from thread A...");
    }
}
class threadB1 extends Thread{
    public void run(){
        for(int j =1;j<=5;j++){
            System.out.println("From Thread B with j="+ 2*j);
        }
        System.out.println("exiting from thread B...");
    }
}class threadC1 extends Thread{
    public void run(){
        for(int k =1;k<=5;k++){
            System.out.println("From Thread C with k="+ (2*k-1));
        }
        System.out.println("exiting from thread C...");
    }
}

public class thread_01 {
    public static void main(String[] args) {
        threadA1 a= new threadA1();
        threadB1 b= new threadB1();
        threadC1 c= new threadC1();
        a.start();
        b.start();
        c.start();
        System.out.println("... multithreading is over");
    }
}
