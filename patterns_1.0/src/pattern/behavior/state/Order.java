package pattern.behavior.state;

public class Order {

    private State state = new OrderedState();

    public void setState(State state) {
        this.state = state;
    }

    public void nextState() {
        state.nextState(this);
    }

    public void prevState(){
        state.prevState(this);
    }

    public void printStatus() {
        state.handle();
    }
}
