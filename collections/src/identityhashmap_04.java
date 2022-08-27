import java.util.IdentityHashMap;
import java.util.Iterator;

public class identityhashmap_04 {
    public static void main(String[] args) {
        IdentityHashMap ihm =new IdentityHashMap();
        ihm.put("sanidhya",1);
        ihm.put("shanu",1);
        System.out.println("Initial values:"+ihm);
        ihm.remove("shanu");
        System.out.println("final values:"+ihm);
    }
}
