import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterExample {
    public static void main(String[] args) throws Exception{
        
        // OutputStreamWriter
        // 문자 변환 보조 스트림
        
        try{

            FileOutputStream fos = new FileOutputStream("C:/Temp/test.txt");
            Writer writer = new OutputStreamWriter(fos);

            String data = "나의 꿈과 희망";
            writer.write(data);

            writer.flush();
            writer.close();
            System.out.println("> 파일이 저장되었습니다.");

        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
