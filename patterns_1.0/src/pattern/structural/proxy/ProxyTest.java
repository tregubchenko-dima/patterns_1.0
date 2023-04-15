package pattern.structural.proxy;

public class ProxyTest {

    public static void main(String[] args){
        Door door = new CacheDoorProxy(new WoodDoor());

        door.open();
        door.open();

        door.close();
        door.close();
    }
}
