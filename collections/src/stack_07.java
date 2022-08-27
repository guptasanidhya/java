import java.util.Stack;
//size
//capacity
//empty
public class stack_07 {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(5);
        s.push(3);
        System.out.println(s);
        System.out.println(s.empty());
        System.out.println(s.capacity());
        System.out.println(s.size());
    }
}
