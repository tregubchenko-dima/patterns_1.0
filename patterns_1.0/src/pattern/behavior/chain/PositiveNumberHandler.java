package pattern.behavior.chain;

public class PositiveNumberHandler extends NumberHandler{
    @Override
    public void handle(int num) {
        if (num > 0) {
            System.out.println("Positive number handled: " + num);
        } else {
            nextHandler.handle(num);
        }
    }
}
