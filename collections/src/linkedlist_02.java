import java.util.*;
//for each loop with generics
//using method add(object) in linked list
//remove method of list remove(object)

public class linkedlist_02 {
    public static void main(String[] args) {
        LinkedList<Integer> l= new LinkedList<>();
        l.add(5);
        l.add(5);
        System.out.println(l);
        l.add(2);
        l.remove((Integer)5);
        System.out.println(l);

        for(Integer obj:l){
            System.out.println(obj);
        }
    }
}
