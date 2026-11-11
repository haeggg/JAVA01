public class Person {
    
    final String nation = "Korea";
    final String ssn;
    // final 최종적인 값을 갖고 있는 필드 > 값을 변경할 수 없음

    String name;

    public Person(String ssn, String name){
        this.ssn = ssn;
        this.name = name;
    }
}
