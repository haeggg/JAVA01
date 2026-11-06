public class VariableScopeExample {
    
    public static void main(String[] args){

        /* 
        오류 수정 전

        int v1 = 15;
       
        if(v1>10){
            int v2 = 0;
            v2 = v1 - 10;
        }

        int v3 = v1 + v2(오류 부분) + 5;
        
        */

        int v1 = 15;
        int v2 = 0;
        
        if(v1>10){
            v2 = v1 - 10;
        }

        int v3 = v1 + v2 + 5;

        // 입력된 값 확인용 출력
        System.err.println(v1);
        System.err.println(v2);
        System.err.println(v3);
    }
}
