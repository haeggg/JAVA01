package DriverExample;
public class CarExample {
    public static void main(String[] args) {
        
        Car car = new Car();

        System.out.println("■ 타이어 확인 프로그램 ■");
        System.out.println();

        for(int i = 1; i<=5; i++){
            int problemLocation = car.run();

            switch (problemLocation) {
                case 1:
                    System.out.println("앞왼쪽 HankookTire로 교체");
                    car.tires[0] = new HankookTire("앞왼쪽", 15);
                    break;
                
                case 2:
                    System.out.println("앞오른쪽 KumhoTire로 교체");
                    car.tires[1] = new KumhoTire("앞오른쪽", 13);
                    break;

                
                case 3:
                    System.out.println("뒤왼쪽 HankookTire로 교체");
                    car.tires[2] = new HankookTire("뒤왼쪽", 14);
                    break;
                
                case 4:
                    System.out.println("앞오른쪽 KumhoTire로 교체");
                    car.tires[3] = new KumhoTire("뒤오른쪽", 17);
                    break;
            
            }

            System.out.println("------------------------------------------------");
        }

        System.out.println();
        System.out.println("■ 주행 종료되었습니다. ■");

        // 결론적으로 수리하는 건 앞 오른쪽 타이어와 뒤 왼쪽 타이어
    }
}
