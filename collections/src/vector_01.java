import java.util.Iterator;
import java.util.Vector;
//without generics
//add(object) of list
//add(index,object)
//addelement(object)
public class vector_01 {
public static void main (String [] args){
    Vector v = new Vector();
    v.add(1);
    v.add(1,"sanidhya");
    v.addElement(null);

    Iterator itr = v.iterator();
    while(itr.hasNext()){
        System.out.println(itr.next());
    }
}
}
