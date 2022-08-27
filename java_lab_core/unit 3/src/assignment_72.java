
public class assignment_72 {
    public static void main(String[] args) {

        int a=10;
        int b=0;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e) {//subclass exception should be above super class exception
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }
        }

    }

