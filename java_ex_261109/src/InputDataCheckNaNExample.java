public class InputDataCheckNaNExample {
    
    public static void main(String[] args) {
        
        String userInput = "NaN";
        double val = Double.valueOf(userInput);

        // Double.valueOf 문자열을 double 객체로 변환하는 메서드
        // double val의 값은 NaN이 들어가있음

        double currentBalance = 1000.0;

        currentBalance += val;
        // NaN은 다른 숫자와 연산해도 결과가 NaN > 10000.0 + NaN = Nan
        
        System.out.println(currentBalance);
    }
}
