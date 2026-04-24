package br.com.serratec.conexao;

import java.util.Scanner;


import br.com.serratec.persistence.ContaDao;

public class TesteSaque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ContaDao dao = new ContaDao();

        System.out.println("Digite o número da conta:");
        Integer numero_conta = sc.nextInt();

        System.out.println("Digite o valor do saque: ");
        Double valor = sc.nextDouble();


        dao.saque(numero_conta, valor);
    }
}
