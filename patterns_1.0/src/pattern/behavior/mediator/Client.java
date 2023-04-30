package pattern.behavior.mediator;

public interface Client {

    void sendMessage(String string);

    void getMessage(String string);

    void setChat(Chat chat);
}
