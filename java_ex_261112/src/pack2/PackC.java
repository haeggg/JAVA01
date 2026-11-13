package pack2;

import pack1.PackA;

public class PackC {
    public PackC(){
        PackA a = new PackA();

        a.field1 = 1;
        //a.field2 = 2;
        // a.field3 = 3;

        a.method1();
        //a.method2();
        // a.method3();
    }
}
