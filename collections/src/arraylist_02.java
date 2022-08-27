
//using generics and foreach method
import java.util.ArrayList;

public class arraylist_02 {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>();
        al.add("Sanidhya");
        al.add("Nitin");
        al.add("Muskan");
        al.add("Mohini");
        for(String obj:al){
            System.out.println(obj);
        }

    }
}
