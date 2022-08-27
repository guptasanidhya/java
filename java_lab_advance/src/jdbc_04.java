import java.sql.*;
import java.io.*;

public class jdbc_04
{
    public static void main(String ag[]) throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mtech","root","Sanidhya@22");
        Statement st = con.createStatement();
        PreparedStatement p = null;
        ResultSet rs = null;
        // SQL command data stored in String datatype
        String sql = "select * from USER";
        p = con.prepareStatement(sql);
        rs = p.executeQuery();

        // Printing ID, name, email of customers
        // of the SQL command above
        System.out.println("id\t\tname\t\tPASS\t\tAGE");

        // Condiion check
        while (rs.next()) {

            int id = rs.getInt("USER_ID");
            String name = rs.getString("USER_NAME");
            String PASS = rs.getString("PASS");
            int AGE = rs.getInt("AGE");
            System.out.println(id + "\t\t" + name
                    + "\t\t" + PASS+ "\t\t" + AGE);
        }
            st.close();
        con.close();
    }


}
/*

 * Please note :

 * ResultSet API provides appropriate methods for retrieving data

 * based on each column data type e.g.

 *

 * boolean bool = rs.getBoolean("test_col");

 * byte b = rs.getByte("test_col");

 * short s = rs.getShort("test_col");

 * int i = rs.getInt("test_col");

 * long l = rs.getLong("test_col");

 * float f = rs.getFloat("test_col");

 * double d = rs.getDouble("test_col");

 * BigDecimal bd = rs.getBigDecimal("test_col");

 * String str = rs.getString("test_col");

 * Date date = rs.getDate("test_col");

 * Time t = rs.getTime("test_col");

 * Timestamp ts = rs.getTimestamp("test_col");

 * InputStream ais = rs.getAsciiStream("test_col");

 * InputStream bis = rs.getBinaryStream("test_col");

 * Blob blob = rs.getBlob("test_col");

 */