package pattern.behavior.chain;

public class NegativeNumberHandler extends NumberHandler{
    @Override
    public void handle(int num) {
        if (num < 0) {
            System.out.println("Handled negative number: " + num);
        } else {
            nextHandler.handle(num);
        }
    }
}
