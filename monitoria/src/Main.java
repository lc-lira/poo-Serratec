import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome:");
        String nome = sc.next();

        System.out.println("Digite o CPF:");
        String cpf = sc.next();

        Usuario usuario = new Usuario(nome, cpf);

        
    }
}
