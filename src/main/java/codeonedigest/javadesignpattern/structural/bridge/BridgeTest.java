package codeonedigest.javadesignpattern.structural.bridge;

import org.springframework.cglib.core.ObjectSwitchCallback;

public class BridgeTest {

    public static void main(String args[]) {
        IEquipment objBulb = new Bulb();
        IEquipment objRefrigerator = new Refrigerator();

        ClsSwitch objSwitch = new ClsSwitch();

        //Testing bridge pattern.
        //Will use same switch to turn on / off different electrical equipment

        //Using switch for Build
        objSwitch.setEquipment(objBulb);
        objSwitch.on();
        objSwitch.off();

        //Using same Switch for Refrigerator
        objSwitch.setEquipment(objRefrigerator);
        objSwitch.on();
        objSwitch.off();
    }
}
