import java.util.Iterator;
import java.util.Stack;

public class stack_01 {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack();
        s.push(1);
        s.push(5);
        s.push(3);
        System.out.println(s);
        Iterator itr = s.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
