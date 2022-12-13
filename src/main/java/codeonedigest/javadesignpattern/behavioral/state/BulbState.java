package codeonedigest.javadesignpattern.behavioral.state;

public abstract class BulbState {

    public String stateName;

    public abstract void changeState(Bulb bulb);
}
