package pattern.structural.proxy;

public class CacheDoorProxy implements Door{

    private final Door door;
    private boolean isOpen;

    public CacheDoorProxy(Door door) {
        this.door = door;
    }

    @Override
    public void open() {
        if (!isOpen){
            door.open();
            isOpen = true;
        } else {
            System.out.println("Already open");
        }
    }

    @Override
    public void close() {
        if (isOpen) {
            door.close();
            isOpen = false;
        } else {
            System.out.println("The Door has been closed before");
        }
    }
}
