package TryCatchFinallyRuntimeExceptionExample;

public class Sub {


    public void add1(String a, String b){
        
        String data1 = null;
        String data2 = null;
        
        try{
            data1 = a;
            data2 = b;

            System.out.println("data1 값: " + data1);
            System.out.println("data2 값: " + data2);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("실행 매개값의 수가 부족합니다.");
            return;
        }
    }

    
    public void add2(String a, String b){

        String data1 = null;
        String data2 = null;

        data1 = a;
        data2 = b;
        
        try{
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
            int result = value1 + value2;

            System.out.println(data1 + " + " + data2 + " = " + result);
        }
        catch(NumberFormatException e){
            System.out.println("숫자로 변환할 수 없습니다.");
        }
        finally{
            System.out.println("다시 실행하세요.");
        }
    }



}