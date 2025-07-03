import java.util.List;

import DAO.ClientDAO;
import entity.Client;
import services.ClientService;

public class App {
    public static void main(String[] args) throws Exception {
        final ClientDAO clientDAO = new ClientDAO();
        ClientService clientService = new ClientService(clientDAO);
//        clientService.newClient("Allan Gabriel", "09876543212");
        // List<Client> clients = clientService.getAllClients();
        // for(Client client: clients){
        //     System.out.println(client);
        // }
        
        clientService.displayClient(8);
        
        // clientService.deletedClient(4);
    }
}
