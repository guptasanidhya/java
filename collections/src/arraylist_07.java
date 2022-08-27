import java.util.ArrayList;
//using some methods of arraylist like add,get
public class arraylist_07 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("sanidhya");
        al.add("nitin");
        al.add("mohini");
        al.add("deepak");
        Object objectat=(al.get(3));//getting object at index 3
        System.out.println(objectat);
    }
}
