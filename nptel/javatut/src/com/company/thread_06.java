package com.company;

class threadA6 extends Thread{
    public void run(){
        try {
            System.out.println("First thread starts running");
            sleep(10000);
            System.out.println("First thread finishes running");
        }
        catch(Exception e){ }
    }
}

class threadB6 extends Thread{
    public void run(){
        try {
            System.out.println("Second thread starts running");
            System.out.println("Second thread is Suspended itself");
//            suspend();
            System.out.println("second thread runs again");
        }
        catch(Exception e){ }
    }
}



public class thread_06 {
    public static void main(String[] args) {
        threadA6 first = new threadA6();//it is a newborn thread in newborn state i.e.
        threadB6 second = new threadB6();//another new born thread

        first.start();//first is scheduled for running
        second.start();//second is scheduled for running

        System.out.println("Revive the second thread"); //if it is suspended
        //second.resume();

        System.out.println("seconds thread went for 10 sec sleep");
        try {
            second.sleep(10000);
        }
        catch(Exception e){ }
        System.out.println("wake up second thread and finishes running");

    }
}
