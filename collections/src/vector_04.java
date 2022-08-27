import java.util.Iterator;
import java.util.Vector;
//with generics
public class vector_04 {
    public static void main (String [] args){
        Vector<Integer> v = new Vector();
        v.add(1);
        v.add(1,2);
        v.addElement(null);

        for(Object obj:v){
            System.out.println(obj);
        }
    }
}
