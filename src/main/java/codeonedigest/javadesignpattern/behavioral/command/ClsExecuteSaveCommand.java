package codeonedigest.javadesignpattern.behavioral.command;

public class ClsExecuteSaveCommand extends IExecute {

    public ClsExecuteSaveCommand() {
        command = "SAVE";
    }

    @Override
    public void executeCommand() {
        System.out.println("SAVE Command Executed Successfully");
    }
}
