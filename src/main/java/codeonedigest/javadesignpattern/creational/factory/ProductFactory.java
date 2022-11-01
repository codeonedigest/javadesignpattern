package codeonedigest.javadesignpattern.creational.factory;

public class ProductFactory {

    public Product createProduct(String type) {
        if(type.equals("B")) {
            return new ProductB();
        } else {
            return new ProductA();
        }
    }
}
