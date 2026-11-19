import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.StringTokenizer;

public class test{

    public static void main(String[] args) {

        String addText = null;
        String[] arr = new String[3];

        int id;
        String title;
        String author;
        
        

        // 파일 읽기

        try{

            String file = "C:/Temp/books.txt";

            FileReader fr = new FileReader(file);

            int readCharNo;
            char[] cbuf = new char[100];
            while ((readCharNo = fr.read(cbuf)) != -1) {
                addText = new String(cbuf, 0 ,readCharNo);
                System.out.print(addText);
            }
            System.out.println();

            fr.close();

            StringTokenizer st = new StringTokenizer(addText, "\t,\n");
            
            int countTokens = st.countTokens();
            for(int i = 0 ; i < countTokens ; i++){
                String token = st.nextToken();
                arr[i] = token;
            }

            for(int i = 0 ; i < 3 ; i++){
                System.out.println(arr[i]);
            }

            id = Integer.parseInt(arr[1]);
            title = arr[1];
            author = arr[2];

            

        }
        catch(Exception e){
            e.printStackTrace();
        }

        



        // 파일 저장

        try{
            String originalFileName = "C:/Temp2/book.txt";
            String targetFileName = "C:/Temp/books.txt";

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

