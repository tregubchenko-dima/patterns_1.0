package pattern.behavior.chain;

public class ZeroNumberHandler extends NumberHandler{
    @Override
    public void handle(int num) {
        if (num == 0) {
            System.out.println("Handled zero number: " + num);
        } else {
            nextHandler.handle(num);
        }
    }
}
