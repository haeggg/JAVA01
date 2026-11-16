public class RemoteControlExample2 {
    public static void main(String[] args) {
        
        RemoteControl rc = new RemoteControl() {
          
            public void turnOn(){
                System.out.println("turnOn() 실행");
            }
            public void turnOff(){
                System.out.println("turnOff() 실행");
            }
            public void setVolume(int volume){
                System.out.println("현재 볼륨: " + volume);
            }

        };

    }

    public interface RemoteControl {
        void turnOn();
        void turnOff();
        void setVolume(int volume);
    }
}
