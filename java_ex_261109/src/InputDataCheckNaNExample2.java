public class InputDataCheckNaNExample2 {
    public static void main(String[] args) {
        
        String userInput = "NaN";
        double val = Double.valueOf(userInput);

        // Double.valueOf 문자열을 double 객체로 변환하는 메서드
        // double val의 값은 NaN이 들어가있음

        double currentBalance = 10000.0;

        if(Double.isNaN(val)){
            // val 이 NaN인지 검사

            System.out.println("※ NaN이 입력되어서 처리할 수 없음");
            val = 0.0;
            // NaN을 정상적인 숫자인 0.0으로 바꿈
        }

        System.out.println();
        
        currentBalance += val;
        System.out.println(currentBalance);
    }
}
