public class ArrayCopyExample {
    
    public static void main(String[] args) {
        
        String[] oldStrArray = {"java", "array", "copy"};
        String[] newStrArray = new String[5];

        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
        // 값이 있는 배열 이름, 배열 인덱스, 옮길 배열 이름, 배열 인덱스, 옮길 값의 배열 길이

        for(int i=0 ; i<newStrArray.length ; i++){
            System.out.print(newStrArray[i] + ", ");
        }
    }
}
