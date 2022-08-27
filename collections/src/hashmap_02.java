import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class hashmap_02 {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put("Sanidhya",10);
        hm.put("Nitin",5);
        hm.put("deepak",3);
        System.out.println(hm);

        hm.forEach((k, v) -> {
            System.out.format("key: %s, value: %d%n", k, v);
        });
    }
}
