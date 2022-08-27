// Java Program to rename a file
import java.io.File;
public class assignment_97 {
    public static void main(String[] args)
    {
        // Create an object of the File class
        // Replace the file path with path of the directory
        File file = new File("E:\\Etexthere.txt");


        File rename = new File("E:\\textonly.txt");


        boolean flag = file.renameTo(rename);

        // if renameTo() return true then if block is
        // executed
        if (flag == true) {
            System.out.println("File Successfully Rename");
        }
        // if renameTo() return false then else block is
        // executed
        else {
            System.out.println("Operation Failed");
        }
    }
}
