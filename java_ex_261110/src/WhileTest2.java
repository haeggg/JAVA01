import java.util.Scanner; 

// 이따 수정

public class WhileTest2 {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[총점, 평균 계산기]");
        System.out.println();

        System.out.println("- 계산할 과목의 개수를 입력하세요.");
        String strNum = scanner.nextLine();
        int step = Integer.parseInt(strNum);

        int[] arr1 = new int[step];
        // step 값 받은 후 배열 생성

        int i = 0;
        int sum = 0;

        while (i < step) {

            System.out.println();
            System.out.println((i+1) + "번째 과목의 점수: ");
            strNum = scanner.nextLine();
            int num = Integer.parseInt(strNum);
            // 입력 받은 문자 string 형이랑 int 형으로 저장

            arr1[i] = num;
            // 배열 생성 후 값 설정

            sum += num;
            // 총합 계산

            i++;
        }

        // 입력된 정보 출력

        System.out.println();

        for(int n = 0; n < step; n++){
            System.out.println("> 입력된 " + (n+1) + "번째 점수 : " + arr1[(n)]);
        }


        System.out.println();
        System.out.println("- 입력된 과목의 개수: " + step);
        
        System.out.println("----------------------------");

        System.out.println("- 총점 : " + sum);

        double avg = (double) sum / (double) step;
        System.out.println("- 평균 : " + avg);
        
    }
}
