import java.util.HashMap;

public class hashmap_10 {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put("Sanidhya", 10);
        hm.put("Nitin", 5);
        hm.put("deepak", 3);
        System.out.println("Initial Map " + hm);


        System.out.println(hm.entrySet());//Returns a Set view of the
        // mappings contained in this map
    }
}
