package codeonedigest.javadesignpattern.behavioral.interpreter;

public class ClsYearExpression extends ClsAbstractExpression {

    public ClsYearExpression(String data) {
        this.data = data;
    }

    @Override
    public void evaluate(ClsContext objContext) {
        String str = objContext.getStrExpression();
        objContext.setStrExpression(str.replace("yyyy", data));
    }
}
