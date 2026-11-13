package pack1;

public class PackB {
    
    public PackB(){

        PackA a = new PackA();
        a.field1 = 1;
        a.field2 = 2;
        // a.field3 = 3;

        a.method1();
        a.method2();
        // a.method3();

    }
}
