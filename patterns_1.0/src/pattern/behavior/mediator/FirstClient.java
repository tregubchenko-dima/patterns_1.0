package pattern.behavior.mediator;

public class FirstClient implements Client{

    private Chat chat;

    @Override
    public void sendMessage(String string) {
        chat.sendToClientsFromClient(this, string);
    }

    @Override
    public void getMessage(String string) {
        System.out.println("FirstGetMessage: " + string);
    }

    @Override
    public void setChat(Chat chat) {
        this.chat = chat;
    }
}
