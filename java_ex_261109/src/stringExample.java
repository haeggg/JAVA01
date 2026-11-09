public class stringExample {
    
    public static void main(String[] args) {
        
        String result = " ";

        result += "hello!";
        System.out.println(result);

        result += " ";
        System.out.println(result);

        result += "jump ";
        System.out.println(result);
        
        result += "to java!";
        System.out.println(result);


        System.out.println();

        StringBuffer result2 = new StringBuffer("hello");

        result2.append(" ");
        result2.append("jump to java");

        System.out.println(result2);

        // String은 한 번 만들어지면 내부 문자열을 직접 변경할 수 없는(불변) 객체
        // 그래서 StringBuffer 사용
        // StringBuffer는 기존 객체의 내용을 변경

        System.out.println();

        String text1 = "hello!";
        String text2 = " ";
        String text3 = "Welcome!";

        String result3 = text1 + text2 + text3;
        System.out.println(result3);

        // += 기호는 왼쪽 변수에 연산 결과를 다시 대입하는 것이나
        // String 문자열 자료형이라 += 연산을 했을 때 문자열을 이어붙이게 됨
    }
}
