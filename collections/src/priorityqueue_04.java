import java.util.Iterator;
import java.util.PriorityQueue;

public class priorityqueue_04 {
    public static void main(String[] args) {
        PriorityQueue<String> p = new PriorityQueue();
        p.add("Sanidhya");
        p.add("Mohini");
        p.add("nitin");
        p.add("Anushka");
        p.add("deepak");

        for (Object obj : p) {
            System.out.println(obj);
        }
    }
}