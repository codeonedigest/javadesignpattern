package codeonedigest.javadesignpattern.behavioral.chainofresponsibility;

public class ClsProcess3 extends IProcess {
    @Override
    public void runProcess() {
        System.out.println("Running Process3...");

        if (process != null) {
            process.runProcess();
        }


    }
}
