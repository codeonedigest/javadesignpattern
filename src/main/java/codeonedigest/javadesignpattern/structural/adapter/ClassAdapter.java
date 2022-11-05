package codeonedigest.javadesignpattern.structural.adapter;

public class ClassAdapter extends ClsStack {

    public void add(String s) { //Class adapter adapting to CollectionBase
        this.push(s);
    }
}
