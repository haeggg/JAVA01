// import java.io.FileInputStream;
// import java.io.FileReader;
import java.util.*;

public class BookTest {
    public static void main(String[] args) {
        
        Book book = new Book();

        Scanner scanner = new Scanner(System.in);

        
        // books.txt 데이터 초기화 (Load)

        System.out.println();

        book.loadFromFile();

        // 메뉴 선택 후 기능

        // System.out.println();

        // System.out.println("> 메뉴 선택");
        // System.out.println("1. 도서 등록 / 2. 도서 조회");
        // String menuPick = scanner.nextLine();

        // int menuNum = Integer.parseInt(menuPick);

        
        // if(menuNum == 1){
        //     // book.txt 파일 받기 / 도서 정보 등록 (Add)

        //     System.out.println();

        //     System.out.println("> 추가할 book.txt 파일의 위치를 입력하세요.");
        //     String resource = scanner.nextLine();

        //     book.addItem(resource);

        // }
        // else if (menuNum == 2) {
        //     // 전체 목록 조회 (List)

            
        // }


    }
}
