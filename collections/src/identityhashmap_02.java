import java.util.IdentityHashMap;
import java.util.Iterator;

public class identityhashmap_02 {
    public static void main(String[] args) {
        IdentityHashMap<String, Integer> ihm = new IdentityHashMap<>();
        ihm.put("sanidhya", 1);
        ihm.put("shanu", 1);
        ihm.forEach((k, v) -> {
            System.out.format("key: %s, value: %d%n", k, v);
        });

    }}