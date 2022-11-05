package codeonedigest.javadesignpattern.structural.adapter;

public class ObjectAdapter extends ClsCollection {

    private ClsStack objStack = new ClsStack(); // Object Adapter using object composition of stack

    public void add(String s){
        objStack.push(s);
    }
}
