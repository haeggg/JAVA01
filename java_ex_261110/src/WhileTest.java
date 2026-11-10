import java.util.Scanner; 

// 이따 수정

public class WhileTest {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        // boolean run = true;
        int step = 0;

        int num = 0;
        int i = 1;

        int sum = 0;

        System.out.println("[총점, 평균 계산기]");
        System.out.println();

        System.out.println("- 계산할 과목의 개수를 입력하세요.");
        String strNum = scanner.nextLine();
        step = Integer.parseInt(strNum);

        while (i <= step) {

            System.out.println();
            System.out.println(i + "번째 과목의 점수: ");
            strNum = scanner.nextLine();
            num = Integer.parseInt(strNum);

            sum += num;
            i++;
        }

        double avg = (double) sum / (double) step;

        // 입력된 정보 출력5
        System.out.println();
        System.out.println("- 입력된 과목의 개수: " + step);
        System.out.println("- 총점 : " + sum);
        System.out.println("- 평균 : " + avg);
        
    }
}
