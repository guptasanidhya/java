package com.company;
//creating three thread using the class thread and then running
//them concurrently
class threadA7 extends Thread{
    public void run(){
        System.out.println("Starting thread A");
        for(int i =1;i<=5;i++){
            System.out.println("From Thread A with i="+ -1*i);
        }
        System.out.println("exiting from thread A...");
        try{sleep(2000);}catch(Exception e){}
    }
}
class threadB7 extends Thread{
    public void run(){
        System.out.println("Starting thread B");
        for(int j =1;j<=5;j++){
            System.out.println("From Thread B with j="+ 2*j);
        }
        System.out.println("exiting from thread B...");
        try{sleep(1000);}catch(Exception e){}
    }
}class threadC7 extends Thread{
    public void run(){
        System.out.println("Starting thread C");
        for(int k =1;k<=5;k++){
            System.out.println("From Thread C with k="+ (2*k-1));
        }
        System.out.println("exiting from thread C...");
        try{sleep(500);}catch(Exception e){}
    }
}

public class thread_07 {
    public static void main(String[] args) {
        threadA7 a= new threadA7();
        threadB7 b= new threadB7();
        threadC7 c= new threadC7();

        c.setPriority(Thread.MAX_PRIORITY);

        b.setPriority(b.getPriority()+1);
        a.setPriority(Thread.MIN_PRIORITY);


        a.start();
        b.start();
        c.start();
        System.out.println("... multithreading is over");
    }
}

