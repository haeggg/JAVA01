package MemberExample;

public class Member {
    
    public String id;

    public Member(String id){
        this.id = id;
    }

    @Override
    public boolean equals(Object obj){
        // 매개변수가 Object obj인 이유는
        // 부모 클래스인 Object 타입을 받아서
        // 다양한 객체를 전달받을 수 있도록 하기 위해서

        if(obj instanceof Member){
            // instanceof
            // 참조 변수가 가리키고 있는 실제 객체의 타입을 확인하여
            // boolean 값(true 또는 false)을 반환하는 연산자

            Member member = (Member) obj;
            // obj를 Member 타입으로 형변환

            if(id.equals(member.id)){
                return true;
            }
        }

        return false;
    }

    // 논리적 동등을 위해 오버라이딩 필요

    // 논리적 동등: 같은 객체이건 다른 객체이건 상관없이 객체 저장 데이터 동일
    // Object의 equals() 메소드 > 재정의하여 논리적 동등 비교할 때 이용
}
