package codeonedigest.javadesignpattern.behavioral.chainofresponsibility;

public class ClsProcess2 extends IProcess {
    @Override
    public void runProcess() {
        System.out.println("Running Process2...");

        if (process != null) {
            process.runProcess();
        }


    }
}
