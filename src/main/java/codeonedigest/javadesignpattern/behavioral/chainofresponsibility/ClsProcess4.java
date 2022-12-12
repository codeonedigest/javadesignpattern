package codeonedigest.javadesignpattern.behavioral.chainofresponsibility;

public class ClsProcess4 extends IProcess {
    @Override
    public void runProcess() {
        System.out.println("Running Process4...");

        if (process != null) {
            process.runProcess();
        }


    }
}
