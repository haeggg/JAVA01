public class StringToLowerUpperCaseExample {
    public static void main(String[] args) {

        // 알파벳 소·대문자 변경 toLowerCase() / toUpperCase()
        
        String str1 = "Java Programing";
        String str2 = "JAVA Programing";

        String upperStr1 = str1.toUpperCase();
        String upperStr2 = str2.toUpperCase();

        System.out.println("upperStr1 : " + upperStr1);
        System.out.println("upperStr2 : " + upperStr2);

        String lowerStr1 = str1.toLowerCase();
        String lowerStr2 = str2.toLowerCase();

        System.out.println("lowerStr1 : " + lowerStr1);
        System.out.println("lowerStr1 : " + lowerStr2);

        System.out.println();

        System.out.println("str1.equals(str2): " + str1.equals(str2));

        System.out.println("lowerStr1.equals(lowerStr2): " + lowerStr1.equals(lowerStr2));

        System.out.println("str1.equalsIgnoreCase(str2): " + str1.equalsIgnoreCase(str2));
    }
}
