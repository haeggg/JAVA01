
import java.util.Scanner;

public class java_test_1109 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("▷ 사칙연산 계산기 ◁");
        System.out.println();

        // 첫 번째 값
        System.out.print("▶ 첫 번쨰 값 입력: ");
        String num_1 = scanner.nextLine();

        int num_int_1 = Integer.parseInt(num_1);

        // 첫 번째 값
        System.out.print("▶ 두 번째 값 입력: ");
        String num_2 = scanner.nextLine();

        int num_int_2 = Integer.parseInt(num_2);

        // 입력 값 출력

        System.out.println();

        System.out.println("▷ 입력된 첫 번째 값: " + num_1 + " ◁");
        System.out.println("▷ 입력된 두 번째 값: " + num_2 + " ◁");

        // 입력 값 계산 후 출력

        System.out.println();

        int result = num_int_1 + num_int_2;
        System.out.println("ⓐ + 값 : " + result);

        result = num_int_1 - num_int_2;
        System.out.println("ⓑ - 값 : " + result);

        result = num_int_1 * num_int_2;
        System.out.println("ⓒ x 값 : " + result);

        result = num_int_1 / num_int_2;
        System.out.println("ⓓ ÷ 값 : " + result);

        result = num_int_1 % num_int_2;
        System.out.println("* 나머지 값 : " + result);


    }
}
