import java.util.HashSet;
import java.util.Iterator;

public class hashset_02 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add("5");
        hs.add("8");
        hs.add("120");
        hs.add("6");

        for(Object obj:hs){
            System.out.println(obj);
        }
    }
}
