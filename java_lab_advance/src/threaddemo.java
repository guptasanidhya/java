class threadA1 implements Runnable{
    public void run(){
        for(int i =1;i<=2;i++){
            System.out.println("From Thread A with i="+ -1*i);
        }
        System.out.println("exiting from thread A...");
    }
}
class threadB1 implements Runnable{
    public void run(){
        for(int j =1;j<=2;j++){
            System.out.println("From Thread B with j="+ 2*j);
        }
        System.out.println("exiting from thread B...");
    }
}
class threadC1 implements Runnable{
    public void run(){
        for(int k =1;k<=2;k++){
            System.out.println("From Thread C with k="+ (2*k-1));
        }
        System.out.println("exiting from thread C...");
    }
}

public class threaddemo {
    public static void main(String[] args) {
        Thread object1 = new Thread(new threadA1());
        object1.start();
        Thread object2 = new Thread(new threadB1());
        object2.start();
        Thread object3 = new Thread(new threadC1());
        object3.start();
        System.out.println("... multithreading is over");
    }
}

