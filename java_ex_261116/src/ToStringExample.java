import java.util.Objects;


public class ToStringExample {
    public static void main(String[] args) {
        
        String str1 = "홍길동";
        String str2 = null;

        System.out.println(Objects.toString(str1));
        System.out.println(Objects.toString(str2));

        System.out.println(Objects.toString(str1, "이름이 없습니다."));
        System.out.println(Objects.toString(str2, "이름이 없습니다."));

        // 첫 번째 매개변수 값이 있으면 toString ( )으로 얻은 값 / 입력되어 있는 값을 리턴
        // 첫 번째 매개변수 값이 없으면 “null” 또는 두 번째 매개값인 nullDefault 리턴

    }
}
