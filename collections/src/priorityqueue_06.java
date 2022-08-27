import java.util.Iterator;
import java.util.PriorityQueue;

public class priorityqueue_06 {
    public static void main(String[] args) {
        PriorityQueue p = new PriorityQueue();
        p.add("Sanidhya");
        p.add("nitin");
        p.add("deepak");
        System.out.println(p.contains("nitin"));
        Iterator itr = p.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
