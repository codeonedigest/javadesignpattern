package codeonedigest.javadesignpattern.behavioral.state;

public class OnState extends BulbState {

    public OnState(){
        this.stateName = "ON";
    }


    @Override
    public void changeState(Bulb bulb) {
        System.out.println("Current Bulb State is - " + bulb.getBulbState().stateName);
    }
}
