import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedhashset_10 {
    public static void main(String[] args) {
        LinkedHashSet lhs=new LinkedHashSet();
        lhs.add(5);
        lhs.add(4);
        lhs.add(3);
        lhs.add(2);
        lhs.add(5);
        LinkedHashSet lhs1=new LinkedHashSet();
        lhs1.add(5);
        lhs1.add(11);
        lhs1.add(0);
        lhs1.add(14);
        lhs.addAll(lhs1);
        Iterator itr = lhs.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }    }

