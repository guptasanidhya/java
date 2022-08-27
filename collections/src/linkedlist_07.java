import java.util.LinkedList;
//using get(index)
//getfirst()
//getlast()
public class linkedlist_07 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("sanidhya");
        l.add("mohini");
        l.add("nitin");
        l.add("deepak");
        l.add("Sanskar");
        System.out.println(l.get(3));
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
    }
}
