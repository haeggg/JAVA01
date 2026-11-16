package ChildExample;
public class ChildExample {
    public static void main(String[] args) {
        
        Parent parent = new Child();

        parent.field1 = "data1";
        parent.method1();
        parent.method2();

        /*
        parent.field2 = "data2";
        parent.method3();

        (두 방법 모두 불가능)
        : parent 형 parent의 child는
        parant에서 물려받은, 오버라이딩 된 것들만 사용 가능

        */

        Child child = (Child) parent;

        child.field2 = "data2";
        child.method3();
    }
}
