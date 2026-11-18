public class ValueCompareExample {
    public static void main(String[] args) {
        
        System.out.println();
        System.out.println("[-128 ~ 127 초과값일 경우]");
        
        System.out.println();

        Integer obj1 = 300;
        Integer obj2 = 300;


        System.out.println("> 결과: " + (obj1 == obj2));
        // 오버플로우로 false 값이 나옴
        System.out.println("> 언박싱 후 결과: " + (obj1.intValue() == obj2.intValue()));
        System.out.println("> equals() 결과: "+ ( obj1.equals(obj2)));

        System.out.println();

        System.out.println();
        System.out.println("[-128 ~ 127 범위값일 경우]");

        System.out.println();

        Integer obj3 = 10;
        Integer obj4 = 10;

        System.out.println("> 결과: " + (obj3 == obj4));
        System.out.println("> 언박싱 후 결과: " + (obj3.intValue() == obj4.intValue()));
        System.out.println("> equals() 결과: " + (obj3.equals(obj4)));

        // test

    System.out.println();
        System.out.println("[test]");

        System.out.println();

        Integer obj5 = Integer.valueOf(300);
        Integer obj6 = Integer.valueOf(300);

        System.out.println("> 결과: " + (obj5 == obj6));
        System.out.println("> 언박싱 후 결과: " + (obj5.intValue() == obj6.intValue()));
        System.out.println("> equals() 결과: " + (obj5.equals(obj6)));
    }
}
