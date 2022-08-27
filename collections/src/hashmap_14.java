import java.util.HashMap;

public class hashmap_14 {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put("Sanidhya", 10);
        hm.put("Nitin", 5);
        hm.put("deepak", 3);
        System.out.println("Initial Map " + hm);

        hm.replace("Nitin",4);
        System.out.println("Updated Map " + hm);
        hm.replace("Nitin",4,5);
        System.out.println("Updated Map " + hm);

    }
}
