import java.util.Scanner;
public class assignment_5 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = Input.nextInt();
        System.out.println("Enter the Second number");
        int b = Input.nextInt();

        if (a%b==0){
            System.out.println("A is multiple of B");
        }
        else{
            System.out.println("A is not multiple of B");
        }
    }
}
