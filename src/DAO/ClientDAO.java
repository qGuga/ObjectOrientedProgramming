package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import conection.Conection;
import entity.Client;

public class ClientDAO {
    public void resgisterClient(Client client){
        String sql = "INSERT INTO cliente (NOME_CLIENTE, CPF_CLIENTE) VALUES (?, ?)";

        PreparedStatement ps = null;
        try {
            ps = Conection.getConnection().prepareStatement(sql);

            ps.setString(1, client.getName());
            ps.setString(2, client.getCpf());

            ps.execute();
            ps.close();
            
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
