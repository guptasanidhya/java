import java.util.*;
//to synchronise arraylist use List obj=Collections.synchronizedList(arraylist obj);
/*
A thread-safe variant of ArrayList in which all mutative operations (e.g., add, set, remove..)
 are implemented by creating a separate copy of an underlying array.
  It achieves thread safety by creating a separate
 copy of the List which is different than vector or other collections
 used to provide thread-safety.
 */
/*
 */
public class arraylist_11 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(5);
        al.add(4);
        al.add(1);
        al.add(2);
        List l=Collections.synchronizedList(al);
        System.out.println(al);
        System.out.println(l);
        synchronized(al)
        {
            // must be in synchronized block
            Iterator it = al.iterator();
            while (it.hasNext())
                System.out.println(it.next());
        }
    }
}
