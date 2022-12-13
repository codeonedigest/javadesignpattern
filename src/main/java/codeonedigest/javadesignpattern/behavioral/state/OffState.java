package codeonedigest.javadesignpattern.behavioral.state;

public class OffState extends BulbState {

    public OffState() {
        this.stateName = "OFF";
    }

    @Override
    public void changeState(Bulb bulb) {
        System.out.println("Current Bulb State is - " + bulb.getBulbState().stateName);
    }
}
