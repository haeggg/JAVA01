public class StringIndexOfExample {
    public static void main(String[] args) {

        // 문자열 찾기 indexOf
        // 매개값으로 주어진 문자열이 시작되는 인덱스 리턴
        // 포함되어 있지 않으면 -1 리턴
        
        String subject = "자바 프로그래밍";

        int location = subject.indexOf("프로그래밍");
        System.out.println(location);

        if(subject.indexOf("자바") != -1){
            System.out.println("자바와 관련된 책이군요");
        }
        else{
            System.out.println("자바와 관련 없는 책이군요");
        }
    }
}
