import java.util.LinkedHashSet;

public class linkedhashset_01 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        lhs.add(5);
        lhs.add(4);
        lhs.add(3);
        lhs.add(2);
        lhs.add(5);
        System.out.println(lhs);
        for(Object obj:lhs){
            System.out.println(obj);

        }    }
}
