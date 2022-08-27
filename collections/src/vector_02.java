import java.util.Iterator;
import java.util.Vector;

public class vector_02 {
    public static void main (String [] args){
        Vector v = new Vector();
        v.add(1);
        v.add(1,"sanidhya");
        v.addElement(null);

        for(Object obj:v){
    System.out.println(obj);
        }
        }
    }
