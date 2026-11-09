import java.util.Scanner;

public class ScannerExample_2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("- 첫 번째 단어 입력");
        System.out.print(": ");
        String text1 = scanner.nextLine();

        System.out.println("- 두 번째 단어 입력");
        System.out.print(": ");
        String text2 = scanner.nextLine();

        System.out.println();
        System.out.println("------------------------");
        System.out.println();

        if(text1.equals(text2)){
            System.out.println("입력한 두 문자의 내용이 같습니다.");
        }
        else{
            System.out.println("입력한 두 문자의 내용이 같지 않습니다.");
        }

    }
}
