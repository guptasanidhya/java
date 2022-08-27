import java.util.HashSet;

public class hashset_07 {
    public static void main(String[] args) {
        HashSet hs1 = new HashSet();
        hs1.add(5);
        hs1.add(4);
        hs1.add(3);
        hs1.add(2);
        System.out.println(hs1);
        HashSet hs2= new HashSet(hs1);
        hs2.add(11);
        hs2.add(5);
        System.out.println(hs2);
        for(Object obj:hs2){
            System.out.println(obj);
        }
    }
}
