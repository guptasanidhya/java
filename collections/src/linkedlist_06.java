import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
// LinkedList(Collection C): This constructor is used to create an
// ordered list that contains all the elements of a specified collection,
// as returned by the collection’s iterator. If we wish to create a LinkedList
// with the name ll, then, it can be created as:
//LinkedList ll = new LinkedList(C);
public class linkedlist_06 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();

        l.add(5);
        l.addFirst("Sanidhya");
        l.add(6);
        l.addLast(7);
        l.add(3,"Gupta");
        l.remove(4);
        System.out.println(l);
        LinkedList l1 = new LinkedList(l);
        l1.add(3);
        l1.add(2);
        l1.add(1);
       System.out.println(l1); //first l will be called then l1 will ber called
        Iterator itr= l1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
