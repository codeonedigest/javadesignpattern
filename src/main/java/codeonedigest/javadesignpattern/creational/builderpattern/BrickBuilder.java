package codeonedigest.javadesignpattern.creational.builderpattern;

public class BrickBuilder extends HouseBuilder {
    @Override
    public House createHouse() {

        house = new BrickHouse();
        return house;
    }
}
