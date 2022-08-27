import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;

public class priorityblockingqueue_11 {
    public static void main(String[] args) {

        PriorityBlockingQueue p = new PriorityBlockingQueue();
        p.add(5);
        p.add(4);
        p.add(3);
        p.add(2);
        p.add(1);
        PriorityBlockingQueue p2 = new PriorityBlockingQueue();
        p.add(4);
        p.add(43);
        p.add(2);


        p.addAll(p2);
        System.out.println(p);

    }
}