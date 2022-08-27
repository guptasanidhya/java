import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbc_07 {
    public static void main(String ag[]) throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mtech","root","Sanidhya@22");
        String sql ="delete from USER where USER_ID='2'";
        Statement st = con.createStatement();
        int count = st.executeUpdate(sql);

        System.out.println(count+ " row deleted");
        st.close();
        con.close();
    }
}
