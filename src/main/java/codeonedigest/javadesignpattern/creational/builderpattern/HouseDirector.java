package codeonedigest.javadesignpattern.creational.builderpattern;

public class HouseDirector {

    public House constructHouse(HouseBuilder builder) {
        House house = builder.createHouse();
        System.out.println(house.getRepresentation());
        return house;
    }
}
