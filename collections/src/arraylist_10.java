import java.util.*;
//using method of list arraylist indexof(obj) to get first time index value
// lastIndexOf(obj)//to get last index value of object
//listIterator listIterator() for forward movement and backward movement
public class arraylist_10 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("sanidhya");
        al.add("nitin");
        al.add(3);
        al.add(3);
        al.add(3);
        al.add("mohini");
        al.add("deepak");
        System.out.println(al);
        System.out.println(al.indexOf(3));
        System.out.println(al.lastIndexOf(3));
//for forward movement
        ListIterator li = al.listIterator();
        while(li.hasNext()){
            System.out.println(li.next());
        }
//for backward movement
        while(li.hasPrevious()){
            System.out.println(li.previous());
        }
    }
}
