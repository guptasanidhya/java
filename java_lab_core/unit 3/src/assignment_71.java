import java.io.*;
public class assignment_71 {
        public static void main(String[] args) {
            try{
                FileInputStream fin =new FileInputStream("test.txt");
                int i = fin.read();
                System.out.println((char)i);
                fin.close();

            }catch(IOException e){
                System.out.println(e);
            }
        }
}
