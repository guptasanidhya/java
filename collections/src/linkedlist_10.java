import java.util.LinkedList;
import java.util.ListIterator;

public class linkedlist_10 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("sandihya");
        l.add("mohini");
        l.add("nitin");
        l.add("muskan");
        System.out.println(l);
        ListIterator lr= l.listIterator();
        while(lr.hasNext()){
            String s = (String)lr.next();
            if(s.equals("muskan")){
                lr.remove();
            } else if(s.equals("sanidhya")){
                lr.add("gupta");
            } else if(s.equals("nitin")){
                lr.set("deepak");
            }
        }
        System.out.println(l);
    }
}
