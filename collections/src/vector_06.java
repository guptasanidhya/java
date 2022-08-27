import java.util.Vector;
//all get methods of collection and vector
public class vector_06 {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(1);
        v.add(5);
        v.add(6);
        v.add(7);
        v.add(1, "sanidhya");
        v.addElement(null);
        System.out.println(v);
        System.out.println(v.get(5));
        System.out.println(v.elementAt(3));

        System.out.println(v.firstElement());

        System.out.println(v.lastElement());
    }
}