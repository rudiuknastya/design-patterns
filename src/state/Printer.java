package state;

public class Printer {
    private State state;

    public void setState(State state) {
        this.state = state;
    }
    public void nextState(){
        state.next(this);
    }
}
