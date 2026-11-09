public class ConditionalOperationExample2 {
    
    public static void main(String[] args) {
        
        // if, else 문으로 수정

        int score = 85;
        char grade;

        if(score > 90){
            grade = 'A';
        }
        else{

            if(score > 80){
                grade = 'B';
            }
            else{
                grade = 'C';
            }

        }

        System.out.println(score + " 점은 " + grade + " 등급입니다.");
    }
}
