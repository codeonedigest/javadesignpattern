package codeonedigest.javadesignpattern.behavioral.mediator;

public class Runway implements Command {
    private String runwayNumber;

    private final IATCMediator atcMediator;

    public Runway(String runwayNumber, IATCMediator atcMediator) {
        this.runwayNumber = runwayNumber;
        this.atcMediator = atcMediator;
        atcMediator.setLandingStatus(true);
    }

    @Override
    public void land() {
        System.out.println("Landing permission granted on - " + runwayNumber);
        atcMediator.setLandingStatus(true);
    }
}
