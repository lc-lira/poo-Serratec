import java.util.Scanner;

public class TesteProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        

        System.out.println("Digite o codigo: ");
        int codigo = sc.nextInt();
        
        System.out.println("Digite o nome do produto: ");
        String nome = sc.next();
        
        System.out.println("Digite o preço: ");
        double preco = sc.nextDouble();

        Produto produto = new Produto(codigo, nome, preco);

        System.out.println("O código do produto é: " + produto.getCodigo());
        System.out.println("O produto vendido foi: " + produto.getNome());
        System.out.println("O preço foi: " + produto.getPreco());
        //Nova forma de entrada de dados usando o construtor

    }
}
