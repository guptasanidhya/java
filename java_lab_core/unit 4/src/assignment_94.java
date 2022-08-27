
// moving a file permanently to a new location
import java.io.*;
import java.nio.file.Files;
import java.nio.file.*;

public class assignment_94
{
    public static void main(String[] args) throws IOException
    {
        Path temp = Files.move
                (Paths.get("E:\\Etexthere.txt"),
                        Paths.get("E:\\study\\Etexthere.txt"));

        if(temp != null)
        {
            System.out.println("File renamed and moved successfully");
        }
        else
        {
            System.out.println("Failed to move the file");
        }
    }
}
