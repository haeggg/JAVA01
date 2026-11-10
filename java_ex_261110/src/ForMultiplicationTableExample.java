public class ForMultiplicationTableExample {
    
    public static void main(String[] args) {
        
        /*
        // 2단에서 9단까지
        for(int m = 2 ; m <= 9 ; m++){

            System.out.println("======= " + m + "단 =======");

            for(int n = 1 ; n <= 9 ; n++){
                System.out.println(m + "x" + n + "=" + (m*n));
            }
        }
        */

        // 9단에서 2단까지
        for(int m = 9 ; m >= 2 ; m--){

            System.out.println("======= " + m + "단 =======");

            for(int n = 1 ; n <= 9 ; n++){
                System.out.println(m + "x" + n + "=" + (m*n));
            }
        }

    }
}
