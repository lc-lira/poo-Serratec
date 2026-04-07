import java.util.Scanner;

public class TesteConta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta conta = new Conta();

        //inferencia 
        //var conta2 = new Conta();
        //var texto =  "Aula";
        int opcao;
        do{
            System.out.println("Digite o número da conta: ");
            //conta.numero = 123;
            int num = sc.nextInt();
            conta.numero = num;
        
            System.out.println("Digite o seu nome: ");
            //conta.titular = "Maria";
            String nome = sc.next();
            conta.titular = nome;
        
            conta.saldo = 1000;
            System.out.println("Digite o valor do depósito: ");
            //conta.depositar(1000);
            double valor = sc.nextDouble();
            conta.depositar(valor);
        

            System.out.println("Digite o valor do saque:");
            valor = sc.nextDouble();
        

            if (conta.saque(valor)) {
            System.out.println("Saque efetuado");
            } else {
            System.out.println("Saque não efetuado");
            }
            System.out.println("Saldo atual:" + conta.saldo);

            System.out.println("Digite qualquer número para reiniciar o processo ou 0 para sair: ");
            opcao = sc.nextInt();
        }while(opcao != 0);
        
        System.out.println("Fim do Programa!");
        

    }
}