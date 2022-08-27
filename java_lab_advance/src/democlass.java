import java.util.*;
public class democlass {
    public static void main(String[] args) {
        Set<String> ss=new TreeSet<>();

        ss.add("s1");
        ss.add("s2");
        ss.add("s3");
        ss.add("s4");
        ss.add("s5");
        ss.add("s6");
        ss.add("s7");
        ss.add("s8");
        ss.add("s9");
        ss.add("s10");
        ss.add("s11");
        ss.add("s12");
        ss.add("s13");
        ss.add("s14");
        ss.add("s15");
        ss.add("s16");
        ss.add("s17");
        ss.add("s18");
        ss.add("s19");
        ss.add("s20");

        Iterator itr = ss.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
