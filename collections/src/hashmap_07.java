import java.util.*;

public class hashmap_07 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap();
        hm.put("Sanidhya", 10);
        hm.put("Nitin", 5);
        hm.put("deepak", 3);
        for (Map.Entry<String, Integer> e : hm.entrySet())
            System.out.println("Key: " + e.getKey()
                    + " Value: " + e.getValue());
    }
    }

