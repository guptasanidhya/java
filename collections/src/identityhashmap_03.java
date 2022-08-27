import java.util.IdentityHashMap;
import java.util.Iterator;

public class identityhashmap_03 {
    public static void main(String[] args) {
        IdentityHashMap ihm =new IdentityHashMap();
        ihm.put("sanidhya",1);
        ihm.put("shanu",1);
        Iterator itr = ihm.keySet().iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        Iterator itr1 = ihm.values().iterator();
        while(itr1.hasNext())
        {
            System.out.println(itr1.next());
        }
    }
}
