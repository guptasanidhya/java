import java.io.File;
public class assignment_92{
    public static void main(String[] args) {
        try {
            File file = new File("E://Etexthere.txt");
            file.createNewFile();
            System.out.println(file.exists());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}