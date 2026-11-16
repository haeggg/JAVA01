package TireExample;

public class KumhoTire implements Tire {
    
    @Override 
    public void roll(String location){
        System.out.println(location + " 금호 타이어가 굴러갑니다.");
    }
}
