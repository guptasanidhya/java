

public class assignment_116 implements Runnable {

    Thread th;

    public assignment_116(String threadName) {
        th= new Thread(this,threadName);
        th.start();
    }

    public void run() {
        System.out.println(th.getName()+" is starting.....");
        System.out.println("Current thread name : "+
                Thread.currentThread().getName());
    }

    public static void main(String args[]) {
        System.out.println("Current thread name : "+
                Thread.currentThread().getName());
        new assignment_116("1st Thread");
        new assignment_116("2nd Thread");

    }
}