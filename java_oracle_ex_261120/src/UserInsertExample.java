import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsertExample {
    public static void main(String[] args) {

        Connection conn = null;

        try{

            conn = DriverManager.getConnection(
                "jdbc:oracle:thin:@//localhost:1521/XE",
                "system",
                "1234"
            );

            String sql = "" +
            "INSERT INTO users(userid, username, userpassword, userage, usermail)" + "VALUES(?, ?, ?, ?, ?)";

            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, "haein");
            pstmt.setString(2, "전해인");
            pstmt.setString(3, "56789");
            pstmt.setInt(4, 40);
            pstmt.setString(5, "haein@naver.com");

            int rows = pstmt.executeUpdate();
            System.out.println("저장된 행 수: " + rows);

            pstmt.close();
        }
        catch(ClassCastException e){
            e.printStackTrace();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            if(conn != null){
                try{
                    //연결 끊기
                    conn.close();
                    System.out.println("연결 끊기");
                }
                catch(SQLException e){
                    e.printStackTrace();
                }
            }

        }
    }
}
