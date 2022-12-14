package codeonedigest.javadesignpattern.behavioral.state;

public class OnState extends BulbState {

    public OnState(){
        this.stateName = "ON";
    }


    @Override
    public void changeState(Bulb bulb) {
        System.out.println("Changed the state of Bulb. Bulb is now in ON State");
    }
}
