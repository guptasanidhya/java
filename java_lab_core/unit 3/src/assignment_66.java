import java.util.Scanner;


public class assignment_66 {
    public static void main(String[] args) {
        System.out.println("enter two numbers");

            Scanner sc = new Scanner(System.in);
//            int a = sc.nextInt();
//            int b = sc.nextInt();
            double a = sc.nextDouble();
            double b = sc.nextDouble();
        try{

            System.out.println(a/b);
        }catch(Exception e) {
            System.out.println("Wrong input"+e);
        }

    }
}
