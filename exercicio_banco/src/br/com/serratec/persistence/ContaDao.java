package br.com.serratec.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.serratec.conexao.ConnectionFactory;
import br.com.serratec.model.Conta;

public class ContaDao {
    private Connection connection;

    public ContaDao() {
        connection = new ConnectionFactory().getconnection();
    }

    public void inserirConta(Conta conta) {
        String sql = "insert into conta(titular,saldo) values(?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, conta.getTitular());
            stmt.setDouble(2, conta.getSaldo());
            stmt.execute();
            stmt.close();
            connection.close();
            System.out.println("Conta inserida");
        } catch (SQLException e) {
            System.err.println("Conta não inserida");
            e.printStackTrace();
        }
    }

    public void saque(Integer numero_conta, Double valor) {
        String sql1 = "select saldo from conta where numero_conta = ?";
        String sql2 = "update conta(saldo) values(?) where numero_conta = ?";
            Double saldoAtual = 0.0;
            try {
                PreparedStatement stmt = connection.prepareStatement(sql1);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    saldoAtual = rs.getDouble(sql1);
                }

            } catch (Exception e) {
                // TODO: handle exception
            }
        try {
            if (valor <=saldoAtual) {
                PreparedStatement stmt = connection.prepareStatement(sql2);
                stmt.setDouble(1, saldoAtual - valor);
                stmt.execute();
                stmt.close();
                System.out.println("Saque executado, seu saldo atual é: R$" + saldoAtual);
                connection.close();
            }else{
                System.out.println("Valor inválido, seu saldo atual é: R$" + saldoAtual);
            }
        } catch (SQLException e) {
            System.err.println("Saque não realizado");
            e.printStackTrace();
        }

    }
}
