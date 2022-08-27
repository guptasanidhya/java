
class assignment_115 extends Thread {

    public void run() {

        for (int i = 0; i < 20; i++) {
            System.out.println(
                    i);
        }
    }

    public static void main(String[] args)
    {

        // Creating object of our thread class inside main()
        // method
        assignment_115 myThread = new assignment_115();

        // Starting the thread
        myThread.start();

    }
}
