import java.util.*;
//iterator with generics
//using method add(object) in linked list
//remove method of list remove(object)

public class linkedlist_01 {
    public static void main(String[] args) {
        LinkedList<Integer> l= new LinkedList<>();
        l.add(5);
        l.add(5);
        System.out.println(l);
        l.add(2);
        l.remove((Integer)5);
        System.out.println(l);

        Iterator itr= l.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
