import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample{
    public static void main(String[] args) throws Exception {

        // InputStreamReader
        // 콘솔에서 문자 입력 받기 | 문자 변환 보조 스트림

        try{
            InputStream is = System.in;
            Reader reader = new InputStreamReader(is);

            int readCharNo;
            char[] cbuf = new char[100];

            while ((readCharNo = reader.read(cbuf)) != -1) {
                String data = new String(cbuf, 0, readCharNo);
                System.out.println(data);
            }

            reader.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
