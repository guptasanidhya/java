import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;

public class priorityblockingqueue_02 {
    public static void main(String[] args) {

        PriorityBlockingQueue p = new PriorityBlockingQueue();
        p.add(5);
        p.add(4);
        p.add(3);
        p.add(2);
        p.add(1);
        for(Object obj:p){
            System.out.println(obj);
        }
    }
}