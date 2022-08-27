class threadA2 extends Thread{
    synchronized public void run(){
        for(int i =1;i<=2;i++){
            System.out.println("From Thread A with i="+ -1*i);
        }

        System.out.println("exiting from thread A...");
        try{sleep(6000);}catch(Exception e){}
    }

}
class threadB2 extends Thread{
    synchronized public void run(){
        for(int j =1;j<=2;j++){
            System.out.println("From Thread B with j="+ -1*j);
        }
        System.out.println("exiting from thread B...");
        try{sleep(1000);}catch(Exception e){}
    }
}
public class threadsynchro {
    public static void main(String[] args) {
        threadA2 a = new threadA2();
        threadB2 b = new threadB2();
        a.start();
        b.start();
        System.out.println("multithreading is over");
    }
}
