package codeonedigest.javadesignpattern.structural.flyweight;

public class ClsFixedAddress {

    public String address = "#454 Prestige Tower, MSR Nagar, Bangalore, 560016 India";

    static ClsFixedAddress clsFixedAddress;

    private ClsFixedAddress() {

    }

    public static ClsFixedAddress getClsFixedAddress() {
        if (clsFixedAddress == null) {
            clsFixedAddress = new ClsFixedAddress();
        }
        return clsFixedAddress;
    }

    public String getAddress() {
        return address;
    }
}
