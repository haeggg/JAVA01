import java.io.FileReader;

public class FileReaderExample {
    public static void main(String[] args) {
        
        // FileReader

        
        try{

            String file = "C:/jeonhaein/본수업/전해인/03_JAVA 프로그래밍_1119/java01/java_ex_261119/src/FileReaderExample.java";

            FileReader fr = new FileReader(file);

            int readCharNo;
            char[] cbuf = new char[100];
            while ((readCharNo = fr.read(cbuf)) != -1) {
                String data = new String(cbuf, 0 ,readCharNo);
                System.out.print(data);
            }

            fr.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
