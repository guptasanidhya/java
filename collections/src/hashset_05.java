import java.util.HashSet;
import java.util.Iterator;

public class hashset_05 {
    public static void main(String[] args) {
        HashSet hs = new HashSet(6);
        System.out.println(hs.size());
        hs.add(11);
        hs.add(13);
        hs.add(12);
        hs.add(14);
        hs.add(10);
        hs.add(9);
        hs.add(8);
        hs.add(7);
        hs.add(6);
        hs.add(5);
        hs.add(4);
        hs.add(3);
        hs.add(2);
        hs.add(1);
        System.out.println(hs);
        System.out.println(hs.size());
        Iterator itr = hs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());

        }    }
}
