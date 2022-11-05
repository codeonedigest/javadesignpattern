package codeonedigest.javadesignpattern.structural.adapter;

public class ClsCollection extends CollectionBase {
    @Override
    public void add(String s) {
        System.out.println("Added element "+ s + " to list.");
    }
}
