public class CalculatorTest {
    
    int plus(int x, int y){
        int result = x + y;
        return result;
    }

    double avg(int x, int y){
        double sum = plus(x, y);
        double result = sum / 2;
        return result;
    }

    void execute(int num1, int num2){
        int result = (int) avg(num1, num2);
        System.out.println("첫 번째 int 형 execute : " + result);
    }
    
    void execute(double num1, double num2){
        double result = avg((int)num1, (int)num2);
        System.out.println("두 번째 double 형 execute : " + result);
    }

    void execute(long num1, long num2){
        long result = (long) avg((int)num1, (int)num2);
        System.out.println("세 번째 long 형 execute : " + result);
    }

    // 메소드 오버로딩 

    void println(String message){
        System.out.println(message);
    }
}
