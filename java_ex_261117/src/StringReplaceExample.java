public class StringReplaceExample {
    public static void main(String[] args) {

        // 문자열 대치 replace()
        // 첫 번째 매개값인 문자열을 찾고 두 번째 매개값인 문자열로 대치
        // String 은 값 변경이 어려워 새로운 문자열에 대입
        
        String oldStr = "자바는 객체지향언어입니다. 자바는 풍부한 API를 지원합니다.";
        String newStr = oldStr.replace("자바", "JAVA");

        System.out.println(oldStr);
        System.out.println(newStr);
    }
}
