import java.util.Iterator;
import java.util.PriorityQueue;

public class priorityqueue_02 {
    public static void main(String[] args) {
        PriorityQueue p = new PriorityQueue();
        p.add("Sanidhya");
        p.add("Mohini");
        p.add("nitin");
        p.add("Anushka");
        p.add("deepak");
        Iterator itr = p.iterator();
        for (Object obj : p) {
            System.out.println(obj);
        }
    }
}