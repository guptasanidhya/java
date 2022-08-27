import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbc_06 {
    //UPDATE `members` SET `contact_number` = '0759 253 542' WHERE `membership_number` = 1;
    public static void main(String ag[]) throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mtech","root","Sanidhya@22");
        String sql ="UPDATE user " +
                "SET USER_Name = 'ABC',AGE='22',PASS='ABCC'" +
                " WHERE USER_ID=2";;
        Statement st = con.createStatement();
        int count = st.executeUpdate(sql);

        System.out.println(count+ " row updated");
        st.close();
        con.close();
    }
}
