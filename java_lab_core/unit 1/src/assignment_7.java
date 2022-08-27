class factorial{
    int fac(int n){
       if (n>0){
           return n*fac(n-1);
       }
       else{
           return 1;
       }
    }
}
public class assignment_7 {

    public static void main(String[] args) {
            factorial f = new factorial();
            int result=f.fac(5);
            System.out.println(result);
        }
    }

