package codeonedigest.javadesignpattern.behavioral.memento;

public class MementoPatternTest {
    public static void main(String[] args) {

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        careTaker.add(originator.setState("State #1"));
        careTaker.add(originator.setState("State #2"));
        careTaker.add(originator.setState("State #3"));
        careTaker.add(originator.setState("State #4"));
        System.out.println("Current State: " + originator.getState());


        System.out.println("==> Now Reverting to 2nd State");
        originator.setState(careTaker.get(1).getState());
        System.out.println("Current State: " + originator.getState());
    }
}
