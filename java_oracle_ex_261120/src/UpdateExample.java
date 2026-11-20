import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateExample {
    public static void main(String[] args) {
        
        Connection conn = null;

        try{
            Class.forName("oracle.jdbc.OracleDriver");

            conn = DriverManager.getConnection(
                "jdbc:oracle:thin:@//localhost:1521/XE",
                "system",
                "1234"
            );

            String sql = new StringBuilder()
                .append("UPDATE board SET ")
                .append("btitle=?, ")
                .append("bcontent=?, ")
                .append("bfilename=?, ")
                .append("bfiledata=? ")
                .append("WHERE bno=?")
                .toString();

            // String sql = "" +
            // "UPDATE board SET btitle=?, bcontent=?, bfilename=?, bfiledata=? WHERE bno=?";

            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, "눈");
            pstmt.setString(2, "하늘에서 내리는 눈");
            pstmt.setString(3, "snow.jpg");
            pstmt.setBlob(4, new FileInputStream("C:/Temp/snow.jpg"));
            pstmt.setInt(5, 4);

            int rows = pstmt.executeUpdate();
            System.out.println("수정된 행의 수: " + rows);

            pstmt.close();
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
