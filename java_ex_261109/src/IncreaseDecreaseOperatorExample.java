public class IncreaseDecreaseOperatorExample {
    public static void main(String[] args) {
        
        int x = 10;
        int y = 10;
        int z;

        System.out.println("-------------------");
        x++; // 후처리 10 > 11
        ++x; // 선처리 12
        System.out.println("x 값 = " + x); // 12

        System.out.println("-------------------");
        y--; // 후처리 10 > 9
        --y; // 선처리 8
        System.out.println("y 값 = " + y); // 8

        System.out.println("-------------------");
        z = x++; // 후처리 12 > 13
        System.out.println("z 값 = " + z); // 12
        System.out.println("x 값 = " + x); // 13

        System.out.println("-------------------");
        z = ++x; // 선처리 14
        System.out.println("z 값 = " + z); // 14
        System.out.println("x 값 = " + x); // 14

        System.out.println("-------------------");
        z = ++x + y++; //x 선처리 15 , y 후처리 8
        System.out.println("z 값 = " + z); // 23
        System.out.println("x 값 = " + x); // 15
        System.out.println("y 값 = " + y); // 9
    }
}
