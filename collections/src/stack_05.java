import java.util.Stack;
//push()
//pop()
public class stack_05 {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(5);
        s.push(3);
        System.out.println(s);
        s.pop();
        System.out.println(s);
        s.remove(0);
        System.out.println(s);
}}
