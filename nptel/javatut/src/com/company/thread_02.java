package com.company;
class threadA2 implements Runnable{
    public void run(){
        for(int i =1;i<=5;i++){
            System.out.println("From Thread A with i="+ -1*i);
        }
        System.out.println("exiting from thread A...");
    }
}
class threadB2 implements Runnable{
    public void run(){
        for(int j =1;j<=5;j++){
            System.out.println("From Thread B with j="+ 2*j);
        }
        System.out.println("exiting from thread B...");
    }
}class threadC2 implements Runnable{
    public void run(){
        for(int k =1;k<=5;k++){
            System.out.println("From Thread C with k="+ (2*k-1));
        }
        System.out.println("exiting from thread C...");
    }
}
public class thread_02 {
    public static void main(String[] args) {
        threadA2 a = new threadA2();
        Thread t1 = new Thread(a);
        threadB2 b = new threadB2();
        Thread t2 = new Thread(b);
//        threadC2 c = new threadC2();
//        Thread t3 = new Thread(c);
        Thread t3 = new Thread(new threadC2());
        t1.start();
        t2.start();
        t3.start();

        System.out.println("... Multithreading is over");
    }
}
