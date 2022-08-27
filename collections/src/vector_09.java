import java.util.Vector;

public class vector_09 {
    public static void main(String[] args) {
        Vector v = new Vector(12,5);
        System.out.println("size"+v.size());
        System.out.println("capacity"+v.capacity());
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);
        v.add(6);
        v.add(7);
        v.add(8);
        v.add(9);
        v.add(10);
        v.add(11);
        v.add(12);
        v.add(1, "sanidhya");
        System.out.println("size"+v.size());
        System.out.println("capacity"+v.capacity());
        v.addElement(null);
        System.out.println(v);
        System.out.println("size"+v.size());
        System.out.println("capacity"+v.capacity());
    }
}
