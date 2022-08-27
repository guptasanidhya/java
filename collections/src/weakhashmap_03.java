import java.util.Iterator;
import java.util.WeakHashMap;

public class weakhashmap_03 {
    public static void main(String[] args) {
        WeakHashMap whm= new WeakHashMap();
        whm.put("Sanidhya",10);
        whm.put("Nitin",5);
        whm.put("Deepak",3);
        Iterator itr = whm.keySet().iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        Iterator itr1 = whm.values().iterator();
        while(itr1.hasNext())
        {
            System.out.println(itr1.next());
        }
    }
}
