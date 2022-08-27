import java.util.HashMap;

public class hashmap_05 {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put("Sanidhya", 10);
        hm.put("Nitin", 5);
        hm.put("deepak", 3);
        System.out.println("Initial Map " + hm);

        hm.put("Nitin",2);

        System.out.println("Updated Map " + hm);
    }
}
