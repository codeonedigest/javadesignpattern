package codeonedigest.javadesignpattern.behavioral.interpreter;

public class ClsMonthExpression extends ClsAbstractExpression {
    public ClsMonthExpression(String data) {
        this.data = data;
    }

    @Override
    public void evaluate(ClsContext objContext) {
        String str = objContext.getStrExpression();
        objContext.setStrExpression(str.replace("mmm", data));
    }
}
