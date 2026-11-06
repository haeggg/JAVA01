public class StringExample {
    public static void main(String[] args){
        
        String name = "홍길동";
        String job = "프로그래머";

        System.out.println(name);
        System.out.println(job);

        // 문자열을 저장하는 변수는 참조변수(주소를 저장하고 있는 변수)
        // 문자열은 유니코드로 변환되지 않고 그대로 힙 영역에 저장
        

        String str = "나는 \"자바\"를 배웁니다.";
        /*
        \ 이스케이프 문자(Escape Character)

        - \" 큰따옴표 출력
        - \' 작은따옴표 출력
        - \\ 역슬래시 출력
        - \t 탭 키
        - \n 줄바꿈
        - \r 캐리지 리턴

        */

        System.out.println(str);


        str = "번호 \t이름 \t직업";
        // \t 탭 키

        System.out.println(str);
        // println은 줄바꿈 기능이 함께 적용


        System.out.print("나는 \n");
        System.out.print("자바를 \n");
        System.out.print("배웁니다.");
        // print은 줄바꿈 기능이 없음
        // \n 줄바꿈
    
    }
}
