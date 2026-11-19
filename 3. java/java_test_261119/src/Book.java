import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class Book implements Manageable{

    private int id; // 도서 식별 번호
    private String title; // 도서 제목
    private String author; // 저자명

    private String[] mainTitle = {"ID","제목","저자"};

    private String resource;
    private String addText = null;

    List<String> list = new ArrayList<String>();

    String[][] book = new String[100][3];

    Book(){    }
    
    public void toFileString(){
        // 메서드 구현 | 저장 시 사용할 CSV 포맷 문자열 반환 메서드


    }

    /*

    @Override
    public void addItem(String resource) {

        this.resource = resource;
        
        try{
            
            //  = "C:/Temp/book.txt";
            FileReader fr = new FileReader(resource);

            int readCharNo;
            char[] cbuf = new char[100];

            while ((readCharNo = fr.read(cbuf)) != -1) {
            
                addText = new String(cbuf, 0, readCharNo);
                // 파일 String 변수에 저장
            }

            fr.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }


            StringTokenizer st = new StringTokenizer(addText, "\t,\n");
            
            int countTokens = st.countTokens();
            for(int i = 0 ; i < countTokens ; i++){
                for(int n = 0 ; n < 3 ; n++){
                    String token = st.nextToken();
                    book[i][n] = token;
                }
                        
            }


            // 값 입력 확인용 출력

            
            System.out.println();
            System.out.println("ID" + "\t" + "제목" + "\t" + "저자");
            System.out.println("---------------------------------");
            for(int i = 0 ; i < book.length ; i++){
                for(int n = 0 ; n < 3 ; n++){
                    if (book[i][n] != null) {
                        System.out.println(mainTitle[n] + book[i][n]);
                    }
                }
                System.out.println();
            }

            System.out.println();
            System.out.println("> 도서가 등록되었습니다.");

            saveToFile();
            
            
        }
    
    
    @Override
    public void displayAll() {
        
    }

    

    @Override
    public void saveToFile() {

        try{
            String addBookResource = resource;
            String originalBookResource = "C:/Temp/books.txt";

            FileInputStream fis = new FileInputStream(addBookResource);
            FileOutputStream fos = new FileOutputStream(originalBookResource);

            int readByteNo;
            byte[] readBytes = new byte[100];
            while ((readByteNo = fis.read(readBytes)) != -1) {
                fos.write(readBytes, 0, readByteNo);
            }

            fos.flush();
            fos.close();
            fis.close();

            System.out.println("도서가 모두 저장되었습니다.");

        }
        catch (Exception e){
            e.printStackTrace();
        }
        

    }

    */

    @Override
    public void loadFromFile() {
        
        try{

            FileReader fr = new FileReader("C:/Temp/books.txt");
            
            int readCharNo;
            char[] cbuf = new char[100];

            while ((readCharNo = fr.read(cbuf)) != -1) {
                addText = new String(cbuf, 0, readCharNo);
                // 파일 String 변수에 저장
            }

            fr.close();

            StringTokenizer st = new StringTokenizer(addText, "\t,\n");
            
            int countTokens = st.countTokens();
            for(int i = 0 ; i < countTokens ; i++){
                String token = st.nextToken();
                list.add(token);
            }

            for(int i = 0 ; i < 3 ; i++){
                for(int n = 0 ; n < 3 ; n++){
                    
                    book[i][n] = list.get(0);
                    list.remove(0);

                }
            }

            System.out.println("===== LIBRARY SYSTEM =====");

            // 값 확인용

            // System.out.println();
            // System.out.println("ID" + "\t" + "제목" + "\t" + "저자");
            // System.out.println("---------------------------------");
            // for(int i = 0 ; i < book.length ; i++){
            //     for(int n = 0 ; n < 3 ; n++){
            //         if (book[i][n] != null) {
            //             System.out.println(mainTitle[n] + ":"+ book[i][n]);
            //         }
            //     }
            //     System.out.println();
            // }
        }
        catch(Exception e){
            e.printStackTrace();
        }

 

    }


}
