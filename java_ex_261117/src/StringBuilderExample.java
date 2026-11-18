public class StringBuilderExample {
    public static void main(String[] args) {

        // StringBuffer / StringBuilder
        // 버퍼(buffer:데이터를 임시로 저장하는 메모리)에 문자열 저장

        // 멀티 스레드환경: StringBuffer 사용
        // 단일 스레드환경: StringBuilder 사용
        
        StringBuilder sb = new StringBuilder();

        sb.append("Java ");
        sb.append("Program Study");
        System.out.println(sb.toString());

        sb.insert(4, "2");
        System.out.println(sb.toString());
        // 문자 삽입

        sb.setCharAt(4, '6');
        System.out.println(sb.toString());
        // 문자 바꿈
        
        sb.replace(6, 13, "book");
        System.out.println(sb.toString());
        // 문자열 바꿈

        sb.delete(4, 5);
        System.out.println(sb.toString());

        int length = sb.length();
        System.out.println("총 문자수: " + length);

        String result = sb.toString();
        System.out.println(result);

    }
}
