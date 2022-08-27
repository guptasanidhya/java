
/*11. Write an application Program to demonstrate Method overloading.
*/

class overloading{
    public void print(){
        System.out.println("print two numbers");
    }
    public void print(int a ,int b){
        System.out.println("print two numbers"+a+" "+b);
    }
    public void print(int a ,char c){
        System.out.println("print two values"+a+" "+c);
    }
    public void print(int a ,int b,int c){
        System.out.println("print two values"+a+" "+b+" "+c);
    }
}
public class assignment_11 {
    public static void main(String[] args) {
        overloading o = new overloading();
        o.print();
        o.print(5,4);
        o.print(4,'c');
        o.print(1,2,3);

    }
}
