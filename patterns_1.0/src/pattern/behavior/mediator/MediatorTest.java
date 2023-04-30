package pattern.behavior.mediator;

public class MediatorTest {

    public static void main(String[] args) {
        Client first = new FirstClient();
        Client second = new SecondClient();
        Client third = new ThirdClient();

        Chat chat = new TextChat();
        chat.addClient(first);
        chat.addClient(second);
        chat.addClient(third);

        first.sendMessage("Hello from firstClient!");
    }
}
