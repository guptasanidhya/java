import java.util.*;
//without using generics and iterator method
public class arraylist_03{
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
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
