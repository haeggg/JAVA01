import java.io.FileInputStream;

public class FileInputExample {
    public static void main(String[] args) {
        
        // FileInputStream
        // 파일로부터 바이트 단위로 읽어들일 때 사용

        try{
            FileInputStream fis = new FileInputStream("C:\\jeonhaein\\본수업\\전해인\\03_JAVA 프로그래밍_1119\\java01\\java_ex_261119\\src\\FileInputExample.java");
            
            int data;

            while ((data = fis.read()) != -1) {
                //

                System.out.write(data);
                // println으로 출력하면 문자 개별 아스키코드가 출력
                // write로 출력해서 파일 안에 있는 문자 그대로 출력
            }

            fis.close();
        
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
