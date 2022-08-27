
public class assignment_117 extends Thread {

   
    public void run()
    {

 
        System.out.println("Sanidhya ");

   
        try {

           
            Thread.sleep(300);
        }

       
        catch (InterruptedException ie) {
        }

        System.out.println("Gupta ");
    }

 
    public static void main(String[] args)
    {

        assignment_117 c1 = new assignment_117();
        assignment_117 c2 = new assignment_117();

        // Starting threads
        c1.start();
        c2.start();


        System.out.println(c1.isAlive());
        System.out.println(c2.isAlive());
    }
}
