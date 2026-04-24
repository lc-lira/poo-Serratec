import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteCliente {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int id;

        try {
            do {
                System.out.println("Digite seu ID: ");
                id = sc.nextInt();
                if(id < 0){
                    throw new ClienteException("ID negativo! Encerrando programa!");
                }

                System.out.println("Digite seu nome: ");
                String nome = sc.next();

                System.out.println("Digite sua idade: ");
                int idade = sc.nextInt();

                System.out.println("Digite seu numero de telefone");
                String telefone = sc.next();

                clientes.add(new Cliente(id, nome, idade, telefone));

            } while (id > 0);

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }finally{
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }
        }

    }
}
