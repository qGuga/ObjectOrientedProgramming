import DAO.ClientDAO;
import entity.Client;

public class App {
    public static void main(String[] args) throws Exception {
        // User usuario = new User();
        // usuario.setNome("Allan");
        // usuario.setLogin("AllanGabriel");
        // usuario.setSenha("allan#123");
        // usuario.setEmail("allangabriel2415@gmail.com");
        // User usuario2 = new User();
        // usuario2.setNome("Alexandre");
        // usuario2.setLogin("CarlosAlexandre");
        // usuario2.setSenha("seinão");
        // usuario2.setEmail("calexandre.paivap@gmail.com");

        // new UserDAO().cadastrarUser(usuario);
        // new UserDAO().cadastrarUser(usuario2);

        // Client client = new Client();
        // client.setNome("Bruno Borges");
        // client.setCpf("78945612385");
        // Client client2 = new Client();
        // client2.setNome("Leonardo");
        // client2.setCpf("25896314756");
        // ClienteDAO clienteDAO = new ClienteDAO();
        // clienteDAO.cadastrarUser(client);
        // new ClienteDAO().cadastrarUser(client2);
        // Client client3 = new Client();
        // client3.setName("Leticia");
        // client3.setCpf("45698712365");
        // new ClientDAO().resgisterClient(client3);
        Client client4 = new Client();
        client4.setName("Pedro");
        client4.setCpf("76598509587");
        new ClientDAO().resgisterClient(client4);
    }
}
