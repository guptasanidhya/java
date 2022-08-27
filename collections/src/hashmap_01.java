import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class hashmap_01 {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put("Sanidhya",10);
        hm.put("Nitin",5);
        hm.put("deepak",3);
        Iterator itr = hm.keySet().iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        Iterator itr1 = hm.values().iterator();
        while(itr1.hasNext())
        {
            System.out.println(itr1.next());
        }
    }
}
