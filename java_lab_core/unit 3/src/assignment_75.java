public class assignment_75 {

    public static void one() throws Exception{
       try{two();}catch(Exception e){
           System.out.println("going one to main");
           throw e;
       };
    }

    public static void two() throws Exception{
        System.out.println("going two to one");
        throw new Exception ("this is a exception");
    }


    public static void main(String[] args) {
        try{one();}catch(Exception e){
            System.out.println(e);
        };
    }
}
