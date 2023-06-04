import java.sql.*;

public class hello {
    final static String DB_URL = "jdbc:mysql://localhost/";
    final static String USER = "root";
    final static String PWD = "860in@zure";

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PWD);
            Statement stmt = conn.createStatement();
            String strQuery = "CREATE DATABASE StudentDB";
            stmt.execute(strQuery);
            System.out.println("Create Successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
