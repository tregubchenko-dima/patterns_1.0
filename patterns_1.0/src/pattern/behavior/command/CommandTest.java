package pattern.behavior.command;

import java.util.ArrayList;
import java.util.List;

public class CommandTest {

    public static void main(String[] args) {
        Robot electroRobot = new ElectroRobot();
        List<Command> commandList = new ArrayList<>();
        commandList.add(new HiCommand(electroRobot));
        commandList.add(new HiCommand(electroRobot));
        commandList.add(new GoodbyeCommand(electroRobot));
        commandList.add(new MoveCommand(electroRobot));

        commandList.forEach(Command::execute);
    }
}
