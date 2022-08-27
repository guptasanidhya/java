import java.util.*;
//addFirst(object) to add element at first
//addLast(object) to add element at last
public class linkedlist_05 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(5);
        l.addFirst("Sanidhya");
        l.add(6);
        System.out.println(l);
        l.addLast(7);
        l.add(3,"Gupta");
        l.remove(4);
        System.out.println(l);
    }
}
