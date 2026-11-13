public class Car2 {
    
    public int speed;

    public void speedUp(){
        speed += 1;
    }

    public final void stopl(){
        System.out.println("차를 멈춤");
        speed = 0;
    }
}
