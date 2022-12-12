package codeonedigest.javadesignpattern.behavioral.command;

public class ClsExecuteFileCommand extends IExecute {

    public ClsExecuteFileCommand() {
        command = "FILE";
    }

    @Override
    public void executeCommand() {
        System.out.println("FILE Command Executed Successfully");
    }
}
