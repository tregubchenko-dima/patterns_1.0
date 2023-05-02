package pattern.behavior.state;

import javax.naming.OperationNotSupportedException;

public class ReceivedState implements State{

    @Override
    public void nextState(Order order) {

    }

    @Override
    public void prevState(Order order) {
        order.setState(new DeliveredState());
    }

    @Override
    public void handle() {
        System.out.println("Заказ получен");
    }
}
