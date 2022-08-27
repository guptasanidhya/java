package com.company;

class threadA5 extends Thread{
    public void run(){
        System.out.println("Starting thread A");
        for(int i =1;i<=5;i++){
            if (i==1) Thread.yield();
            System.out.println("From Thread A with i="+ i);
        }
        System.out.println("exiting from thread A...");
    }
}
class threadB5 extends Thread{
    public void run(){
        System.out.println("Starting thread B");
        for(int j =1;j<=5;j++){
            System.out.println("From Thread B with j="+ j);
            if (j==2) {
                interrupt();
//                System.out.println("BAND KARO BHAI");
            }
        }
        System.out.println("exiting from thread B...");
    }
}class threadC5 extends Thread{
    public void run(){
        System.out.println("Starting thread C");
        for(int k =1;k<=5;k++){

            System.out.println("From Thread C with k="+ (k));
            if (k==3) {
                try {
                    sleep(1000);
                } catch (Exception e) {
                }
            }
        }
        System.out.println("exiting from thread C...");
    }
}

public class thread_05 {
    public static void main(String[] args) {
        threadA5 a = new threadA5();
        threadB5 b = new threadB5();
        threadC5 c = new threadC5();
        a.start();b.start();c.start();
        System.out.println("... multithreading is over");
    }
}