public class ContinueExample {
    
    public static void main(String[] args) throws Exception {
        
        for(int i=1; i<=10; i++){

            if (i%2 != 0) {
                continue;
                // i 나누기 2의 나머지가 0이 아니면 증감으로 올라감
            }

            System.out.println(i);
            // i 나누기 2의 나머지가 0이면 출력

        }
    }
}
