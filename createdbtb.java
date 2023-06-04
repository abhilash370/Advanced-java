import java.sql.*;
public class createdbtb {
    static final String DBURL = "jdbc:mysql://localhost/StudentDB";
    static final String USER = "root";
    static final String PASS = "860in@zure";

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(DBURL, USER, PASS);
            Statement stmt = conn.createStatement();
            String sql = "CREATE TABLE REGISTRATION " +
                    "(id INTEGER not NULL, " +
                    "first VARCHAR(255), " +
                    "last VARCHAR(255), " +
                    "age INTEGER, " +
                    "PRIMARY KEY (id))";
            stmt.executeUpdate(sql);
            System.out.println("Created table in database...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
