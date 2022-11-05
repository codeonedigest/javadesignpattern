package codeonedigest.javadesignpattern.structural.bridge;

public class Bulb implements IEquipment {
    @Override
    public void start() {
        System.out.println("Started Bulb");
    }

    @Override
    public void stop() {
        System.out.println("Stopped Bulb");
    }
}
