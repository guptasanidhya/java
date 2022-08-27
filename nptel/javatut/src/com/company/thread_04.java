package com.company;
//by runnable interface

//Demonstration of thread class methods : getID();
//Java code for thread creation bt extending thread class
class threadID implements Runnable{
    public void run(){
        try{
            //Displaying the thread that is running
            System.out.println("thread "+Thread.currentThread().getId());
        }
        catch (Exception e){
            //throwing an exception
            System.out.println("exception is caught");
        }
    }
}

public class thread_04 {
    public static void main(String[] args) {
        int n=8;//number of threads
        for(int i=0;i<8;i++){
            Thread object = new Thread(new threadID());
            object.start();
        }
    }
}


