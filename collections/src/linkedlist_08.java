import java.util.LinkedList;

public class linkedlist_08 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("sanidhya");
        l.add("mohini");
        l.add("nitin");
        l.add("deepak");
        l.add("Sanskar");
        System.out.println(l.peekFirst());
        System.out.println(l.peekLast());
        System.out.println(l.peek());
        System.out.println(l.indexOf("deepak"));
    }
}
