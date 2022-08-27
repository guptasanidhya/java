import java.util.LinkedHashMap;

public class linkedhashmap_02 {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm= new LinkedHashMap<>();
        lhm.put("Sanidhya",1);
        lhm.put("Gupta",2);
            lhm.forEach((k, v) -> {
        System.out.format("key: %s, value: %d%n", k, v);
    });
}}
