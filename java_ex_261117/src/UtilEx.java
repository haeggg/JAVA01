public class UtilEx {
    
    
    public static <T extends Number> int compare(T t1, T t2){
        // 제네릭 | T는 Number를 상속받은 타입만 사용할 수 있음
        // Integer, Double, Float
        // 반환타입 int인 compare 메서드는 T 형의 t1과 t2 변수를 받음 
        
        double v1 = t1.doubleValue();

        double v2 = t2.doubleValue();

        return Double.compare(v1, v2);
        // 두 숫자를 비교해서 정수 결과 반환
        // Double.compare() 자체가 원래 int 타입을 반환하는 메서드

        // 첫 번째 숫자가 작음 -1
        // 두 숫자가 같음 0
        // 첫 번째 숫자가 큼 1
        
    }


}
