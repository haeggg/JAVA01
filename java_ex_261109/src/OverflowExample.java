public class OverflowExample {
    public static void main(String[] args) {
        
        /*
        int x = 1000000;
        int y = 1000000;

        int z = x * y;
        // 9자리 이상 > 오버플로우

        System.out.println(z);
         */

        long x = 1000000;
        long y = 1000000;

        long z = x * y;

        System.out.println(z);
    }
}
