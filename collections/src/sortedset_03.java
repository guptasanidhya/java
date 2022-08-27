import java.util.Comparator;
import java.util.TreeSet;

public class sortedset_03 {
    public static void main(String[] args) {
        TreeSet ts1 = new TreeSet();
        ts1.add("5");
        ts1.add("4");
        ts1.add("3");
        ts1.add("A");
        ts1.add("B");
        ts1.add("10");
        ts1.add("1");
        System.out.println(ts1);
        Comparator comp = ts1.comparator();
        System.out.println(comp);
    }
}