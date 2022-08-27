import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.*;

public class priorityqueue_10 {
    public static void main(String[] args) {
        PriorityQueue p = new PriorityQueue();
        p.add("Sanidhya");
        p.add("Mohini");
        p.add("nitin");
        p.add("deepak");
        System.out.println(p.isEmpty());
        Iterator itr = p.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
