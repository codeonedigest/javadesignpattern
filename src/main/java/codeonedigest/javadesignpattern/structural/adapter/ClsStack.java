package codeonedigest.javadesignpattern.structural.adapter;

public class ClsStack extends StackBase {
    @Override
    public void push(String s) {
        System.out.println("Pushed element " + s + " in stack");
    }
}
