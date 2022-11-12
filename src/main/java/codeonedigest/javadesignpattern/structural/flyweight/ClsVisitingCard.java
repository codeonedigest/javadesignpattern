package codeonedigest.javadesignpattern.structural.flyweight;

public class ClsVisitingCard {

    private String name;


    public ClsVisitingCard(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return ClsFixedAddress.getClsFixedAddress().getAddress();
    }
}
