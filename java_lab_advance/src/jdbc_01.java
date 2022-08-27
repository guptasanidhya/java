import java.sql.*;
import java.io.*;
public class jdbc_01
{
    public static void main(String ag[])
    {
        Connection con;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mtech", "root", "Sanidhya@22");
            Statement st = con.createStatement();
            st.executeUpdate("CREATE TABLE USER" + "(USER_ID INTEGER,USER_Name VARCHAR(32),PASS VARCHAR(30),AGE INTEGER)");
        }
        catch(ClassNotFoundException e)

        {
            System.out.println(e.toString());

        }

        catch(SQLException e)
        {
            System.out.println(e.toString());
        }
    }

}