package codeonedigest.javadesignpattern.creational.factory;

public class FactoryPatternTest {

    public static void main(String[] args) {

        ProductFactory productFactory = new ProductFactory();

        Product productA = productFactory.createProduct("A"); //Factory class creating ProductA
        productA.writeName("productA");


        Product productB = productFactory.createProduct("B"); //Factory class creating ProductB
        productB.writeName("productB");

    }
}
