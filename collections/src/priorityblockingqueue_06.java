import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;

public class priorityblockingqueue_06 {
    public static void main(String[] args) {

        PriorityBlockingQueue p = new PriorityBlockingQueue();
        p.add(5);
        p.add(4);
        p.add(3);
        p.add(2);
        p.add(1);
        p.add(1);
        System.out.println(p.remainingCapacity());
        Iterator itr = p.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}