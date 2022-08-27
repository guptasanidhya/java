import java.util.LinkedList;

public class linkedlistdemo {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(1);
        l.add(5);
        l.add(3);
        l.remove(1);
        System.out.println("value removed from index 1");
        l.remove(Integer.valueOf(3));
        System.out.println("value removed integer 3");
        System.out.println(l);

    }
}
