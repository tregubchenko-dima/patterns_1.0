package pattern.behavior.strategy;

public class MinusOperation implements OperationStrategy{
    @Override
    public int compute(int a, int b) {
        return a - b;
    }
}
