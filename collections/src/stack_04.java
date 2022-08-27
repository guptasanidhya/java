import java.util.Stack;

public class stack_04 {
    public static void main(String[] args) {
    Stack s = new Stack();
        s.push(1);
        s.push(5);
        s.push(3);
        System.out.println(s);
        for(Object obj:s){
        System.out.println(obj);
    }
}
}
