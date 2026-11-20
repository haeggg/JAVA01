import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsertExample2 {
    public static void main(String[] args) {

        Connection conn = null;

        try{

            conn = DriverManager.getConnection(
                "jdbc:oracle:thin:@//localhost:1521/XE",
                "system",
                "1234"
            );

            String sql = "" +
            "INSERT INTO board(bno, btitle, bcontent, bfilename, bfiledata)" + "VALUES(?, ?, ?, ?, ?)";

            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, 5);
            pstmt.setString(2, "타이틀");
            pstmt.setString(3, "콘텐츠");
            pstmt.setString(4, "파일 이름");
            pstmt.setBlob(5, new FileInputStream("C:/Temp/snowman.jpg"));

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
