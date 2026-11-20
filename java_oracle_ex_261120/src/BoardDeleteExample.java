import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardDeleteExample {
    public static void main(String[] args) {
        
        Connection conn = null;

        try{

            Class.forName("oracle.jdbc.OracleDriver");

            conn = DriverManager.getConnection(
                "jdbc:oracle:thin:@//localhost:1521/XE",
                "system",
                "1234"
            );

            String sql = "DELETE FROM board WHERE bno=?";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, 5);

            int rows = pstmt.executeUpdate();
            System.out.println("삭제된 행 수: " + rows);

            pstmt.close();

        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                if(conn != null){
                    conn.close();
                }
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
    }
}
