import java.util.Scanner;
public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Scanner sc = new Scanner(System.in);

        System.out.println("Código: ");
        pessoa.setCodigo(sc.nextInt());
        //pessoa.codigo = sc.nextInt();

        System.out.println("Nome: ");
        pessoa.setNome(sc.next());
        //pessoa.nome = sc.next();

        System.out.println("Altura: ");
        pessoa.setAltura(sc.nextDouble());
        //pessoa.altura = sc.nextDouble();

        System.out.println("Peso:");
        pessoa.setPeso(sc.nextDouble());
        //pessoa.peso = sc. nextDouble();

        System.out.println(pessoa.getNome() + " está " + pessoa.resultado());
    }
}
