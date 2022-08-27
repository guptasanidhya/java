// Java program to delete a file
import java.io.*;

public class assignment_91
{
    public static void main(String[] args)
    {
        File file = new File("E:\\Etexthere.txt");

        if(file.delete())
        {
            System.out.println("File deleted successfully");
        }
        else
        {
            System.out.println("Failed to delete the file");
        }
    }
}
