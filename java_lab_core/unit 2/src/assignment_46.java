import java.util.Scanner;
class methods{

    double add(int a ,int b ,int c){
        return a+b+c;
    }
    double mul(int a ,int b ,int c){
        return a*b*c;
    }

    double avg(double addition){
        return addition/3;
    }
   void sort(int a ,int b,int c){
        int arr[]=new int[3];
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;

        for(int i=0;i<3;i++){
            boolean flag=false;
            for(int j=0;j<(3-i-1);j++){
             if(arr[j]>arr[j+1]){
                 flag=true;
                 int temp=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
             }
            }
            if(flag==false) {
                break;
            }
            }
        System.out.print("smallest number "+arr[0]+" largest number "+arr[arr.length-1]);
            }
        }

public class assignment_46 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int input1=sc.nextInt();
        int input2=sc.nextInt();
        int input3=sc.nextInt();
        methods m= new methods();
       double addition=m.add(input1,input2,input3);
       double multiply=m.mul(input1,input2,input3);
       double average= m.avg(addition);
       System.out.println(addition+" "+multiply+" "+average);
        m.sort(input1,input2,input3);
    }
}
