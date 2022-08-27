package com.company;
class threadA implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " thread 1");
        }
    }
}
class threadB implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " thread 2");
        }
    }
}
class threadC implements Runnable{
   public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i+" thread 3");
        }
    }
}
public class practice_2{
    public static void main(String[] args) {
        Thread object1=new Thread( new threadA());
        Thread object2=new Thread( new threadB());
        Thread object3=new Thread( new threadC());
        object1.start();object2.start();object3.start();
        try {
            Thread.sleep(1000);
        }catch(Exception e){}
        System.out.println("main thread is over");
    }
}