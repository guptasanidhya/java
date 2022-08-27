import java.util.WeakHashMap;

public class weakhashmap_05 {
    public static void main(String[] args) {
        WeakHashMap<String, Integer> whm = new WeakHashMap();
        whm.put("Sanidhya", 10);
        whm.put("Nitin", 5);
        whm.put("Deepak", 3);
        System.out.println(whm.containsKey("Nitin"));

        System.out.println(whm.containsValue(3));
    }
}