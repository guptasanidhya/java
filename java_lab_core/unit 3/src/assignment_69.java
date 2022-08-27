public class assignment_69 {
    public static void main(String[] args) {
        String b="56";
        String s="fifty6";
        try{

            int d = Integer.parseInt(b);
            System.out.println(d);
            int a = Integer.parseInt(s);
            System.out.println(a);


        }catch(NumberFormatException e){
            System.out.println(e);
        }
    }
}
