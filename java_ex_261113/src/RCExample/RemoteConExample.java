package RCExample;

public class RemoteConExample {

    // RC 구현한 텔레비전 안 메소드 turnOn(), turnOff() 호출해서 출력
    // RC 구현한 스마트텔레비전 안 메소드 turnOn(), turnOff() 호출해서 출력

    // * 하나의 참조변수(필드)를 사용할 것
    
    public static void main(String[] args) {
        
        RemoteControl rc;

        rc = new Television();

        rc.turnOn();
        rc.turnOff();

        rc = new SmartTelevision();

        rc.turnOn();
        rc.turnOff();
        
    }

}
