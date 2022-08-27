import java.io.FileWriter;
public class assignment_95{
    public static void main(String args[]){
        try{
            FileWriter fw=new FileWriter("E:\\Etexthere.txt");
            fw.write("Welcome To IIPS");
            fw.close();
        }catch(Exception e){System.out.println(e);}
        System.out.println("Success...");
    }
} 