public class BreakExample {
    
    public static void main(String[] args) {
        
        System.out.println("[랜덤 숫자 출력]");
        while(true){
            int num = (int)(Math.random()*6) + 1;

            System.out.println(num);
            System.out.println("* 숫자 6이 나오면 종료됩니다.");
            System.out.println();

            if(num == 6){
                break;
            }
        }
        System.out.println("프로그램 종료");

    }
}
