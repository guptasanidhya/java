// Java program to demonstrate
// length() method of File Class

import java.io.*;

public class assignment_98{
    public static void main(String args[])
    {

        // Get the file
        File f = new File("F:\\textonly.txt");

        // Get the length of the file
        System.out.println("length: "
                + f.length());
    }
}
