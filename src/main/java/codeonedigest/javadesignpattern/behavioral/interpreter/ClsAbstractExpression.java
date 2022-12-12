package codeonedigest.javadesignpattern.behavioral.interpreter;

public abstract class ClsAbstractExpression {

    String data;

    public abstract void evaluate(ClsContext objContext);
}
