import java.util.Vector;
//constructor of vector class
public class vector_08 {
    public static void main(String[] args) {
        Vector v = new Vector(20);
        v.add(1);
        v.add(5);
        v.add(6);
        v.add(7);
        v.add(1, "sanidhya");
        v.addElement(null);
        System.out.println(v);
        System.out.println(v.size());
        System.out.println(v.capacity());
    }
}