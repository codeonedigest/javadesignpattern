package codeonedigest.javadesignpattern.creational.factory;

public abstract class Product {

    public void writeName(String name) {
        System.out.println("In Abstract class - Product name  - " + name);
    }
}
