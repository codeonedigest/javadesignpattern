package codeonedigest.javadesignpattern.creational.builderpattern;

public class Test {

    public static void main(String args[]) {
        HouseDirector director = new HouseDirector();

        HouseBuilder woodBuilder = new WoodBuilder();
        House woodHouse = director.constructHouse(woodBuilder); //creating wood house

        HouseBuilder brickBuilder = new BrickBuilder();
        House brickHouse = director.constructHouse(brickBuilder); //creating brick house

    }
}
