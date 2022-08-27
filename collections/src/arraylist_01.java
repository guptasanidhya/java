//using generics and iterator method

import java.util.*;

public class arraylist_01 {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>();
        al.add("Sanidhya");
        al.add("Nitin");
        al.add("Mohini");

        Iterator itr = al.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}
