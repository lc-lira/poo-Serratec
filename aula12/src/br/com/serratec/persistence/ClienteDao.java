package br.com.serratec.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.serratec.conexao.ConnectionFactory;
import br.com.serratec.model.Cliente;

public class ClienteDao {
    private Connection connection;

    public ClienteDao() {
        connection = new ConnectionFactory().getConnection();
    }

    public void inserir(Cliente cliente) {
        String sql = "insert into cliente(nome,email) values (?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEmail());
            stmt.execute();
            stmt.close();
            connection.close();
            System.out.println("Cliente inserido com sucesso!");

        } catch (SQLException e) {
            System.err.println("Cliente não inserido!");
        }

    }

    public void alterar(Cliente cliente) {
        String sql = "update cliente set nome =?, email=? where id=?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEmail());
            stmt.setInt(3, cliente.getId());
            stmt.execute();
            stmt.close();
            connection.close();
            System.out.println("Dados do cliente alterados com sucesso!");

        } catch (SQLException e) {
            System.err.println("Cliente não inserido!");
        }

    }

    public void apagar(int codigo) {
        String sql = "delete from cliente where=?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, codigo);
            stmt.execute();
            stmt.close();
            connection.close();
        } catch (Exception e) {
            System.err.println("Cliente não removido!");
            e.printStackTrace();
        }

    }

    public List<Cliente> listar() {
        String sql = "select * from cliente";
        List<Cliente> clientes = new ArrayList<>();
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente(rs.getInt("id"), rs.getString("nome"), rs.getString("email"));
                clientes.add(cliente);
            }
            rs.close();
            stmt.close();
            connection.close();

        } catch (SQLException e) {
            System.err.println("Problemas ao listar os clientes");
            e.printStackTrace();
        }
        return clientes;
    }
}