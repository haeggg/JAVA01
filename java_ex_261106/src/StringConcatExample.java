public class StringConcatExample {
    
    public static void main(String[] args) {
        
        // 숫자 연산
        int result1 = 10 + 2 + 8;
        System.out.println("result1: " + result1);


        // 결합 연산
        String result2 = 10 + 2 + "8";
        System.out.println("result2: " + result2);

        String result3 = 10 + "2" + 8;
        System.out.println("result3: " + result3);

        String result4 = "10" + 2 + 8;
        System.out.println("result4: " + result4);
        // 문자열과 숫자를 +로 결합하면 숫자 2가 문자열로 자동 변환

        String result5 = "10" + (2 + 8);
        System.out.println("result5: " + result5);

        // 보통은 숫자 연산 후 문자와 결합
        // 숫자 연산이 필요하면 () 괄호 사용

    }
}
