import java.util.Iterator;
import java.util.PriorityQueue;

public class priorityqueue_09 {
    public static void main(String[] args) {
        PriorityQueue p = new PriorityQueue();
        p.add("Sanidhya");
        p.add("Mohini");
        p.add("nitin");
        p.add("deepak");
        p.clear();
        Iterator itr = p.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
