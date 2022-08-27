import java.sql.*;
import java.io.*;
import java.util.*;

public class jdbc_03
{
    public static void main(String ag[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values");
        System.out.print("unique id:");
        int id=sc.nextInt();
        System.out.print("Name:");
        String name=sc.next();
        System.out.print("password:");
        String password=sc.next();
        System.out.print("AGE:");
        int AGE=sc.nextInt();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mtech","root","Sanidhya@22");
        String sql ="INSERT INTO USER VALUES ('"+id+"','"+name+"','"+password+"','"+AGE+"')";
        Statement st = con.createStatement();
        int count = st.executeUpdate(sql);

        System.out.println(count+ " row inserted");
        st.close();
        con.close();
    }


}