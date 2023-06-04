import java.sql.*;
public class insert {
    static final String DBURL = "jdbc:mysql://localhost/StudentDB";
    static final String USER = "root";
    static final String PASS = "860in@zure";
    static ResultSet rs = null;
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(DBURL, USER, PASS);
            Statement stmt = conn.createStatement();
            
            //Execute a query
            String sql = "INSERT INTO Registration VALUES (101, 'Abhi', 'Gupta', 21)";
            stmt.executeUpdate(sql);
            
            sql = "INSERT INTO Registration VALUES(105, 'Dev', 'Mishra', 21)";
            stmt.executeUpdate(sql);
            
            System.out.println("Inserted records into the table...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
}

