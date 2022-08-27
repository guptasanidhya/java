import java.util.ArrayList;
//using some list methods
public class arraylist_06
{
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add("Sanidhya");
        al.add(1);
        al.add(null);
        al.add("Gupta");
        System.out.println(al);
        al.add(3,24);//indexing at 3
        al.add(3,5);//indexing at 3 and forward
        System.out.println(al);
    }
}
