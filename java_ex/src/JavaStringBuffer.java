public class JavaStringBuffer {
    
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer();
        //문자열을 추가하거나 변경할 때 주로 사용하는 자료형

        sb.append("hello");
        sb.append(" ");
        sb.append("java");
        // append 입력한 순서대로 값 입력

        String result = sb.toString();
        System.out.println(result);

        String result2 = "";

        result2 += "hello";
        result2 += " ";
        result2 += "java";
        // StringBuffer 아니어도 
        // String 자료형을 사용해서 문자열 생성 가능

        System.out.println(result2);

        // 문자열을 추가하거나 변경하는 작업이 많으면 StringBuffer를,
        // 문자열을 추가하거나 변경하는 작업이 적으면 String을
        // 사용하는 것이 유리

        sb.insert(0, "hello ");
        System.out.println(sb.toString());
        // insert 특정 위치에 원하는 문자열 삽입

        System.out.println(sb.substring(0, 4));
        // StringBuffer 객체의 시작 위치에서 끝 위치까지의 문자 출력

        

    }
}
