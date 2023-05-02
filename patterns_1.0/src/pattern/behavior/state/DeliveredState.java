package pattern.behavior.state;

public class DeliveredState implements State{

    @Override
    public void nextState(Order order) {
        order.setState(new ReceivedState());
    }

    @Override
    public void prevState(Order order) {
        order.setState(new OrderedState());
    }

    @Override
    public void handle() {
        System.out.println("Заказ доставлен");
    }
}
