import java.net.HttpRetryException;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class sortedset_09 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(9);
        ts.add(8);
        ts.add(7);
        ts.add(6);
        ts.add(5);
        ts.add(4);
        System.out.println(ts.first());
        System.out.println(ts.last());



    }
}
