package br.com.serratec.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private String url = "jdbc:postgresql://localhost:5432/exercicio_banco";
    private String usuario = "postgres";
    private String senha = "12345";
    private Connection connection;

    public Connection getconnection() {
        try {
            connection = DriverManager.getConnection(url, usuario, senha);
            if (connection != null) {
                System.out.println("Conectado");
                return connection;
            } else {
                System.out.println("Não conectado");
            }
        } catch (SQLException e) {
            System.out.println("Problema no driver ou senha incorreta");
            e.printStackTrace();
        }
        return connection;
    }
}
