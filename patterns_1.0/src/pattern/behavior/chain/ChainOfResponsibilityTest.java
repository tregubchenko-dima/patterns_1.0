package pattern.behavior.chain;

public class ChainOfResponsibilityTest {

    public static void main(String[] args) {
        NumberHandler negNumberHandler = new NegativeNumberHandler();
        NumberHandler zeroNumberHandler = new ZeroNumberHandler();
        NumberHandler posNumberHandler = new PositiveNumberHandler();

        negNumberHandler.setNextHandler(zeroNumberHandler);
        zeroNumberHandler.setNextHandler(posNumberHandler);

        negNumberHandler.handle(-10);
        negNumberHandler.handle(0);
        negNumberHandler.handle(10);
    }
}
