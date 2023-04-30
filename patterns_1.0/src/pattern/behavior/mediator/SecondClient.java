package pattern.behavior.mediator;

public class SecondClient implements Client{

    private Chat chat;

    @Override
    public void sendMessage(String string) {
        chat.sendToClientsFromClient(this, string);
    }

    @Override
    public void getMessage(String string) {
        System.out.println("SecondGetMessage: " + string);
    }

    @Override
    public void setChat(Chat chat) {
        this.chat = chat;
    }
}
