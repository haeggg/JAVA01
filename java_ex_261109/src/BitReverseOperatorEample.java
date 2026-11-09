public interface BitReverseOperatorEample {

    public static void main(String[] args) {
        int v1 = 10;
        int v2 = ~v1;
        int v3 = ~v1 + 1;

        // 비트 반전 연산자 ~
        // 0 은 -1 > 비트 반전 연산자 적용 시 -1 계산하면 됨

        System.out.println(toBinaryString(v1) + "(십진수: " + v1 + " )");
        System.out.println(toBinaryString(v2) + "(십진수: " + v2 + " )"); // -11
        System.out.println(toBinaryString(v3) + "(십진수: " + v3 + " )"); // -10

        int v4 = -10;
        int v5 = ~v4;
        int v6 = ~v4 + 1;

        System.out.println(toBinaryString(v4) + "(십진수: " + v4 + " )");
        System.out.println(toBinaryString(v5) + "(십진수: " + v5 + " )"); // 9
        System.out.println(toBinaryString(v6) + "(십진수: " + v6 + " )"); // 10
    }

    public static String toBinaryString(int value){
        String str = Integer.toBinaryString(value);

        while(str.length() < 32){
            str = "0" + str;
        }
        return str;
    }
}
