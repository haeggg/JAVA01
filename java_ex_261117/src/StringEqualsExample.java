public class StringEqualsExample {
    public static void main(String[] args) {

        // 문자열 비교 == (얕은 비교) / equals (깊은 비교)
        
        String strVar1 = new String("신민철");
        String strVar2 = "신민철";

        if(strVar1 == strVar2){
            System.out.println("같은 String 객체를 참조");
        }
        else{
            System.out.println("다른 String 객체를 참조");
        }

        if(strVar1.equals(strVar2)){
            System.out.println("같은 문자열을 가짐");
        }
        else{
            System.out.println("다른 문자열을 가짐");
        }

        String strVar3 = new String("신민철");
        String strVar4 = new String("신민철");

        if(strVar3 == strVar4){
            System.out.println("같은 String 객체를 참조");
        }
        else{
            System.out.println("다른 String 객체를 참조");
        }

        if(strVar3.equals(strVar4)){
            System.out.println("같은 문자열을 가짐");
        }
        else{
            System.out.println("다른 문자열을 가짐");
        }

    }
}
