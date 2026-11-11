public class CalculatorTestExample {
    
    public static void main(String[] args) {
        
        CalculatorTest myCalc = new CalculatorTest();

        myCalc.execute(7, 10);
        myCalc.execute(7.0, 10.0);
        myCalc.execute(7L, 10L);

    }
}
