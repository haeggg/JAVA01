public class Singleton {
    
    private static  Singleton singleton = new Singleton();

    // 하나의 애플리케이션 내 단 하나만 생성되는 객체
    // private
    
    private Singleton(){

    }

    static Singleton getInstance(){
        return singleton;
    }
}
