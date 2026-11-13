package pack1;

public class PackageA {
    
    PackageA a1 = new PackageA(true);
    PackageA a2 = new PackageA(1);
    PackageA a3 = new PackageA("문자열");

    
    public PackageA(boolean b){}
    PackageA(int b){}
    // public 생략한 경우, defulte로 설정됨
    // 다른 패키지에서는 사용 불가

    private PackageA(String s){}
    // private 는 다른 패키지, 클래스에서 사용 불가

}
