import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedhashset_11 {
    public static void main(String[] args) {
        LinkedHashSet lhs=new LinkedHashSet();
        lhs.add(5);
        lhs.add(4);
        lhs.add(3);
        lhs.add(2);
        lhs.add(5);
        System.out.println("size"+lhs.size());
        Iterator itr = lhs.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }    }

