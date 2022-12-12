package codeonedigest.javadesignpattern.behavioral.command;

public class ClsExecuteOpenCommand extends IExecute {

    public ClsExecuteOpenCommand() {
        command = "OPEN";
    }

    @Override
    public void executeCommand() {
        System.out.println("Open Command Executed Successfully");
    }
}
