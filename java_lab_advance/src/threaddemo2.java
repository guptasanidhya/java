class threadA extends Thread{
    public void run(){
        for(int i =1;i<=2;i++){
            System.out.println("From Thread A with i="+ -1*i);
        }
        System.out.println("exiting from thread A...");
    }
}
class threadB extends Thread{
    public void run(){
        for(int j =1;j<=5;j++){
            System.out.println("From Thread B with i="+ -1*j);
        }
        System.out.println("exiting from thread B...");
    }
}

public class threaddemo2 {
    public static void main(String[] args) {
        threadA a = new threadA();
        threadB b = new threadB();
        a.start();
        b.start();
        System.out.println("multithreading is over");
    }
}
