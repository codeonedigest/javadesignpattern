package codeonedigest.javadesignpattern.behavioral.state;

public class StatePatternTest {

    public static void main(String []args) {
        Bulb bulb = new Bulb();


        bulb.setBulbState(new OnState());
        bulb.pressButton();
        bulb.pressButton();
        bulb.pressButton();
        bulb.setBulbState(new OffState());
        bulb.pressButton();
        bulb.pressButton();
        bulb.pressButton();
        bulb.setBulbState(new OnState());
        bulb.pressButton();
        bulb.pressButton();
        bulb.pressButton();

    }
}
