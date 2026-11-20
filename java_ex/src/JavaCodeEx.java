public class JavaCodeEx {

    // 클래스 : 중괄호로 둘러싸야 함

    // public은 자바의 접근 제어자로,
    // 어디서든 이 클래스에 접근할 수 있음을 의미

    // class는 클래스 블록을 만드는 키워드

    // 클래스 이름은 첫 번째 글자는 대문자이어야 함
    // = 파스칼 케이스(pascal case)

    public static void main(String[] args) {
        
        //메서드

        //클래스 블록 안에는 메서드 블록이 여러 개 있을 수 있음
        // public, static, void 등

        // 메서드 이름은 맨 첫 글자를 제외한
        // 나머지 단어의 첫 글자는 대문자를 써서 구분
        // = 카멜 케이스(camel case)
        

        System.out.println("hello java!");
        
        // 명령문

        // 메서드 블록 안에는 컴퓨터에 무언가 일을 시키는
        // 명령문(statement)이 있음


        int a;
        // 변수 :  값을 넣을 수 있는 빈 상자와 같이 값을 대입하여 사용

        a = 1;
        // 변수에 값을 대입할 때는 = 대입 연산사 사용


        int octal = 023;
        // 0으로 시작하면 8진수

        int hex = 0xc3;
        // 0x로 시작하면 16진수

        Integer top = 10;
        // Wrapper 클래스 : 
        // 원시 자료형을 대신해서 사용할 수 있는 자료형 > 객체로 사용
        
        String text1 = "hello java!";
        System.out.println(text1.contains("hello"));
        // contains 문자가 포함되어 있는지 확인

        System.out.println(text1.charAt(3));
        // charAt 문자열 특정 위치의 문자를 리턴

        System.out.println(text1.replaceAll("java", "world"));
        // replaceAll 특정 문자열을 다른 문자열로 바꿔줌

        System.out.println(text1.substring(0, 5));
        // substring 문자열에서 특정 문자열을 뽑아낼 때 사용
        // 첫 번째 숫자는 위치, 두 번째 숫자는 길이

        System.out.println(text1.toUpperCase());
        // toUpperCase 문자열을 대문자로 변경

        String text2 = "a:b:c:d";
        String[] result1 = text2.split(":");
        // split 문자열을 특정한 구분자로 나누어 문자열 배열로 리턴
        
        for(int i = 0 ; i < result1.length ; i++){
            System.out.println(result1[i]);
        }
        
        System.out.println(String.format("I eat %d apples", 3));
        // 문자열 포매팅 String.format 메서드
        // > %d 는 숫자를 넣는 코드
        // > %s 는 문자열를 넣는 코드

        String text3 = "five";
        System.out.println(String.format("I eat %s apples", text3));
        // 뒤에 입력값은 숫자가 아닌 변수도 가능

        // > %c 는 문자 한 개
        // > %f 부동소수
        // > %o 8진수
        // > %x 16진수
        // > %% 특수문자 %

        System.out.println(String.format("%10s", "hi"));
        // 문자열 공백 표현 가능
        
        System.out.println(String.format("%-10sjane", "hi"));

        System.out.println(String.format("%.4f", 3.42134234));
        System.out.println(String.format("%10.4f", 3.42134234));

        System.out.printf("text %d", 3);
        // printf 사용하면 String.format 없어도 활용 가능

    }
}
