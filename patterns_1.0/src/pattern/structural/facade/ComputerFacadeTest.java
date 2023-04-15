package pattern.structural.facade;

public class ComputerFacadeTest {

    public static void main(String[] args) {
        Computer computer = new Computer();
        ComputerFacade computerFacade = new ComputerFacade(computer);

        computerFacade.turnOn();
        computerFacade.turnOff();
    }
}
