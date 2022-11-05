package codeonedigest.javadesignpattern.structural.bridge;

public class ClsSwitch implements ISwitch{

    IEquipment equipment;

    public void setEquipment(IEquipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public void on() {
        equipment.start();
    }

    @Override
    public void off() {
        equipment.stop();
    }
}
