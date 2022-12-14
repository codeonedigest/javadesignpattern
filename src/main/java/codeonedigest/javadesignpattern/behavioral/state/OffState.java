package codeonedigest.javadesignpattern.behavioral.state;

public class OffState extends BulbState {

    public OffState() {
        this.stateName = "OFF";
    }

    @Override
    public void changeState(Bulb bulb) {
        System.out.println("Changed the state of Bulb. Bulb is now in OFF State");
    }
}
