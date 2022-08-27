import java.sql.SQLOutput;

 class person_age {
    person_age(int age) {
       try{
        if(age<18) {
           throw new ArithmeticException("invalid age");

        }
        }catch(Exception e){
           System.out.println(e);
       }
       finally {
           System.out.println("finally end");
       }
    }
}

class assignment_73{
    public static void main(String[] args) {
        person_age p = new person_age(15);
    }
}