package pattern.behavior.command;

public class MechanicalRobot implements Robot{
    @Override
    public void sayHi() {
        System.out.println("Hi, I'm mechanicalRobot!");
    }

    @Override
    public void move() {
        System.out.println("mechanicalRobot is moving");
    }

    @Override
    public void sayGoodbye() {
        System.out.println("Goodbye from mechanicalRobot!");
    }
}
