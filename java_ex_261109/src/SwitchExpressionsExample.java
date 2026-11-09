public class SwitchExpressionsExample {
    
    public static void main(String[] args) {
        
        char grade = 'B';

        /*

        람다 식(Lambda Expression) ->
        : 로그래밍 언어에서 이름이 없는 함수(익명 함수, Anonymous Function)를
          간결하게 표현하기 위한 개념
          
        */

        switch (grade) {
            case 'A', 'a'-> {
                System.out.println("우수 회원입니다.");
            }
            
            case 'B', 'b'-> {
                System.out.println("일반 회원입니다.");
            }

            default -> {
                System.out.println("손님입니다.");
            }
        }

        switch (grade) {
            case 'A', 'a'-> System.out.println("우수 회원입니다.");
            
            case 'B', 'b'-> System.out.println("일반 회원입니다.");

            default -> System.out.println("손님입니다.");

            // 명령어가 한 줄일 경우 중문 삭제 가능
            // 근데 추천하는 방법은 아님
        }
    }
}
