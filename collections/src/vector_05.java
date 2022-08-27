import java.util.Iterator;
import java.util.Vector;
//all the remove methods of collection and vector
public class vector_05 {
    public static void main (String [] args){
        Vector v = new Vector();
        v.add(1);
        v.add(5);
        v.add(6);
        v.add(7);
        v.add(1,"sanidhya");
        v.addElement(null);
        System.out.println(v);
        v.remove((Object)1);
        v.removeElement(6);
        v.remove(1);
        v.removeElementAt(2);
        System.out.println(v);
        v.clear();
        System.out.println(v);
        v.add(10);
        System.out.println(v);
        v.removeAllElements();
        System.out.println(v);

    }
}
