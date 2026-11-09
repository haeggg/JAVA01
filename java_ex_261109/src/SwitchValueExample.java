public class SwitchValueExample {
    
    public static void main(String[] args) {
        
        String grade1 = "B";
        String grade2 = "B";

        // java 11이전 문법

        System.out.println("java 11이전 문법");

        int score1 = 0;

        switch (grade1) {
            case "A":
                score1 = 100;
                break;

            case "B":
                int result1 = 100 - 20;
                score1 = result1;
                break;
        
            default:
                score1 = 60;
                break;
        }

        System.out.println("score1 : " + score1);

        // java 12부터 가능


        System.out.println();
        System.out.println("java 12이후 문법");

        int score2 = switch(grade2){
            case "A" -> 100;
            case "B" -> {
                int result2 = 100 - 20;
                yield result2;
            }
            default -> 60;
        };
        System.out.println("score2 : " + score2);

        // 람다 식(Lambda Expression)

        // 현재 버전은 둘 다 가능
    }
}
