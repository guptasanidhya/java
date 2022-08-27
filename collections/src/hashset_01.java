import java.util.*;
public class hashset_01 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add("5");
        hs.add("8");
        hs.add("120");
        hs.add("6");

        Iterator itr = hs.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
