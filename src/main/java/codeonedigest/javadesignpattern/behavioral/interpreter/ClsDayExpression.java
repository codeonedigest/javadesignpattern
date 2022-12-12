package codeonedigest.javadesignpattern.behavioral.interpreter;

public class ClsDayExpression extends ClsAbstractExpression {

    public ClsDayExpression(String data) {
        this.data = data;
    }

    @Override
    public void evaluate(ClsContext objContext) {
        String str = objContext.getStrExpression();
        objContext.setStrExpression(str.replace("dd", data));
    }
}
