package pattern.behavior.strategy;

public class StrategyTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator(new MinusOperation());
        System.out.println(calculator.calc(3, 1));

        calculator.setOperationStrategy(new PlusOperation());
        System.out.println(calculator.calc(3,1));
    }
}
