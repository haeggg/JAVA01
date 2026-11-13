import static java.lang.System.out;
// 잘 안 쓰는 형태
import static java.lang.Math.*;

public class StaticImportEx1 {
    public static void main(String[] args) {
        
        //System.out.println(random());
        out.println(random());

        //System.out.println("Math.PI: " + PI);
        out.println("Math.PI: " + PI);
    }
}
