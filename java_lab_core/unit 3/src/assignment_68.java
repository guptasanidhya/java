public class assignment_68 {
    public static void main (String[] args)
    {

        String s = null;


        try
        {
            if (s.equals("Sanidhya"))
                System.out.print("Same");
            else
                System.out.print("Not Same");
        }
        catch(NullPointerException e)
        {
            System.out.print("NullPointerException");
        }
    }
}


//    String s = null;


//        try
//                {
//                if ("Sanidhya".equals(s))
//                System.out.print("Same");
//                else
//                System.out.print("Not Same");
//                }
//                catch(NullPointerException e)
//                {
//                System.out.print(" NullPointerException");
//                }
//                }