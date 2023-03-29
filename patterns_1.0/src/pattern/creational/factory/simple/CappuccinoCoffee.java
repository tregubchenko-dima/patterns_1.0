package pattern.creational.factory.simple;

public class CappuccinoCoffee implements Coffee{

    @Override
    public void smell() {
        System.out.println("Smells as cappuccino");
    }
}
