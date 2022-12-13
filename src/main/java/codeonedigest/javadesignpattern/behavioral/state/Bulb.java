package codeonedigest.javadesignpattern.behavioral.state;

public class Bulb {

    BulbState bulbState;

    public Bulb() {
        bulbState = new OffState();
    }

    public void pressButton() {
        bulbState.changeState(this);
    }





    public BulbState getBulbState() {
        return bulbState;
    }

    public void setBulbState(BulbState bulbState) {
        this.bulbState = bulbState;
    }
}
