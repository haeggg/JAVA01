public class ArrayReferenceObjectExample {
    
    public static void main(String[] args) {
        
        String[] strArray = new String[3];

        strArray[0] = "Java";
        strArray[1] = "Java";
        strArray[2] = new String("Java");

        System.out.println(strArray[0] == strArray[1]);
        System.out.println(strArray[0] == strArray[2]);
        System.out.println(strArray[0].equals(strArray[2]));
        // String 문자열 배열에 들어있는 값이 같은지 확인하려면 equals 활용
    }
}
