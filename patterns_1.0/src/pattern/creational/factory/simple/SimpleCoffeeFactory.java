package pattern.creational.factory.simple;

public class SimpleCoffeeFactory {

    public static Coffee createCoffee(CoffeeType coffeeType) {
        return switch (coffeeType) {
            case AMERICANO -> new AmericanoCoffee();
            case CAPPUCCINO -> new CappuccinoCoffee();
            case ESPRESSO -> new EspressoCoffee();
        };
    }
}
