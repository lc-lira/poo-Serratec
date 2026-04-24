package br.com.serratec.conexao;

import java.util.Scanner;

import br.com.serratec.model.Conta;
import br.com.serratec.persistence.ContaDao;

public class TesteInserirConta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaDao dao = new ContaDao();

        System.out.println("Digite o nome do titular");
        String titular = sc.next();

        System.out.println("Digite o saldo da conta");
        Double saldo = sc.nextDouble();

        Conta conta = new Conta(null, titular, saldo);

        dao.inserirConta(conta);
    }
}
