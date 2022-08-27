import java.util.WeakHashMap;

public class weakhashmap_02 {
    public static void main(String[] args) {
        WeakHashMap<String,Integer> whm= new WeakHashMap();
        whm.put("Sanidhya",10);
        whm.put("Nitin",5);
        whm.put("Deepak",3);
        whm.forEach((k, v) -> {
            System.out.format("key: %s, value: %d%n", k, v);
        });
    }
}
