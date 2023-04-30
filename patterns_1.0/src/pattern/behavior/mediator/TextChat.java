package pattern.behavior.mediator;

import java.util.ArrayList;
import java.util.List;

public class TextChat implements Chat{

    private final List<Client> clients = new ArrayList<>();

    @Override
    public void sendToClientsFromClient(Client clientFrom, String msg) {
        for (Client client: clients) {
            if (!client.equals(clientFrom)) {
                client.getMessage(msg);
            }
        }
    }

    @Override
    public void addClient(Client client) {
        client.setChat(this);
        clients.add(client);
    }
}
