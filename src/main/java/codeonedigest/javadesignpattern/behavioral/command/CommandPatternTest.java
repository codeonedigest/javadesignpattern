package codeonedigest.javadesignpattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class CommandPatternTest {
    static List<IExecute> commandExecutionList = new ArrayList<>();

    public static void main(String args[]) {


        commandExecutionList.add(new ClsExecuteOpenCommand());
        commandExecutionList.add(new ClsExecuteFileCommand());
        commandExecutionList.add(new ClsExecuteSaveCommand());
        commandExecutionList.add(new ClsExecutePrintCommand());


        System.out.println(getCommand("OPEN").command);
        getCommand("OPEN").executeCommand();

        System.out.println(getCommand("FILE").command);
        getCommand("FILE").executeCommand();

        System.out.println(getCommand("SAVE").command);
        getCommand("SAVE").executeCommand();

        System.out.println(getCommand("PRINT").command);
        getCommand("PRINT").executeCommand();

    }

    public static IExecute getCommand(String command) {
        for(IExecute executeCommandObject : commandExecutionList) {
            if (executeCommandObject.command.equalsIgnoreCase(command)) {
                return executeCommandObject;
            }
        }
        return null;
    }
}
