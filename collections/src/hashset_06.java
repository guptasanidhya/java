import java.util.HashSet;

public class hashset_06 {
    public static void main(String[] args) {

        HashSet hs = new HashSet(6, (float) 0.50);
        System.out.println(hs.size());
        hs.add(5);
        hs.add(4);
        hs.add(3);
        hs.add(2);
        System.out.println(hs.size());
    }
}
