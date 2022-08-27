import java.util.Stack;

public class stack_06 {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(5);
        s.push(3);
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.empty());
        System.out.println(s.capacity());
        System.out.println(s.size());
        System.out.println(s.get(2));
    }
}
