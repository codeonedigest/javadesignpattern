package codeonedigest.javadesignpattern.behavioral.memento;

public class Originator {
    private String state;

    public Memento setState(String state){
        this.state = state;
        return saveStateToMemento();
    }

    public String getState(){
        return state;
    }

    private Memento saveStateToMemento(){
        System.out.println("Saving state to Memento - " + state);
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }
}
