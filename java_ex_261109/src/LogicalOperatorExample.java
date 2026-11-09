public class LogicalOperatorExample {
    public static void main(String[] args) {
        
        int charCode = 'A';

        if((charCode >= 65) & (charCode <= 90)){
            System.out.println("대문자입니다.");
        }
        else{
            System.out.println("소문자입니다.");
        }

        if (!(charCode < 48) && !(charCode > 57)) {
            System.out.println("0~9 숫자입니다.");
        }
        else{
            System.out.println("0~9 숫자 외 다른 문자입니다.");
        }

        int value = 6;

        if((value % 2 == 0) | (value % 3 == 0)){
            System.out.println("2또는 3의 배수입니다.");
        }
        else{
            System.out.println("2또는 3의 배수가 아닙니다.");
        }
    }
}
