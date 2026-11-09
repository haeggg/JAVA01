public class BitLogicalExample {
    
    public static void main(String[] args) {
        
        // 45 > 101101 | 25 > 11001

        System.out.println("45 & 25 = " + (45 & 25));
        // 논리곱 - 두 비트가 모두 1인 경우에만 연산 결과 1
        // 결과값 1001 > 9

        System.out.println("45 | 25 = " + (45 | 25));
        // 논리합 - 두 비트 중 하나만 1이면 연산 결과 1
        // 결과값 111101 > 61

        System.out.println("45 ^ 25 = " + (45 ^ 25));
        // 베타적 논리합 xor - 두 비트 중 하나는 1이고 다른 하나가 0일 경우 연산 결과 1
        // 결과값 110100 > 52

        System.out.println("~45 = " + (~45));
        // 논리부정 보수(부호 변경 후 -1)
        // 결과값 -46

        System.out.println("======================");

        byte receiveData = -120;

        // 방법 1 : 비트 논리곱 연산으로 Unsigned 정수 얻기
        int UnsignedInt1 = receiveData & 255;
        System.out.println(UnsignedInt1);

        // 방법 2 : 자바 API를 이용해서 Unsigned 정수 얻기
        int UnsignedInt2 = Byte.toUnsignedInt((receiveData));
        System.out.println(UnsignedInt2);

        int test = 136;
        byte btest = (byte) test;

        System.out.println(btest);
    }
}
