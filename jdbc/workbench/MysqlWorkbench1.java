import java.sql.*;
import java.io.*;
public class MysqlWorkbench1
{
public static void main(String ag[])
{
Connection con;
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mtech","root","Sanidhya@22");
Statement st = con.createStatement();
st.executeUpdate ("CREATE TABLE EMP3" + "(EMP_Name VARCHAR(32),EMP_ID INTEGER,SALARY FLOAT,DATE_of_HIRED DATE,TOTAL_YEAR INTEGER)");
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