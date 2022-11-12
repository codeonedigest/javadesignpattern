package codeonedigest.javadesignpattern.structural.decorator;

public class RoseBouquet extends FlowerBouquet {

    public RoseBouquet() {
        description = "Rose bouquet";
    }

    @Override
    public double cost() {
        return 12.0;
    }
}
