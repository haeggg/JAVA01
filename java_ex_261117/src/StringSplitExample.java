public class StringSplitExample {
    public static void main(String[] args) {

        // 문자열 분리 split
        // 정규표현식을 구분자로 해서 부분 문자열 분리
        
        String text = "홍길동&이수홍,박연수,김자바-최명호";
        String[] names = text.split("&|,|-");

        for(String name : names){
            System.out.println(name);
        }
    }
}
