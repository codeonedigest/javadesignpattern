package codeonedigest.javadesignpattern.behavioral.strategy;

public class ClsCalculator {

    public int number1 = 0;

    public int number2 = 0;

    public ClsStrategy strategy;

    public void setStrategy(ClsStrategy clsStrategy) {
        this.strategy = clsStrategy;
    }

    public int calculate() {
        return strategy.calculate(number1, number2);
    }

}
