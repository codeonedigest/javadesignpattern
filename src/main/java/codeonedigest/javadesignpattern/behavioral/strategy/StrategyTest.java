package codeonedigest.javadesignpattern.behavioral.strategy;

public class StrategyTest {

    public static void main(String []args) {
        ClsCalculator calculator = new ClsCalculator();
        calculator.number1 = 10;
        calculator.number2 = 5;

        calculator.setStrategy(new ClsAddStrategy());
        int result1 = calculator.calculate();
        System.out.println("Result1 - " + result1);

        calculator.setStrategy(new ClsMinusStrategy());
        int result2 = calculator.calculate();
        System.out.println("Result2 - " + result2);
    }
}
