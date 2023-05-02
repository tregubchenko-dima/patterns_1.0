package pattern.behavior.state;

public interface State {
    void nextState(Order order);
    void prevState(Order order);
    void handle();
}
