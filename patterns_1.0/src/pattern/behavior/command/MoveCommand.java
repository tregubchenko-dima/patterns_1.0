package pattern.behavior.command;

public class MoveCommand extends Command {
    public MoveCommand(Robot robot) {
        super(robot);
    }

    @Override
    public void execute() {
        robot.move();
    }
}
