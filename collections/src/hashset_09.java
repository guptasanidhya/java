import java.util.*;
public class hashset_09 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add("5");
        hs.add("8");
        hs.add("120");
        hs.add("6");
        hs.remove("8");
        hs.removeAll(hs);
        Iterator itr = hs.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
