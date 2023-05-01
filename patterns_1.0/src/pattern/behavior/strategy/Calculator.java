package pattern.behavior.strategy;

public class Calculator {

    private OperationStrategy operationStrategy;

    public Calculator(OperationStrategy operationStrategy) {
        this.operationStrategy = operationStrategy;
    }

    public void setOperationStrategy(OperationStrategy operationStrategy) {
        this.operationStrategy = operationStrategy;
    }

    public int calc(int a, int b) {
        return operationStrategy.compute(a, b);
    }
}
