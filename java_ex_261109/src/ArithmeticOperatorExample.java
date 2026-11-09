public class ArithmeticOperatorExample {
    public static void main(String[] args) {
        
        byte v1 = 10;
        byte v2 = 4;
        // int v3 = 5;
        long v4 = 10L;

        int result1 = v1 + v2;
        System.out.println("1. result1 값: " + result1);
        // 모든 피연산잔는 int 타입으로 자동 변환 후 연산

        long result2 = v1 + v2 - v4;
        System.out.println("2. result2 값: " + result2);
        // 모든 피연산잔는 long 타입으로 자동 변환 후 연산

        double result3 = (double) v1 / v2;
        System.out.println("3. result3 값: " + result3);
        // double 타입으로 강제 변환 후 연산

        int result4 = v1 % v2;
        System.out.println("4. result4 값: " + result4);
    }
}
