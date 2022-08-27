import java.io.File;
public class assignment_93{
    public static void main(String[] args) {
        try {
            File file = new File("E://Etexthere.txt");

            System.out.println("Is directory? " + file.isDirectory());
            System.out.println("Is file? " + file.isFile());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}