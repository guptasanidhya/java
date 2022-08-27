import java.sql.*;
import java.io.*;

public class mysqlworkbenchinsert
{
public static void main(String ag[]) throws Exception
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mtech","root","Sanidhya@22");
String sql ="INSERT INTO EMP3 VALUES ('NN',2,30000.00,5/6/2013,6)";
Statement st = con.createStatement();
int count = st.executeUpdate(sql); 

System.out.println(count+ " row inserted");
st.close();
con.close();
}


}