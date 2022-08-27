import java.util.*;
//without using generics and foreach method
public class arraylist_04 {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(1);
        al.add("nicee");
        al.add("Sanidhya");

        for(Object obj:al){
            System.out.println(obj);
        }
    }
}
