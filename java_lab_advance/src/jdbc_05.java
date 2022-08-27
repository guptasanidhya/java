import java.sql.*;

public class jdbc_05 {
    public static void main(String ag[]) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mtech", "root", "Sanidhya@22");
        Statement st = con.createStatement();
        PreparedStatement p = null;
        ResultSet rs = null;
        // SQL command data stored in String datatype
        String sql = "select * from USER where USER_ID=2";
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