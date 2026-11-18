import java.util.Arrays;
import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        
        // 선택 번호
        int[] selectNumber = new int[6];
        Random random = new Random(3);
        // new Random(3) 매개값으로 주어진 종자값이 설정 3 기준

        System.out.println("선택 번호: ");
        for(int i = 0 ; i < 6 ; i++){
            selectNumber[i] = random.nextInt(45) + 1;
            System.out.println(selectNumber[i]+ " ");
        }
        // nextInt(45) int 타입의 난수를 리턴(0 <= ~ < n)

        System.out.println();

        // 당첨 번호
        int[] winningNumber = new int[6];
        random = new Random(5);
        // Random(5) 매개값으로 주어진 종자값이 설정 5 기준

        System.out.println("당첨 번호: ");
        for(int i = 0 ; i < 6 ; i++){
            winningNumber[i] = random.nextInt(45) + 1;
            System.out.println(winningNumber[i] + " ");
        }
        // // nextInt(45) int 타입의 난수를 리턴(0 <= ~ < n)

        System.out.println();

        // 당첨 여부
        Arrays.sort(selectNumber);
        Arrays.sort(winningNumber);

        boolean result = Arrays.equals(selectNumber, winningNumber);

        System.out.println("당첨 여부: ");
        if(result){
            System.out.println("1등에 당첨되셨습니다.");
        }
        else{
            System.out.println("당첨되지 않았습니다.");
        }
    }
}
