import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        
        // Scanner
        // 콘솔로부터 기본 타입이 값을 바로 읽을 수 있음

        // 숫자를 입력받을 때 엔터 값 주의
        //  (숫자를 받고 String을 받을 때 숫자에 들어가지 못한 엔터 문자가)

        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열 입력: ");
        String inputString = scanner.nextLine();

        System.out.println("inputString: " + inputString);
        System.out.println();

        System.out.print("정수 입력: ");
        String inputInt = scanner.nextLine();

        System.out.println("inputInt: " + inputInt);
        System.out.println();

        System.out.print("실수 입력: ");
        String inputDouble = scanner.nextLine();

        System.out.println("inputDouble: " + inputDouble);
    }
}
