package codeonedigest.javadesignpattern.behavioral.interpreter;

import java.util.ArrayList;
import java.util.List;

public class InterpreterPatternTest {
    public static void main(String args[]) {
        String contextString1 = "dd mmm yyyy";

        String day = "22";
        String month = "JUN";
        String year = "2022";

        testExpression(contextString1, day, month, year); //Test1

        String contextString2 = "yyyy mmm dd";
        testExpression(contextString2, day, month, year); //Test2
    }

    private static void testExpression(String contextString1, String day, String month, String year) {
        ClsContext contextObject = new ClsContext(contextString1);
        System.out.println("Our context is " + contextString1);

        String []contextArray = contextObject.getStrExpression().split(" ");

        List<ClsAbstractExpression> expressionList = new ArrayList<>();

        for (String str : contextArray) {
            if (str.equalsIgnoreCase("dd")) {
                expressionList.add(new ClsDayExpression(day));
            } else if (str.equalsIgnoreCase("mmm")) {
                expressionList.add(new ClsMonthExpression(month));
            } else if (str.equalsIgnoreCase("yyyy")) {
                expressionList.add(new ClsYearExpression(year));
            }
        }

        expressionList.add(new ClsSeperatorExpression());


        for (ClsAbstractExpression expression : expressionList) {
            expression.evaluate(contextObject);
        }

        System.out.println(contextObject.getStrExpression());
    }
}
