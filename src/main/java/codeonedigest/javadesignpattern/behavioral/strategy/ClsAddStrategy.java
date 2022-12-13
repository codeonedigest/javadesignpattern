package codeonedigest.javadesignpattern.behavioral.strategy;

public class ClsAddStrategy extends ClsStrategy{

    @Override
    public int calculate(int a, int b) {
        return a+b;
    }
}
