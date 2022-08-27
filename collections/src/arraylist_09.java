import java.util.ArrayList;
import java.util.Iterator;
//using list method set(index,object)
public class arraylist_09 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("sanidhya");
        al.add("nitin");
        al.add(3);
        al.add("mohini");
        al.add("deepak");
        System.out.println(al);
        al.set(4,"muskan");

        Iterator itr = al.iterator();
        for(Object obj:al){
            System.out.println(obj);
        }
    }
}
