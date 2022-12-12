package codeonedigest.javadesignpattern.behavioral.command;

public class ClsExecutePrintCommand extends IExecute {

    public ClsExecutePrintCommand() {
        command = "PRINT";
    }

    @Override
    public void executeCommand() {
        System.out.println("PRINT Command Executed Successfully");
    }
}
