import java.io.IOException;

public class KeyboardToStringExample {
    
    public static void main(String[] args)  throws IOException {
        
        
        // 키보드로부터 읽은 바이트 배열을 문자열로 변환

        byte[] bytes = new byte[100];

        System.out.print("입력: ");
        int readByteNo = System.in.read(bytes);

        String str = new String(bytes, 0, readByteNo-2);
        // byte[] 배열을 문자열로 변환하는 생성자
        // 파일의 내용을 읽거나 네트워크를 통해 받은 데이터는 보통 byte[] 배열

        // readByteNo-2 엔터키 자리 제외

        System.out.println(str);
    }
}
