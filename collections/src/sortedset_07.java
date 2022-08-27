import java.net.HttpRetryException;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class sortedset_07 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(9);
        ts.add(8);
        ts.add(7);
        ts.add(6);
        ts.add(5);
        ts.add(4);
        ts.clear();
        Iterator itr = ts.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }


    }
}
