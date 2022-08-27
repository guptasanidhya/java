import java.util.Iterator;
import java.util.LinkedHashMap;

public class linkedhashmap_05 {
    public static void main(String[] args) {
        LinkedHashMap lhm= new LinkedHashMap<>();
        lhm.put("Sanidhya",1);
        lhm.put("Gupta",2);
        System.out.println(lhm.values());
        System.out.println(lhm.keySet());
        System.out.println(lhm.entrySet());
    }
}
