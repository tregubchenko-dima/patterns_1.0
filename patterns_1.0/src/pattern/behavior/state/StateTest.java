package pattern.behavior.state;

public class StateTest {

    public static void main(String[] args) {
        Order order = new Order();
        order.printStatus();
        order.nextState();
        order.printStatus();
        order.nextState();
        order.printStatus();

        order.prevState();
        order.printStatus();
    }
}
