package TireExample;

public class HankookTire implements Tire{
   
    @Override 
    public void roll(String location){
        System.out.println(location + " 한국 타이어가 굴러갑니다.");
    }
}
