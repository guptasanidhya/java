import java.util.LinkedHashMap;

public class linkedhashmap_04 {
    public static void main(String[] args) {
        LinkedHashMap lhm= new LinkedHashMap();
        lhm.put("Sanidhya",1);
        lhm.put("Gupta",2);
        //lhm.put("mohini",2);
        System.out.println(lhm.containsValue(2));
    }
}
