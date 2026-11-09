public class IfDiceExample {
    public static void main(String[] args) {
        int num = (int)(Math.random()*6) + 1;
        
        // randon 은 0.0 ~ 0.9 사이의 값 
        // 0.0 * 6 = 0.0 ~ 0.9 * 6 = 5.4
        // int로 변환 0 ~ 5
        // 0 + 1 = 1 ~ 5 + 1 = 6
        // randon은 1에서 6 사이의 값이 나옴

        if(num == 1){
            System.out.println("1번이 나왔습니다.");
        }
        else if(num == 2){
            System.out.println("2번이 나왔습니다.");
        }
        else if(num == 3){
            System.out.println("3번이 나왔습니다.");
        }
        else if(num == 4){
            System.out.println("4번이 나왔습니다.");
        }
        else if(num == 5){
            System.out.println("5번이 나왔습니다.");
        }
        else{
            System.out.println("6번이 나왔습니다.");
        }
    }
}
