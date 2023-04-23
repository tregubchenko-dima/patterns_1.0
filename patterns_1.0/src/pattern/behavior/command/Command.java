package pattern.behavior.command;

public abstract class Command {
    protected Robot robot;

    public Command(Robot robot) {
        this.robot = robot;
    }

    public abstract void execute();
}
