public class RemoteControlExample {
    public static void main(String[] args) {
        
        RemoteControl rc;

        rc = new Television();
        rc.turnOn();
        rc.setValume(12);
        rc.turnOff();

        System.out.println();
        
        rc = new Audio();
        rc.turnOn();
        rc.setValume(2);
        rc.turnOff();

        RemoteControl.changeBattery();
    }
}
