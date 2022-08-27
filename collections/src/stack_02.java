import java.util.Stack;

public class stack_02 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack();
        s.push(1);
        s.push(5);
        s.push(3);
        System.out.println(s);
        for(Integer obj:s){
            System.out.println(obj);
        }
}}
