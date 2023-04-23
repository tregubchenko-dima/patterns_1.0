package pattern.behavior.command;

public class GoodbyeCommand extends Command {
    public GoodbyeCommand(Robot robot) {
        super(robot);
    }

    @Override
    public void execute() {
        robot.sayGoodbye();
    }
}
