import java.util.Iterator;
import java.util.Stack;

public class stack_03 {
    public static void main(String[] args) {
        Stack s = new Stack();
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
