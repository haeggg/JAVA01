public class AdvancedForExample {
    public static void main(String[] args) {
        
        int[] scores = {95,71,84,93,87};

        int sum = 0;
        for(int score : scores){
            sum = sum + score;
        }

        // int score : 값을 하나씩 담을 변수
        // : : ~에 있는 값을 하나씩 가져온다는 의미
        // scores : 값을 꺼내올 배열 또는 컬렉션

        System.out.println("점수 총합 : " + sum);

        double avg = (double) sum / scores.length;
        System.out.println("점수 평균 : " + avg);
    }
}
