package pattern.behavior.strategy;

public class PlusOperation implements OperationStrategy{
    @Override
    public int compute(int a, int b) {
        return a + b;
    }
}
