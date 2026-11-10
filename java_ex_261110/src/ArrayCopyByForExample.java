public class ArrayCopyByForExample {
    
    public static void main(String[] args) {
        
        int[] oldIntArray = {1,2,3};
        int[] newIntArray = new int[5];

        // 배열의 크기만큼 값을 넣을 수 있음
        // > 배열의 크기보다 값이 초과할 경우, 값이 넣어지지 않음

        for(int i=0 ; i < oldIntArray.length ; i++){
            newIntArray[i] = oldIntArray[i];
        }

        for(int i=0 ; i<newIntArray.length; i++){
            System.out.println(newIntArray[i] + " ");
        }
    }
}
