package pattern.behavior.command;

public class ElectroRobot implements Robot{
    @Override
    public void sayHi() {
        System.out.println("Hi, I'a electroRobot!");
    }

    @Override
    public void move() {
        System.out.println("ElectroRobot is moving");
    }

    @Override
    public void sayGoodbye() {
        System.out.println("Goodbye from electroRobot!");
    }
}
