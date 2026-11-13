public class Computer extends Calculator {
    
    @Override 
    double areaCircle (double r){
        System.out.println("Computer 객체의 areaCircle() 실행");
        return Math.PI * r * r;
    }

    // overriding 오버라이딩
    // 상속받은 메서드의 내용을 상속받는 클래스에 맞게 변경하는 것

    // @Override 어노테이션
    // 컴파일러에게 부모 클래스의 메소드 선언부와 동일한지 검사 지시

    // 선언부가 같아야 함(이름, 매개변수, 리턴타입)

    // 접근 제어자를 좁은 범위로 변경할 수 없음 
    // (public > default, private) (default > private 불가)
    
    // 조상의 메서드가 protected라면,
    // 범위가 같거나 넓은 protected나 public으로만 변경할 수 있다

}
