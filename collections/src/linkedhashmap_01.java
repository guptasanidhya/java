import java.util.Iterator;
import java.util.LinkedHashMap;

public class linkedhashmap_01 {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm= new LinkedHashMap<>();
        lhm.put("Sanidhya",1);
        lhm.put("Gupta",2);
        Iterator itr = lhm.keySet().iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        Iterator itr1 = lhm.values().iterator();
        while(itr1.hasNext())
        {
            System.out.println(itr1.next());
        }
    }
}
