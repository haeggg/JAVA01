public class ChildExample {
    public static void main(String[] args) {
        
        Child child = new Child();

        Parent parent = child;

        parent.method1();
        //parent 에 method1() 부분 출력 > child에 extends 되어 있어서

        parent.method2();
        //child 에 override 된 method2() 부분 출력
        
        // parent.method3();
        // 참조변수가 부모로 되어 있기 때문에
        // child 에 있는 method3() 부분 출력 X
    }   
}
