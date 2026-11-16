package TryCatchFinallyRuntimeExceptionExample;

public class TryCatchFinallyRuntimeExceptionExample {
    public static void main(String[] args) {
        
        // 배열 생성
        String[] arr1 = {"a", "b"};
        String[] arr2 = {"1", "2"};
        String[] arr3 = {"일", null};

        

        Sub sub = new Sub();

        // add 호출

        sub.add1(arr1[0], arr1[1]);
        sub.add1(arr2[0], arr2[1]);
        sub.add1(arr3[0], arr3[1]);
        // sub.add1(args[1], args[1]);

    
        sub.add2(arr1[0], arr1[1]);
        sub.add2(arr2[0], arr2[1]);
        sub.add2(arr3[0], arr3[1]);

    }
}
