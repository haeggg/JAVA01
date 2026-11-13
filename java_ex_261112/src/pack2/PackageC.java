package pack2;

import pack1.*;

public class PackageC {
    
    PackageA a1 = new PackageA(true);
    // PackageA a2 = new PackageA(1);
    // default 다른 패키지에서 접근 불가

    // PackageA a3 = new PackageA("문자열");
    // ^ private 다른 클래스에서는 접근 불가
}
