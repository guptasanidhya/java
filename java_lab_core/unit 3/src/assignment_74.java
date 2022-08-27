class negetiveexception extends Exception{
    negetiveexception(String s){
        super(s);
    }
}

class Age {
    Age(int age)throws negetiveexception{
        if(age<0)
        throw new negetiveexception("age can't be negetive");
    }
}

public class assignment_74 {
    public static void main(String[] args) {
        try{
        Age a= new Age(-15);
    }catch(negetiveexception e){
            System.out.println(e);
        }
    }
}
