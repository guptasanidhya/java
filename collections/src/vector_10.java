import java.sql.SQLOutput;
import java.util.Vector;

public class vector_10 {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(1);
        v.add(5);
        v.add(6);
        v.add(7);
        v.add(1, "sanidhya");
        v.addElement(null);
        System.out.println("oldvector"+v);
        Vector v2=new Vector(v);
        v2.add(100);
        System.out.println("newvector"+v2);
}}
