package pattern.creational.factory.simple;

public class AmericanoCoffee implements Coffee{

    @Override
    public void smell() {
        System.out.println("Smells as americano");
    }
}
