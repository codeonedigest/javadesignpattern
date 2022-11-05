package codeonedigest.javadesignpattern.structural.bridge;

public class Refrigerator implements IEquipment {
    @Override
    public void start() {
        System.out.println("Started Refrigerator");
    }

    @Override
    public void stop() {
        System.out.println("Stopped Refrigerator");
    }
}
