public class SwitchCharExample {
    
    public static void main(String[] args) {
        
        char grade = 'B';

        switch (grade) {
            case 'A':
            case 'a':
                System.out.println("우수 회원입니다.");
                break;

            case 'B':
            case 'b':
                // B 66 / b 98 대문자 B부터 적어줘야 함
                
                System.out.println("일반 회원입니다.");
                break;
        
            default:
                System.out.println("손님입니다.");
                break;
        }
    }
}
