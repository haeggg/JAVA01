import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserSelectExample {
    
    public static void main(String[] args) {
        
        Connection conn = null;

        try{

            Class.forName("oracle.jdbc.OracleDriver");

            conn = DriverManager.getConnection(
                "jdbc:oracle:thin:@//localhost:1521/XE",
                "system",
                "1234"
            );

            String sql = "" +
            "SELECT userid, username, userpassword, userage, usermail "
            + "FROM user2 "
            + "WHERE userid=?";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "aaa");

            ResultSet rs = pstmt.executeQuery();

            if(rs.next()){
                User2 user = new User2();

                user.setUserId(rs.getString("userid"));
                user.setUserName(rs.getString("username"));
                user.setUserPassword(rs.getString("userpassword"));
                user.setUserAge(rs.getInt(4));
                user.setUserEmail(rs.getString(5));
            }


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
