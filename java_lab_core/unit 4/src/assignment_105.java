


class SomeTask implements Runnable {

    public void run() {
        System.out.println(" Task Start");

        System.out.println(" Task End");
    }
}
public class assignment_105 {
    public static void main(String[] args) {
        // Creating a Runnable object
        Runnable task = new SomeTask();

        Thread th1 = new Thread(task);

        th1.start();
        System.out.println("Hello From Main");
    }
}