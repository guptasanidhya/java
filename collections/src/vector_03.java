import java.util.Iterator;
import java.util.Vector;
//generics
public class vector_03 {
    public static void main (String [] args){
        Vector<String> v = new Vector();
        v.add("Sanskar");
        v.add(1,"sanidhya");
        v.addElement(null);

        Iterator itr = v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
