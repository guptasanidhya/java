import java.sql.*;
import java.io.*;

public class jdbc_02
{
    public static void main(String ag[]) throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mtech","root","Sanidhya@22");
        String sql ="INSERT INTO USER VALUES (2,'Sanidhya','Gupta',6)";
        Statement st = con.createStatement();
        int count = st.executeUpdate(sql);

        System.out.println(count+ " row inserted");
        st.close();
        con.close();
    }


}