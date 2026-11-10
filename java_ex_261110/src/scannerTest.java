import java.util.Scanner;

public class scannerTest {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] text = {"이름", "나이", "주소"};
        String[] reText = new String[text.length];
        int i = 0;
        
        System.out.println();
        System.out.println("[정보 입력 후 출력하기]");
        System.out.println();

        System.out.println("정보를 입력하시겠습니까?");
        System.out.println("1. 네 / 2. 아니오");
        System.out.print(": ");
        String que_1 = scanner.nextLine();
        int num_1 = Integer.parseInt(que_1);

        System.out.println();

        if(num_1 == 1){

            while ( i < text.length ) {

                System.out.println(text[i] + "을(를) 입력해 주세요.");
                System.out.print(": ");
                String strText = scanner.nextLine();
                
                reText[i] = strText;

                i++;
            }

            System.out.println();
            System.out.println("> 입력한 값 출력 < ");
            System.out.println();

            for(int n = 0; n < text.length ; n++){
                System.out.println((n+1) + ". " + text[n]);
                System.out.println(" : " + reText[n]);
            }
                
            System.out.println();
            System.out.println("프로그램이 종료됩니다.");
        }
        else{
            System.out.println("프로그램이 종료됩니다.");
        }
    }

}
