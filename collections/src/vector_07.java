import java.util.Vector;
//uisng the extra size and capacity methods
public class vector_07 {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(1);
        v.add(5);
        v.add(6);
        v.add(7);
        v.add(1, "sanidhya");
        v.addElement(null);
        System.out.println(v);
        System.out.println(v.size());
        System.out.println(v.capacity());
}}
