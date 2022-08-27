import java.util.LinkedList;
//method contains() to check whether element exist or not
//toArray(); method to convert linked list to array
public class linkedlist_09 {
    public static void main(String[] args) {

            LinkedList l = new LinkedList();
            l.add("sanidhya");
            l.add("mohini");
            l.add("nitin");
            l.add("deepak");
            l.add("Sanskar");
           l.toArray();
        System.out.println(l.contains("deepak"));
        System.out.println();
    }
}
