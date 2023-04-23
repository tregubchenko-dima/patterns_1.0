package pattern.behavior.chain;

public abstract class NumberHandler {

    protected NumberHandler nextHandler;

    public void setNextHandler(NumberHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handle(int num);
}
