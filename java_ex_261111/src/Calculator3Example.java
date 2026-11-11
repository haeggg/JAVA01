public class Calculator3Example {
    
    public static void main(String[] args) {

        double result1 = 10 * 10 * Calculator3.pi;

        int result2 = Calculator3.plus(10, 5);
        int result3 = Calculator3.minus(10, 5);

        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);

        // Calculator3 cal3 = new Calculator3();
        // double test = 10 * 10 * cal3.pi;
        // System.out.println("new 객체 생성 후 테스트 값: " + test);
    }
}
