package Example1;
public class Code229 {
    public static void main(String[] args) {
        
        // 제네릭 클래스

        // 클래스명 <매개변수 타입 리스트> {}
        // 클래스명 <타입> 객체명 = new 클래스명 <타입> ();

        // 제네릭은 객체형 (Integer 등이나 개발자가 직접 만든 것들/
        // int와 같은 기본 문자형X)만 받음
        
        Data <Integer> d1 = new Data<Integer>(100); // 정수 100 인수

        System.out.println(d1.getObj());
        d1.showType();

        Data<String> d2 = new Data<String>("JAVA"); // 문자열 "JAVA" 인수

        System.out.println(d2.getObj());
        d2.showType();
    }

    
}
