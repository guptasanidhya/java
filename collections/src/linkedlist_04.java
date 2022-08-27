import java.util.*;

public class linkedlist_04 {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();

        l.add(5);
        l.add(5);
        System.out.println(l);
        l.add(2);
        l.remove((Integer)5);
        System.out.println(l);

        for(Object obj:l){
            System.out.println(obj);
        }
    }
}
