import java.util.Iterator;
import java.util.PriorityQueue;

public class priorityqueue_08 {
    public static void main(String[] args) {
        PriorityQueue p = new PriorityQueue();
        p.add("Sanidhya");
        p.add("Mohini");
        p.add("nitin");
        p.add("deepak");
        Iterator itr = p.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
