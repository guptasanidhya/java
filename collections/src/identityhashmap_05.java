import java.util.IdentityHashMap;
import java.util.Iterator;

public class identityhashmap_05 {
    public static void main(String[] args) {
        IdentityHashMap ihm =new IdentityHashMap();
        ihm.put("sanidhya",1);
        ihm.put("shanu",1);
        System.out.println(ihm.size());
        System.out.println("Initial values:"+ihm);
        ihm.remove("shanu");
        System.out.println(ihm.size());
        ihm.clear();
        System.out.println("final values:"+ihm);
        System.out.println(ihm.size());
    }
}
