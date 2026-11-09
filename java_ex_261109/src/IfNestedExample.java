public class IfNestedExample {
    
    public static void main(String[] args) {
        /*
        int score = (int)(Math.random()*20) + 81;
        // 81 ~ 100까지 나옴

        String grade;

        if(score >= 90){
            if (score >= 95) {
                grade = "A+";
            }
            else{
                grade = "A";
            }
        }
        else{
            if(score >= 85){
                grade = "B+";
            }
            else{
                grade = "B";
            }
        }

        System.out.println("점수: " + score);
        System.out.println("학점: " + grade);

        */

        int score = (int)(Math.random()*41) + 60;
        // 60 ~ 100까지 나옴

        String grade;

        if(score >= 90){
            if (score >= 95) {
                grade = "A+";
            }
            else{
                grade = "A";
            }
        }
        else if (score >= 80){
            if(score >= 85){
                grade = "B+";
            }
            else{
                grade = "B";
            }
        }
        else if (score >= 70){
            if(score >= 75){
                grade = "C+";
            }
            else{
                grade = "C";
            }
        }
        else{
            grade = "F";
        }

        System.out.println("점수: " + score);
        System.out.println("학점: " + grade);
    }
}
