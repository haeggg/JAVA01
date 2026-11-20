import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsertExample3 {
    public static void main(String[] args) {

        Connection conn = null;

        try{

            conn = DriverManager.getConnection(
                "jdbc:oracle:thin:@//localhost:1521/XE",
                "system",
                "1234"
            );

            String sql = "" +
            "INSERT INTO user2(userId, userName, userPassword, userAge, userEmail)" + "VALUES(?, ?, ?, ?, ?)";

            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, "bbb");
            pstmt.setString(2, "bag");
            pstmt.setString(3, "bbb222");
            pstmt.setInt(4, 21);
            pstmt.setString(5, "bbb@naver.com");

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
        catch(Exception e){
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
