package pattern.behavior.mediator;

public interface Chat {

    void sendToClientsFromClient(Client clientFrom, String msg);

    void addClient(Client client);
}
