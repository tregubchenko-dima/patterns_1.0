package pattern.structural.proxy;

public class WoodDoor implements Door{

    @Override
    public void open() {
        System.out.println("Opened wood door");
    }

    @Override
    public void close() {
        System.out.println("Closed wood door");
    }
}
