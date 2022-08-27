class threadA extends Thread{
   public void run(){
       System.out.println("starting thread A");
       for (int i=1;i<=10;i++){
           System.out.println(" i values are="+i);
       }
       System.out.println("Exiting A");
       try{sleep(5000);}catch(Exception e){}
   }
}

class threadB extends Thread {
    public void run() {
        System.out.println("starting thread B");
        for (int j = 1; j <= 10; j++) {
            System.out.println(" j values are=" + j);
        }
        System.out.println("Exiting B");
        try{sleep(7000);}catch(Exception e){}
    }
}

class threadC extends Thread {
    public void run() {
        System.out.println("starting thread C");
        for (int k = 1; k <= 10; k++) {
            System.out.println(" k values are=" + k);
        }
        System.out.println("Exiting C");
        try{sleep(10000);}catch(Exception e){}
    }
}
public class assignment_76 {
    public static void main(String[] args) {
        threadA a =new threadA();
        threadB b =new threadB();
        threadC c =new threadC();
        c.setPriority(Thread.MAX_PRIORITY);
        b.setPriority(Thread.NORM_PRIORITY);
        a.setPriority(Thread.MIN_PRIORITY);
        a.start();
        b.start();
        c.start();
        System.out.println("... multithreading is over");
    }


}
