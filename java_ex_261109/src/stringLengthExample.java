import java.util.Scanner;

public class stringLengthExample {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("영어로 된 첫 번째 문장을 입력하세요.");
        System.out.print(": ");
        String text1 = scanner.nextLine();

        System.out.println("영어로 된 두 번째 문장을 입력하세요.");
        System.out.print(": ");
        String text2 = scanner.nextLine();

        System.out.println("첫 번째 입력된 문장은 '" + text1 + "' 입니다.");
        System.out.println("첫 번쨰 입력된 문장의 글자수는 " + text1.length() + " 입니다.");


        System.out.println("두 번째 입력된 문장은 '" + text2 + "' 입니다.");
        System.out.println("두 번쨰 입력된 문장의 글자수는 " + text2.length() + " 입니다.");

        String result = text1 + " " + text2;
        System.out.println("입력된 두 문장을 합치면 '" + result + "' 입니다.");

    }
}
