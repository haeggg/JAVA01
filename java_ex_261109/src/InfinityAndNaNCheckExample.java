public class InfinityAndNaNCheckExample {
    public static void main(String[] args) {
        
        int x = 5;
        double y = 0.0;

        double z = x / y;
        // double z = x % y;

        System.out.println(Double.isInfinite(z));
        System.out.println(Double.isNaN(z));

        // 잘못된 코드
        System.out.println(z + 2);

        // 알맞은 코드
        if(Double.isInfinite(z) || Double.isNaN(z)) {
            
            // NaN 숫자가 아닌 결과
            // z가 infinitty이므로 if 문 처리
            
            System.out.println("값 산출 불가");
            
        }
        else{
            System.out.println(z + 2);
        }

        /*
        int끼리 0으로 나누면 ArithmeticException이 발생하지만,
        double이 포함된 실수 연산에서는 Infinity나 NaN이 나올 수 있음
        */
    }
}