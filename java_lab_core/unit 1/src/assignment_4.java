import java.util.Scanner;
public class assignment_4 {
    public static void main(String[] args) {
        int n;
        double avg;
        Scanner input = new Scanner(System.in);
        System.out.println("how many elements you want to enter");
        n=input.nextInt();
        float a[] = new float[n];
        System.out.println("Enter the "+ n +" elements");
        for(int i = 0;i<a.length;i++){
            a[i]=input.nextFloat();
        }
        float sum=0;
        for(int j=0;j<a.length;j++){
            sum=sum+a[j];
        }
        avg=sum/a.length;
        System.out.println("avg"+avg);

    }
}
