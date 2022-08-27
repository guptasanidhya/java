//removeeeeeeeee

import java.util.*;
public class arraylist_08 {
    public static void main(String [] args){
        ArrayList al=new ArrayList();
        al.add("sanidhya");
        al.add("nitin");
        al.add(3);
        al.add("mohini");
        al.add("deepak");
        System.out.println(al);
        al.remove("nitin");//object.remove(object)
        al.remove((Integer)3);//object.remove(object)casting object to integer
        System.out.println(al);
        al.remove(2);//object.remove(using index)

        Iterator itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        }
    }

