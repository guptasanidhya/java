import java.sql.*;
import java.io.*;

public class JDBCINSERT
{
public static void main(String ag[]) throws Exception
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con = DriverManager.getConnection("jdbc:odbc:Database1");
String sql ="INSERT INTO EMP VALUES ('NN',2,30000.00,5/6/2013,6)";
Statement st = con.createStatement();
int count = st.executeUpdate(sql); 

System.out.println(count+ " row inserted");
st.close();
con.close();
}


}