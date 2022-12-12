package codeonedigest.javadesignpattern.behavioral.mediator;

public class Flight implements Command {
    private String flightNumber;
    private final IATCMediator atcMediator;

    public Flight(String flightNumber, IATCMediator atcMediator) {
        this.flightNumber = flightNumber;
        this.atcMediator = atcMediator;
    }

    public void land() {
        if (atcMediator.isLandingOk()) {
            System.out.println("Successfully Landed flight " + flightNumber);
            atcMediator.setLandingStatus(true);
        } else
            System.out.println(flightNumber + " Waiting for landing.");
    }

    public void getReady() {
        System.out.println(flightNumber + " Ready for landing.");
    }
}
