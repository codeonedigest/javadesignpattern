package codeonedigest.javadesignpattern.behavioral.mediator;

public class MediatorPatternTest {

    public static void main(String[] args) {

        IATCMediator atcMediator = new ATCMediator();
        Flight indigo1001 = new Flight("indigo1001", atcMediator);
        Runway mainRunway = new Runway("runway1", atcMediator);
        atcMediator.registerFlight(indigo1001);
        atcMediator.registerRunway(mainRunway);
        indigo1001.getReady();
        mainRunway.land();
        indigo1001.land();

    }
}
