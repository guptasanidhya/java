//using method set(index,object)
//method clear()
//method size()
import java.util.*;

public class arraylist_12 {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>();
        al.add("Sanidhya");
        al.add("Nitin");
        al.add("Mohini");
        System.out.println(al.size());
        al.set(2,"deepak");
        System.out.println(al);
        al.clear();

        Iterator itr = al.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}
