public class FloatDoubleExample {
    
    public static void main(String[] args){

        // 실수값 저장

        double var1 = 3.14;
        // float var2 = 3.14; 에러
        float var3 = 3.14F;

        //정밀도 테스트

        double var4 = 0.1234567890123456789;
        // double 형은 15~16자리의 값을 보장 그래서 18 자리에서 반올림한 17의 값까지 출력
        float var5 = 0.1234567890123456789F;
        // float 형은 7까지 값을 보장 그래서 9 자리에서 반올림한 8의 값까지 출력

        System.out.println("var1: " + var1);
        System.out.println("var3: " + var3);
        System.out.println("var4: " + var4);
        System.out.println("var5: " + var5);


        // e 사용하기

        int var6 = 3000000;
        double var7 = 3e6;
        float var8 = 3e6F;
        double var9 = 2e-3;

        System.out.println("var6: " + var6);
        System.out.println("var7: " + var7);
        System.out.println("var8: " + var8);
        System.out.println("var9: " + var9);
    }
}
