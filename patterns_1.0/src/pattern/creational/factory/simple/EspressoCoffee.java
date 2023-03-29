package pattern.creational.factory.simple;

public class EspressoCoffee implements Coffee{

    @Override
    public void smell() {
        System.out.println("Smells as espresso");
    }
}
