import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {
    public static void main(String[] args) throws Exception {
        
        // FileOutputStream
        // 파일에 바이트 단위로 데이터를 저장할 때 사용
        // 파일이 이미 존재할 경우, 데이터를 출력하게 되면 파일을 덮어쓰는 단점이 있음 

        try{
            String originalFileName = "C:/jeonhaein/본수업/전해인/03_JAVA 프로그래밍_1119/java01/java_ex_261119/cat.jpg";
            String targetFileName = "C:/Temp/cat.jpg";

            FileInputStream fis = new FileInputStream(originalFileName);
            FileOutputStream fos = new FileOutputStream(targetFileName);

            int readByteNo;
            byte[] readBytes = new byte[100];
            while ((readByteNo = fis.read(readBytes)) != -1) {
                fos.write(readBytes, 0, readByteNo);
            }

            fos.flush();
            fos.close();
            fis.close();

            System.out.println("복사가 잘 되었습니다.");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
