import java.util.*;

public class hashtabledemo {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht= new Hashtable<>();
        ht.put(101,"Sanidhya");
        ht.put(102,"mohini");
        ht.put(103,"nitin");
        ht.put(104,"Muskan");
        ht.put(105,"Deepak");
        System.out.println(ht);
        System.out.println(ht.get(101));
        // Iterating using enhanced for loop
        for (Map.Entry<Integer,String> e : ht.entrySet())
            System.out.println(e.getKey() + " "
                    + e.getValue());
    }

}
