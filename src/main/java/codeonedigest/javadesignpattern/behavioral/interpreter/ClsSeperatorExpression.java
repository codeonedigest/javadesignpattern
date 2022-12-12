package codeonedigest.javadesignpattern.behavioral.interpreter;

public class ClsSeperatorExpression extends ClsAbstractExpression {
    @Override
    public void evaluate(ClsContext objContext) {
        String str = objContext.getStrExpression();
        objContext.setStrExpression(str.replace(" ", "-"));
    }
}
