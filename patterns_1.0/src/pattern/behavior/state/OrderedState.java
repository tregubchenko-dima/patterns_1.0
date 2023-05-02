package pattern.behavior.state;

public class OrderedState implements State{

    @Override
    public void nextState(Order order) {
        order.setState(new DeliveredState());
    }

    @Override
    public void prevState(Order order) {

    }

    @Override
    public void handle() {
        System.out.println("Сделан заказ");
    }
}
