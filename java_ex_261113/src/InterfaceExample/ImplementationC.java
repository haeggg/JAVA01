package InterfaceExample;

public class ImplementationC implements InterfaceC{
    
    @Override 
    public void mathodA(){
        System.out.println("ImplementationC - methodA 실행");
    }

    @Override 
    public void mathodB(){
        System.out.println("ImplementationC - methodB 실행");
    }

    @Override 
    public void mathodC(){
        System.out.println("ImplementationC - methodC 실행");
    }

}