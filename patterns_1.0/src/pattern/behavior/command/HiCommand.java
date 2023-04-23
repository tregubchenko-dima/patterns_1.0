package pattern.behavior.command;

public class HiCommand extends Command{
    public HiCommand(Robot robot) {
        super(robot);
    }

    @Override
    public void execute() {
        robot.sayHi();
    }
}
